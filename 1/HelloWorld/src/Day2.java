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
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        int age;
        age=r.readInt("How old are you? ");
        age++;
        System.out.println("In one year you will be " + age + " years old.");
    }
    
}
