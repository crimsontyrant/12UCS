/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import TurtleGraphics.*;
/**
 *
 * @author nico5370
 */
public class day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SketchPadWindow win = new SketchPadWindow(600,400);
        Pen p = new WiggleRainbowPen(win);
        p.setWidth(20);
        for (int i = 0; i < 8; i++) {
                p.move(100);
                p.turn(45);
            }
        
       
    }
    
}
