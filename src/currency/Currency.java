package currency;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author Tomeu
 */
public class Currency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length != 3) {
            System.out.println("Usage: java Currency <number> <CODE ORIGIN> <CODE CONVERT>");
            System.exit(1);
        }
        // Codes
        String[] codes = new String[] {"EUR", "USD", "GBP", "RMB"};

        if (!Arrays.asList(codes).contains(args[1])) {
            System.out.println("Error: Unknown currency code: " + args[1]);
            System.exit(1);
        }
        if (!Arrays.asList(codes).contains(args[2])) {
            System.out.println("Error: Unknown currency code: " + args[2]);
            System.exit(2);
        }
        if (args[1] == args[2]) {
            System.out.println("Error: Both currency codes are the same!");
            System.exit(3);
        }
        
        // Convert
        DecimalFormat df = new DecimalFormat("#.##");
       System.out.println(args[0] + " " + args[1] + " = " + df.format(Double.parseDouble(args[0]) * MoneyType.valueOf(args[2]).am / MoneyType.valueOf(args[1]).am)
               + " " + args[2]);
       
   
    }
        //Enum
       public enum MoneyType {
           USD(1), RMB(6.13), EUR(0.78), GBP(0.67);
           
           public double am;
           MoneyType (double am) {
               this.am = am;
           }
       }
}
