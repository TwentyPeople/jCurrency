/*
 * jCurrency - Java Currency Converter
 * Made under the authority of TwentyPeople Europe.
 * Distributed by TwentyPeople Internet, through GitHub/unrar.
 * This program is open-source under the TwentyPeople Open License.
 * LICENSE (READ BEFORE EDITING!):
 * You're free to freely use, share and modify this program.
 * All the modifications done to this program:
 * - CAN BE freely used by the author of the modifications.
 * - CAN'T BE uploaded anywhere without the permission of TwentyPeople Europe.
 * - CAN BE uploaded to GitHub/unrar/Currency (Pull Request).
 * - CAN BE uploaded ANYWHERE if it's uploaded to GitHub/unrar/Currency.
 * For further information, visit our website (http://twentypeopleeurope.blogspot.com)
 * or e-mail us (alexskyandco@gmail.com).
 * 
 */
package currency;
import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author Alexander Sky
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
        if (!codeExists(args[1])) {
            System.out.println("Error: Unknown currency code: " + args[1]);
            System.exit(1);
        }
        if (!codeExists(args[2])) {
            System.out.println("Error: Unknown currency code: " + args[2]);
            System.exit(2);
        }
        if (args[1] == args[2]) {
            System.out.println("Error: Both currency codes are the same!");
            System.exit(3);
        }
        
        // Convert
        DecimalFormat df = new DecimalFormat("#.##");
       System.out.println(args[0] + " " + args[1] + " = " + df.format(Double.parseDouble(args[0]) * Currency.MoneyType.valueOf(args[2]).am / Currency.MoneyType.valueOf(args[1]).am)
               + " " + args[2]);
       
   
    }
    
    //Enum
    // Last update: 08/Jul./2013
    // Last codes added: CAD, AUD, JPY
    // Last update made by: Alexander Sky @ TwentyPeople Europe
    
    public enum MoneyType {
        USD(1), RMB(6.13), EUR(0.78), GBP(0.67),
        CAD(1.05), AUD(1.10), JPY(101.31);
        public double am;
        MoneyType (double am) {
            this.am = am;
        }
    }
    
    // Function to see if it's in the enum
    public static boolean codeExists(String check) {

        for (MoneyType c : MoneyType.values()) {
            if (c.name().equals(check)) {
                return true;
            }
        }
        return false;
    }
}
