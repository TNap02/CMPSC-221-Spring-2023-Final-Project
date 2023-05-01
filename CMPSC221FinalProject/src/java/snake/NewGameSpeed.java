/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

/**
 *
 * @author napier
 */
public class NewGameSpeed {

    int newGameSpeed;

    public int getGameSpeed(String str) {
        switch (str.toLowerCase()) {

            //green red blue yellow, slow medium fast, black gray white
            case "slow":
                newGameSpeed = 50;
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
