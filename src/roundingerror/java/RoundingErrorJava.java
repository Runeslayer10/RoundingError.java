/*
 * Blake Hadaway
 * September 7th, 2018
 * To explore the rounding function in netbeans 
 */

package roundingerror.java;
import javax.swing.*; // allows me to use JOptionPane
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
String titlestring = JOptionPane.showInputDialog("Please Insert Number To Be Squared"); // string variable for the user to have somewhere to input there data
    double number = Double.parseDouble(titlestring); // this is making it so that the user can insert numbers.
    double SqRtNum = Math.pow(Math.sqrt(number),2); // The user inputs a number to be squarerooted and then squared
    JOptionPane.showMessageDialog(null,"The number you squaredrooted and then squared was"+" " +number + 
            "\nThe product of that equation is"+ " "+SqRtNum); // Displaying the text after user inserts data
        
    
    }
    
}
