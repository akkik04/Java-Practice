
package trigonometryprogramconsolepractice;

// code to import scanner class.
import java.util.Scanner;

/**
 *
 * AKSHITH KANDIVANAM
 */
public class TrigonometryProgramConsolePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instantiating the scanner object.
        Scanner kp = new Scanner (System.in);
        
        // declaring variables to store values for the 6 ratios and the angle.
        double angle;
        double sin;
        double cos;
        double tan;
        
        char reci;
        double csc;
        double sec;
        double cot;
        
        // code to print line to user to enter an angle in degrees.
        System.out.print("Please enter the value of the angle in degrees: ");
        System.out.println(" ");
        angle = kp.nextDouble();
        
        // arithmetic calculation to determine the primary trig ratios for angle with rounding.
        sin = Math.sin(angle * Math.PI/180);
        sin = Math.round(sin * 100)/ 100.00;
        
        cos = Math.cos(angle * Math.PI/180);
        cos = Math.round(cos * 100) / 100.00;
        
        tan = Math.tan(angle * Math.PI/180);
        tan = Math.round(tan * 100) / 100.00;
        
        // code to print the output line to the user which indicates the value of the primary trig ratios for the angle.        
        System.out.println("The sine of " + angle + " is " + sin);
        System.out.println(" ");
        System.out.println("The cosine of " + angle + " is " + cos);
        System.out.println(" ");       
        System.out.println("The tangent of " + angle + " is " + tan);
        System.out.println(" ");
        
        
        // code to ask the user if they would like the reciprocal ratios outputted for the same angle too.
        System.out.println("Would you like to find the reciprocal ratios of that angle too ? " + " Y for Yes, N for No");
        reci = kp.next().charAt(0);
        
        // if user input was YES :
        if (reci == 'Y'){
            
        // arithmetic calculation for the reciprocal ratios of the same angle with rounding.    
        csc = 1 / Math.sin(angle * Math.PI/180);
        csc = Math.round(csc * 100) /100.00;
        
        sec = 1 / Math.cos(angle * Math.PI/180);
        sec = Math.round(sec * 100) /100.00;
        
        cot = 1 / Math.tan(angle * Math.PI/180);
        cot = Math.round(cot * 100) / 100.00;
        
        // code to output the reciprocal ratios to the user.
        System.out.println("The cosecant of " + angle + " is " + csc);
        System.out.println(" ");
        System.out.println("The secant of " + angle + " is " + sec);
        System.out.println(" ");       
        System.out.println("The cotangent of " + angle + " is " + cot);
        System.out.println(" ");
            
            
        }
        
        // if user input was NO: 
        else {
            System.out.println(" ");
            
            // code to print a good bye message.
            System.out.println("Goodbye!, have a great day");
        }
        
    }
    
}
