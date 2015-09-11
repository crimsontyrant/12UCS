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
public class PizzaCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double price;
        int top, size;
        size=r.readInt("How big is your pizza? (inches): "); //cool
        top=r.readInt("How many topping? : ");
        price = 1.50 + 0.75 + ((double)top * 0.75) + ((double)size * 0.50);
        System.out.println("Labor: $1.50\nUtilities: $0.75\nToppings: " + formatter.format(((double)top * 0.75)) + "\nSize cost: " + formatter.format(((double)size * 0.50)) + "\n\nTotal: " + formatter.format(price));
    }
    
}
