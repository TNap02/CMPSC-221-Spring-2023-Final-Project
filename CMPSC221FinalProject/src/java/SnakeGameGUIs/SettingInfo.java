/**
* CMPSC 221 Program #5
 * SettingInfo.java
 * Sets the variables for the game settings
 *
 * @author Logan Simbeck
 * @version 1.0 4/27/2023
 */

package SnakeGameGUIs;

public class SettingInfo {
    
    public static String snakeColor = "Green";
    public static String snakeSpeed = "Slow";
    public static String backgroundColor = "Black";
    public static String appleColor = "Red";

    /**
     * constructor for the different game settings
     * @param snakeColor
     * @param snakeSpeed
     * @param backgroundColor
     * @param appleColor 
     */
    public SettingInfo(String snakeColor, String snakeSpeed, String backgroundColor, String appleColor) {
        this.snakeColor = snakeColor;
        this.snakeSpeed = snakeSpeed;
        this.backgroundColor = backgroundColor;
        this.appleColor = appleColor;
    }
/**
 * get method
 * @return color of the snake
 */
    public String getSnakeColor() {
        return snakeColor;
    }
    
    /**
     * get method
     * @return speed of the snake
     */
    public String getSnakeSpeed() {
        return snakeSpeed;
    }

    /**
     * get method
     * @return background color
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * get method
     * @return the apple color
     */
    public String getAppleColor() {
        return appleColor;
    }
    
    
            
    
}
