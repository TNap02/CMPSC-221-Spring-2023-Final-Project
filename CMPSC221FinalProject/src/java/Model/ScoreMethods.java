/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;


/**
 *
 * @author codeysolomon
 */
public class ScoreMethods {
    
    DatabaseClass dataBot = new DatabaseClass();
    
    public String score = "";
    public String time = "";
    
    public void setScoreAndTime(){
        
        String returnVal = dataBot.recentScoreAndTime();
        String [] arrReturnVal = returnVal.split(" ");
        
        this.score = arrReturnVal[0];
        this.time = arrReturnVal[1];
         
    }

    public String getScore() {
        return score;
    }

    public String getTime() {
        return time;
    }
    
    
    
    
    
   

    
}
