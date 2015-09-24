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
public class EmployeePay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        int hours[] = new int[5]; int othours[] = new int[5]; int thours[] = new int[5];
        double pay[] = new double[5];double otpay[] = new double[5];double fpay[] = new double[5];
        for (int i = 0; i < 5; i++) {
            while(true){
                hours[i]=r.readInt("\nEnter hours for employee " + (i+1) + ": ");
                if(hours[i]>=1 && hours[i]<=70)break;
            }
            if(hours[i]>40){
                othours[i]=(hours[i]-40);
                thours[i]=hours[i];
                hours[i]=40;
            }
            else othours[i]=0;
            pay[i]=(int)hours[i]*15;
            otpay[i]=(int)othours[i]*22.5;
            fpay[i]=pay[i]+otpay[i];
            System.out.println("\nEmployee " + (i+1) + " made " + formatter.format(pay[i]) + " for " + hours[i] + " hours of $15/h(regular time).");
            if(othours[i]>0){
                System.out.println("\nThey also made " + formatter.format(otpay[i]) + " for " + othours[i] + "hours of $22.50/h(time and a half).");
                System.out.println("\nEmployee " + (i+1) + " made a total of " + formatter.format(fpay[i]) + " for " + thours[i] + " total hours.");
            }
        }
        System.out.println("\n\t\tHOURS\tOT HOURS\tTOTAL HOURS\tPAY\tOT PAY\tTOTAL PAY");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEMPLOYEE 1\t" + hours[i] + "\t" + othours[i] + "\t\t" + thours[i] + "\t\t" + formatter.format(pay[i]) + "\t" + formatter.format(otpay[i]) + "\t" + formatter.format(fpay[i]));
        }
    }
    
}
