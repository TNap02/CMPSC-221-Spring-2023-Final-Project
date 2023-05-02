/**
 * CMPSC 221 Final Project
 * NewColor.java
 * Purpose: Turn the color string into a color object
 *
 * @author Tristan Napier
 * @version 1.0 5/1/23
 */
package snake;

import java.awt.Color;

public class NewColor {

    //variable
    Color newColor;

    /**
     * Turn the color string into a color object
     *
     * @param col color in string
     * @return color in Color object
     */
    public Color getColor(String col) {
        switch (col.toLowerCase()) {
            case "black":
                newColor = Color.BLACK;
                break;
            case "blue":
                newColor = Color.BLUE;
                break;
            case "gray":
                newColor = Color.GRAY;
                break;
            case "green":
                newColor = Color.GREEN;
                break;
            case "yellow":
                newColor = Color.YELLOW;
                break;
            case "red":
                newColor = Color.RED;
                break;
            case "white":
                newColor = Color.WHITE;
                break;
        }
        return newColor;
    }

}
