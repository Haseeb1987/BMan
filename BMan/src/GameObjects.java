import java.io.*;
/*
 * GameObjects.java
 *
 * Created on December 2, 2007, 7:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Anzar A
 */
public class GameObjects implements Serializable{
    int x,y;
    int h,w;
    int type;
    
    /** Creates a new instance of GameObjects */
    public GameObjects(int xx, int yy, int hh, int ww, int t) {
        x=xx;
        y=yy;
        h=hh;
        w=ww;
        type=t;    // 0=solid,  1=fragile, 2=empty
    }
    
}
