/*
 * MenuPanel.java
 *
 * Created on December 15, 2007, 9:52 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Anzar A
 */
import javax.swing.*;
import java.awt.Graphics;
import java.awt.image.*;
import java.awt.image.BufferedImage.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.*;
import java.awt.Color;
import java.awt.Font;
public class MenuPanel extends JPanel implements Serializable{
    String map;
    Font f;
    
    public MenuPanel() {
        map = "Map 1";
        f = new Font("mf", 1, 30);
    }
    
    public void paintComponent(Graphics g){ 
       g.drawImage(ImageCtrl.bg1, 0, 0, 1000, 800, null);
       if(map != null){
           if(map.equals("Map 1")){
               g.setFont(f);
               g.setColor(Color.BLACK);
               g.fillRect(150, 70, 700, 690);
               g.setColor(Color.WHITE);
               g.drawString("Map 1", 470, 110);
               g.drawImage(ImageCtrl.map1Img, 200, 150, 600, 600, null);
           }
           else if(map.equals("Map 2")){
               g.setFont(f);
               g.setColor(Color.BLACK);
               g.fillRect(150, 70, 700, 690);
               g.setColor(Color.WHITE);
               g.drawString("Map 2", 470, 110);
               g.drawImage(ImageCtrl.map2Img, 200, 150, 600, 600, null);
           }
       }    
    }
}
