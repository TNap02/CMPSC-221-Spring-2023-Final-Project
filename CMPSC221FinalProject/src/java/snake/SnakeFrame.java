/**
 * CMPSC 221 Final Project
 * SnakeFrame.java
 * Purpose: Draw the frame the snake is in
 *
 * @author Tristan Napier
 * @version 1.0 4/25/23
 */

package snake;
import javax.swing.JFrame;

public class  SnakeFrame extends JFrame {
    SnakeFrame(){
        this.add(new SnakePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
}