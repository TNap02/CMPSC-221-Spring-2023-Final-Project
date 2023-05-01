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

    public SettingInfo(String snakeColor, String snakeSpeed, String backgroundColor, String appleColor) {
        this.snakeColor = snakeColor;
        this.snakeSpeed = snakeSpeed;
        this.backgroundColor = backgroundColor;
        this.appleColor = appleColor;
    }

    public String getSnakeColor() {
        return snakeColor;
    }

    public String getSnakeSpeed() {
        return snakeSpeed;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getAppleColor() {
        return appleColor;
    }
    
    
            
    
}
