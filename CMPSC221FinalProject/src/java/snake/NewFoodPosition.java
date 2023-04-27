/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

/**
 *
 * @author napier
 */
public class NewFoodPosition extends SnakePanel {
    SnakePanel test = new SnakePanel();
    SnakePanel.foodX = random.nextInt((int) (S_Width / Game_unit_size)) * Game_unit_size;
        foodY = random.nextInt((int) (S_Height / Game_unit_size)) * Game_unit_size;
    
}
