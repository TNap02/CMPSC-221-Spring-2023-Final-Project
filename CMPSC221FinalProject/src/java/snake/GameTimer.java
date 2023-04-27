/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author napier
 */
public class GameTimer {
    
    Instant start;
    Instant finish;
    
    public void startTimer(){
        start = Instant.now();
    }
    
    public void stopTimer(){
        finish = Instant.now();
    }
    
    public long getTimeElapsed(){
        //returns time in seconds
        return Duration.between(start, finish).toSeconds();
    }
}
