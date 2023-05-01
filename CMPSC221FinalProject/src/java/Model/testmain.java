/**
 * CMPSC 221 Final Project Team 2 2023
 * Student Records.java
 * Purpose: Interface with student record database and display all data
 * 
 * @author Codey Solomon
 * @verson 1.0 2/28/23
 */
package Model;

/**
 *
 * @author codeysolomon
 */
public class testmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DatabaseClass newTest = new DatabaseClass();
        
        String user ="CodeyS";
        String pass ="cts54";
        
        System.out.println(user);
        
        System.out.println(newTest.pullLogin(user,pass));
        newTest.topTenLeaderboard();
        
       int score = 23;
       int time = 24;
               
        
        newTest.pushInfo(user,pass,score, time);
        
    }
    
}
