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
public class Momentum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        double mass, velocity, momentum;
        mass=r.readDouble("Enter mass of object (in kilograms): "); //cool
        velocity=r.readDouble("Enter velocity of object (in meters per second): ");
        momentum=mass*velocity;
        System.out.println("Momentum = " + momentum + " N/s");
    }
    
}
