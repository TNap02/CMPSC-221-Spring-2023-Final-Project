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
    
    private String userName;
    private String passWord;

    public LoginInfo(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
}
