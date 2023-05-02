/**
* CMPSC 221 Program #5
 * LoginCreateAccount.java
 * Uses the DBCLass to return if the login or create account was successful
 *
 * @author Logan Simbeck
 * @version 1.0 5/1/2023
 */

package Model;

import SnakeGameGUIs.LoginInfo;


public class LoginCreateAccount {
    DatabaseClass DB = new DatabaseClass();
    
    
    /**
     * 
     * @return weather the login was successful or not
     */
   public String loginSuccessful() {
       if (DB.pullLogin(LoginInfo.username, LoginInfo.password) == true) {
           return "Login Successful";
        }
       else {
           return "Invalid Credentials";
    
        }
    }
   
   /**
    * 
    * @return weather creating the account was successful or not
    */
   public String createAccountSuccess() {
        if (DB.pullLogin(LoginInfo.username, LoginInfo.password) == true) {
           return "Account already Created";
        }
        else {
            return "Success";
        }
   }
}
