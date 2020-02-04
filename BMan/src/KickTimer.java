/*
 * KickTimer.java
 *
 * Created on December 15, 2007, 9:49 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Anzar A
 */
import java.io.*;
public class KickTimer implements Runnable, Serializable{
    BMan player;
    /** Creates a new instance of KickTimer */
    public KickTimer(BMan o) {
        player = o;
    }
    
    public void run(){
        try{
            Thread.sleep(20000);
            player.kick = 0;
        }catch(Exception e){
            System.out.println(e);
        }
    }
}