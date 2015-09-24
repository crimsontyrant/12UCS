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
public class TeacherSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double sal = 40000, salold = 0;
        System.out.println("YEAR\tOLD SALARY\tRAISE\t\tNEW SALARY");
        System.out.println("----\t----------\t-----\t\t----------");
        System.out.println("1\t---\t\t$40,000\t\t$40,000");
        for (int i = 0; i < 9; i++) {
            salold=sal;
            sal*=1.03;
            System.out.println((i+2) + "\t" + formatter.format(salold) + "\t" + formatter.format((salold*0.03)) + "\t" + formatter.format(sal));
        }
    }
    
}
