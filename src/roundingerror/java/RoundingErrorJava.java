/*
 * Blake Hadaway
 * September 7th, 2018
 * To explore the rounding function in netbeans 
 */

package roundingerror.java;
import javax.swing.*;
/**
 *
 * @author blhad3491
 */
public class RoundingErrorJava {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
String titlestring = JOptionPane.showInputDialog("Please Insert Number To Be Squared");
    double number = Double.parseDouble(titlestring);
    double SqRtNum = Math.pow(Math.sqrt(number),2);
    JOptionPane.showMessageDialog(null,"The number you squared and squarerooted was"+" " +number + 
            "\nThe product of that equation is"+ " "+SqRtNum);
    
    }
    
}
