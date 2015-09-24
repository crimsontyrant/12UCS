/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nico5370
 */
import TerminalIO.*;
import java.text.NumberFormat;
public class PowerChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        int n;
        while(true){
            n = r.readInt("Enter an exponent for the number 2 from 0 to 10: ");
            if(n>=0 && n<=10)break;
        }
        n++;
        //here I use 'n' to control the for loop, and 'i' for any math calculations
        for (int i = 0; i < n; i++) {
            System.out.print("2^" + i + "\t");
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print(java.lang.Math.pow(2, i) + "\t");
        }
    }
    
}
