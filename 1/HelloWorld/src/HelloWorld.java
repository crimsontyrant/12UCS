/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nico5370
 */
import hsa.*;
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Console c = new Console();
        for (int i = 0; i < 10000; i++) {
            c.print("Hello World!");
        }
        c.print("\nHow old? ");
        int age;
        age=c.readInt();
        c.print("\nNext year you will be " + (age+1) + " years old.");
        
    }
    
}
