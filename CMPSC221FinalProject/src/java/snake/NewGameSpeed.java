/**
 * CMPSC 221 Final Project
 * NewGameSpeed.java
 * Purpose: convert the string speed into a int
 *
 * @author Tristan Napier
 * @version 1.0 5/1/23
 */
package snake;

public class NewGameSpeed {

    //variable
    int newGameSpeed;

    /**
     * convert the string speed into a int
     *
     * @param str game speed in fast, medium or slow
     * @return int game speed
     */
    public int getGameSpeed(String str) {
        switch (str.toLowerCase()) {
            case "slow":
                newGameSpeed = 150;
                break;
            case "medium":
                newGameSpeed = 100;
                break;
            case "fast":
                newGameSpeed = 50;
                break;
        }
        return newGameSpeed;
    }

}
