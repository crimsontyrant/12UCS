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
public class Divide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        int n1, n2;
        n1 = r.readInt("Enter your first number: ");
        n2 = r.readInt("Enter your second number: ");
        if(n1>=n2){
            System.out.println(n1 + " Divided By " + n2 + " = " + "Quotient: " + (n1/n2) + " Remainder: " + (n1%n2));
        }
        else{
            System.out.println(n2 + " Divided By " + n1 + " = " + "Quotient: " + (n2/n1) + " Remainder: " + (n2%n1));
        }
    }
    
}
