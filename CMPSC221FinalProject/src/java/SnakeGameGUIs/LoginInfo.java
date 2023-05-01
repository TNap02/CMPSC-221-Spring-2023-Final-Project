/**
* CMPSC 221 Program #5
 * LoginInfo.java
 * Sets the variables for the login information
 *
 * @author Logan Simbeck
 * @version 1.0 4/27/2023
 */

package SnakeGameGUIs;

public class LoginInfo {
    
    public static String username = "";
    public static String password = "";

    public LoginInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
