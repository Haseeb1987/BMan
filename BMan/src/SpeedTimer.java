/*
 * SpeedTimer.java
 *
 * Created on December 15, 2007, 10:06 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Anzar A
 */
import java.io.*;
public class SpeedTimer implements Runnable, Serializable{
    
    BMan player;
    /** Creates a new instance of SpeedTimer */
    public SpeedTimer(BMan o) {
        player = o;
    }
    /**
     * Implemented method of Runnable Interface.
     * This thread is created when a speed timer is picked.
     * After 20 seconds, it decreases the speed of BMan, which was increased by picking the value pack.
     */
    public void run(){
        try{
            Thread.sleep(20000);
            player.speed = 2;
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
