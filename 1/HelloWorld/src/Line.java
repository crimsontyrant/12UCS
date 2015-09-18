/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import TurtleGraphics.*;
import TerminalIO.*;
/**
 *
 * @author nico5370
 */
public class Line {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KeyboardReader r = new KeyboardReader();
        SketchPadWindow win = new SketchPadWindow(400,400);
        int x[] = new int [2];
        int y[] = new int [2];
        Pen p = new StandardPen(win);
        p.setWidth(2);
        for (int i = 0; i < 2; i++) {
                x[i]=r.readInt("Enter the value for X" + (i+1) + ": ");
                y[i]=r.readInt("Enter the value for Y" + (i+1) + ": ");
            }
        p.up();
        p.move((x[0]-200), (y[0]-200));
        p.down();
        p.drawString("(" + x[0] + "," + y[0] + ")");
        p.move((x[1]-200), (y[1]-200));
        p.drawString("(" + x[1] + "," + y[1] + ")");
        
       
    }
    
}
