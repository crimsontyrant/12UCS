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
public class Lucky7 {
    static int money, max, roll, maxroll;
    public static void main(String[] args) {
        Dice die1 = new Dice();
        Dice die2 = new Dice();
        KeyboardReader k = new KeyboardReader();
        money=k.readInt("How much money do you have? ");
        max=money;
        do{
            if(die1.getRoll()+die2.getRoll() == 7)money+=4;
            else money--;
            roll++;
            if (money>max){
                max=money;
                maxroll = roll;
            }
        }while (money>0);
        System.out.println("You are broke after " + roll + " rolls.");
        System.out.println("You should have quit after " + maxroll + " rolls with " + max + " dollars.");
    }
    
}
