/**
 * CMPSC 221 Final Project Team 2 2023
 * ScoreMethods.java
 * Purpose: Communicate with database class to set the score and time for the logged in user
 * 
 * @author Codey Solomon
 * @verson 1.0 4/28/23
 */
package Model;

public class ScoreMethods {
    //Creates a database class object
    DatabaseClass dataBot = new DatabaseClass();
   
    //Establishes variables
    public String score = "";
    public String time = "";
    
    //Pulls and sets the time and score for the logged in user
    public void setScoreAndTime(){
        
        String returnVal = dataBot.recentScoreAndTime();
        String [] arrReturnVal = returnVal.split(" ");
        
        this.score = arrReturnVal[0];
        this.time = arrReturnVal[1];
         
    }

    //Returns the users score
    public String getScore() {
        return score;
    }

    //Returns the time score
    public String getTime() {
        return time;
    }
    
    
    
    
    
   

    
}
