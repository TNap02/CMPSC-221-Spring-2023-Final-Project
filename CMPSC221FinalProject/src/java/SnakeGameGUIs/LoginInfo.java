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

    /**
     * constructor for the login information
     * @param username
     * @param password 
     */
    public LoginInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
    /**
     * get method for the username
     * @return username
     */
    public static String getUsername() {
        return username;
    }

    /**
     * get method for the password
     * @return the password
     */
    public static String getPassword() {
        return password;
    }
}
