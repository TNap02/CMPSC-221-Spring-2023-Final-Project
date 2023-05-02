/**
 * CMPSC 221 Final Project
 * SnakePanel.java
 * Purpose: Panel which runs the snake game
 *
 * @author Tristan Napier
 * @version 1.0 4/25/23
 */
package snake;

import SnakeGameGUIs.SettingInfo;
import SnakeGameGUIs.LoginInfo;
import Model.DatabaseClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;

public class SnakePanel extends JPanel implements ActionListener {

    //variables
    //game board size
    final static int S_Width = 1200;
    final static int S_Height = 600;
    final static int Game_unit_size = 50;

    //game variables
    Timer timer;
    Random random;
    int bodylength = 2;
    int foodX;
    int foodY;

    //check if game is over
    boolean game_flag = false;
    //direction
    char dir = 'R';

    //snake size
    static final int G_Size = (S_Width * S_Height) / (Game_unit_size * Game_unit_size);
    final int x_snake[] = new int[G_Size];
    final int y_snake[] = new int[G_Size];

    //gametimer stuff
    GameTimer gameTimer = new GameTimer();

    //intro variables
    Color snakeColor = Color.GREEN;
    Color backgroundColor = Color.gray;
    Color appleColor = Color.RED;
    int gameSpeed = 100;

    //returned variables
    int timeElapsed;
    int foodEaten;

    /**
     * Constructor
     */
    SnakePanel() {
        //grabs strings from Setinginfo
        String strSnakeColor = SettingInfo.snakeColor;
        String strBackgroundColor = SettingInfo.backgroundColor;
        String strAppleColor = SettingInfo.appleColor;
        String strGameSpeed = SettingInfo.snakeSpeed;

        //opens NewColor and NewGameSpeed classes
        NewColor newCol = new NewColor();
        NewGameSpeed newGS = new NewGameSpeed();

        //sets the color of the snake, game board and apple
        setSnakeColor(newCol.getColor(strSnakeColor));
        setBackgroundColor(newCol.getColor(strBackgroundColor));
        setAppleColor(newCol.getColor(strAppleColor));
        //sets the game speed
        setGameSpeed(newGS.getGameSpeed(strGameSpeed));

        //sets size of panel
        this.setPreferredSize(new Dimension(S_Width, S_Height));
        this.setBackground(backgroundColor);
        this.setFocusable(true);
        this.addKeyListener(new MyKey());
        random = new Random();
        //starts game
        Game_start();
    }

    /**
     * Starts Game
     */
    public void Game_start() {
        //sets initial food position
        newfoodPosition();
        game_flag = true;
        timer = new Timer(gameSpeed, this);
        //starts timer
        timer.start();
        gameTimer.startTimer();
    }

    /**
     * Paints game components
     *
     * @param graphic
     */
    public void paintComponent(Graphics graphic) {
        super.paintComponent(graphic);
        draw(graphic);
    }

    //Snake speed
    //snake color, background color, apple color
    /**
     * paints board as long as game is not over
     *
     * @param graphic
     */
    public void draw(Graphics graphic) {
        if (game_flag) {
            graphic.setColor(appleColor);
            graphic.fillOval(foodX, foodY, Game_unit_size, Game_unit_size);
            for (int i = 0; i < bodylength; i++) {
                if (i == 0) {
                    graphic.setColor(snakeColor);
                    graphic.fillRect(x_snake[i], y_snake[i], Game_unit_size, Game_unit_size);
                } else {
                    graphic.setColor(snakeColor);
                    graphic.fillRect(x_snake[i], y_snake[i], Game_unit_size, Game_unit_size);
                }
            }
            //sets score marker on top
            graphic.setColor(Color.blue);
            graphic.setFont(new Font("Ink Free", Font.BOLD, 40));
            FontMetrics font_me = getFontMetrics(graphic.getFont());
            graphic.drawString("Score:" + foodEaten, (S_Width - font_me.stringWidth("Score:" + foodEaten)) / 2, graphic.getFont().getSize());
        } else {
            gameOver(graphic);
        }
    }

    /**
     * moves snake
     */
    public void move() {
        for (int i = bodylength; i > 0; i--) {
            x_snake[i] = x_snake[i - 1];
            y_snake[i] = y_snake[i - 1];
        }
        switch (dir) {
            case 'U':
                y_snake[0] = y_snake[0] - Game_unit_size;
                break;
            case 'L':
                x_snake[0] = x_snake[0] - Game_unit_size;
                break;
            case 'D':
                y_snake[0] = y_snake[0] + Game_unit_size;
                break;
            case 'R':
                x_snake[0] = x_snake[0] + Game_unit_size;
                break;
        }
    }

