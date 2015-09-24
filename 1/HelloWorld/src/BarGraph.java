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
public class BarGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KeyboardReader r = new KeyboardReader();
        SketchPadWindow win = new SketchPadWindow(400,400);
        int x = 50;
        int num[] = new int [4];
        Pen p = new StandardPen(win);
        p.setWidth(15);
        for (int i = 0; i < 4; i++) {
                while(true){
                    num[i]=r.readInt("Enter the value for Number " + (i+1) + ": ");
                    if(num[i]>=0 && num[i]<=200)break;
                }
                p.up();
                p.move((x-200), -200);
                p.down();
                p.move((x-200), (num[i]-200));
                x+=75;
            }
        
       
    }
    
}
