package quadratics.console.practice;

// importing scanner object.
import java.util.Scanner;

/**
 *
 * AKSHITH KANDIVANAM
 */
public class QuadraticsConsolePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instantiating the scanner object.
        Scanner kp = new Scanner(System.in);
        
        // printing the welcome message and instructions to the user.
        System.out.println("WELCOME TO THE QUADRATICS PROGRAM");
        System.out.println("To calculate the roots, please enter the A, B, and C values of the standard quadratic equation");
        
        // declaring variables to store values corresponding to the quadratic equation.
        double varA = 0;
        double varB = 0;
        double varC = 0;
        double root1;
        double root2;
        double discriminant;
        
                
        System.out.println(" ");
        
        // code to prompt the user to enter the appropriate values for a quadratic equation.
        System.out.print("Please enter the A value: ");
        varA = kp.nextDouble();
        System.out.print("Please enter the B value: ");
        varB = kp.nextDouble();
        System.out.print("Please enter the C value: ");
        varC = kp.nextDouble();
        
        // arithmetic calculation to determine the value of the discriminant.
        discriminant = varB * varB - 4 * varA * varC;
        
        // series of if-statements to determine the roots of the equation.
        if (discriminant > 0){
            
           root1 = (-varB + Math.sqrt(discriminant)) / (2 * varA);
           root2 = (-varB - Math.sqrt(discriminant)) / (2 * varA);
           
           
            
            System.out.println("The roots of this quadratic equation are " + root1 + "and " + root2);
        }
        
        else if (discriminant == 0){
            
            root1 = root2 = -varB / (2 * varA);
           
            System.out.println("The roots of this quadratic equation are " + root1 + "and " + root2);
        }
        
        else if (discriminant < 0){
            
            System.out.println("There are no real roots for this quadratic equation");
        }
        
    }
    
}

