import java.io.*;
/*
 * BMan.java
 *
 * Created on December 2, 2007, 7:06 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Anzar A
 */
public class BMan implements Serializable{
    //////////////members//////////////////////////////////////////////////////
    public int x,y;
    public int bx,by;    // Block index i,j in which bomber man is residing
    public int speed;
    public int bombLimit;
    public int currBombs;
    public int life;
    //////////////////////utilities////////////////////////////////////////////
    String imageName;
    String dir;
    char direction;   // u, d, l, r
    int score;
    int range;
    int kick;
    
    /** Creates a new instance of BMan */
    public BMan(int xx, int yy, String n, int i, int j, int sp, int bl, int l) {
        x=xx;
        y=yy;
        imageName=n;
        bx=i;
        by=j;
        speed = sp;
        bombLimit = bl;
        currBombs = 0;
        life = l;
        String[] temp = imageName.split("/");
        dir = temp[0]+"/"+temp[1]+"/";
        direction = 'd';
        score = 0;
        range = 1;
        kick =  0;
    }    
}