    /**
     * Gets a new food position
     */
    public void newfoodPosition() {// for displaying food at a random position on the screen
        foodX = random.nextInt((int) (S_Width / Game_unit_size)) * Game_unit_size;
        foodY = random.nextInt((int) (S_Height / Game_unit_size)) * Game_unit_size;
    }

    /**
     * checks if the head of the snake is on the same spot as the food
     */
    public void food_EatenOrNot() {// for checking the food has been eaten by snake or not
        if ((x_snake[0] == foodX) && (y_snake[0] == foodY)) {
            bodylength++;
            foodEaten++;
            newfoodPosition();
        }
    }

    /**
     * checks if snake hits itself or the wall
     */
    public void checkHit() {
        for (int i = bodylength; i > 0; i--) {
            if ((x_snake[0] == x_snake[i]) && (y_snake[0] == y_snake[i])) {
                game_flag = false;
            }
        }
        if (x_snake[0] < 0) {
            game_flag = false;
        }
        if (x_snake[0] > S_Width) {
            game_flag = false;
        }
        if (y_snake[0] < 0) {
            game_flag = false;
        }
        if (y_snake[0] > S_Height) {
            game_flag = false;
        }
        if (!game_flag) {
            timer.stop();
        }
    }

    /**
     * Handles the game over screen
     *
     * @param graphic
     */
    public void gameOver(Graphics graphic) {

        graphic.setColor(Color.red);
        graphic.setFont(new Font("Ink Free", Font.BOLD, 40));
        FontMetrics font_me = getFontMetrics(graphic.getFont());
        graphic.drawString("Score:" + foodEaten, (S_Width - font_me.stringWidth("Score:" + foodEaten)) / 2,
                graphic.getFont().getSize());
        graphic.setColor(Color.red);
        graphic.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics font_me2 = getFontMetrics(graphic.getFont());
        graphic.drawString("Game Over", (S_Width - font_me2.stringWidth("Game Over")) / 2,
                S_Height / 2);
        graphic.setColor(Color.red);
        graphic.setFont(new Font("Ink Free", Font.BOLD, 40));
        FontMetrics font_me3 = getFontMetrics(graphic.getFont());
        graphic.drawString("Close Window to Save Score", (S_Width - font_me3.stringWidth("Close Window to Save Score")) / 2, S_Height / 2 - 150);

        //stops timer
        gameTimer.stopTimer();
        timeElapsed = (int) gameTimer.getTimeElapsed();

        //gets login info
        String username = LoginInfo.getUsername();
        String password = LoginInfo.getPassword();
        DatabaseClass test = new DatabaseClass();
        //pushes to database
        test.pushInfo(username, password, foodEaten, timeElapsed);
    }

    /**
     * Checks what key the user presses
     */
    public class MyKey extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (dir != 'R') {
                        dir = 'L';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (dir != 'D') {
                        dir = 'U';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (dir != 'L') {
                        dir = 'R';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (dir != 'U') {
                        dir = 'D';
                    }
                    break;
                case KeyEvent.VK_R:
                    if (!game_flag) {
                        foodEaten = 0;
                        bodylength = 2;
                        dir = 'R';
                        Arrays.fill(x_snake, 0);
                        Arrays.fill(y_snake, 0);
                        Game_start();
                    }
                    break;
            }
        }
    }

    /**
     * repaints on action preformed
     *
     * @param arg0
     */
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (game_flag) {
            move();
            food_EatenOrNot();
            checkHit();
        }
        repaint();
    }

    /**
     * sets the color of the snake
     *
     * @param snakeColor
     */
    public void setSnakeColor(Color snakeColor) {
        this.snakeColor = snakeColor;
    }

    /**
     * sets the color of the background
     *
     * @param backgroundColor
     */
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * sets the color of the apple
     *
     * @param appleColor
     */
    public void setAppleColor(Color appleColor) {
        this.appleColor = appleColor;
    }

    /**
     * sets the game speed
     *
     * @param gameSpeed
     */
    public void setGameSpeed(int gameSpeed) {
        this.gameSpeed = gameSpeed;
    }

}
