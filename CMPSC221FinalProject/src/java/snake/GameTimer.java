/**
 * CMPSC 221 Final Project
 * GameTimer.java
 * Purpose: Stopwatch to keep track of how long the game is running for
 *
 * @author Tristan Napier
 * @version 1.0 4/29/23
 */
package snake;

import java.time.Duration;
import java.time.Instant;

public class GameTimer {

    Instant start;
    Instant finish;

    public void startTimer() {
        start = Instant.now();
    }

    public void stopTimer() {
        finish = Instant.now();
    }

    public long getTimeElapsed() {
        //returns time in seconds
        return Duration.between(start, finish).toSeconds();
    }
}
