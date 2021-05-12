package netforceonobject;

// importing the java scanner class. 
import java.util.Scanner;

/**
 *
 * AKSHITH KANDIVANAM
 */
public class NetForceonObject {

    /**
     * @param args the command line arguments
     */
    
    // subroutine for calculating the value of the net force.
    public static double CalcNetForce (double mass, double acceleration){
        
        // declaring and initializing a variable as a double to store the value for the net force.
        double netForce = mass * acceleration;
        
        // rounding the value of the net force.
        netForce = netForce * 100.0;
        netForce = Math.round(netForce);
        netForce = netForce / 100.0;
        
        // returning the value of the net force back to the main method.
        return(netForce);
        
    }
    
    // MAIN.
    public static void main(String[] args) {
                
        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);
        
        // creating variables to store various values and inputted values.
        double answer;
        
        System.out.print("Enter the mass of the object in kilograms please: ");
        double mass = kp.nextDouble();
        
        System.out.print("Enter the acceleration of the object in m/s^2 please: ");
        double acceleration = kp.nextDouble();
                
        answer = CalcNetForce(mass, acceleration);
    
        System.out.println(" ");
        System.out.println("The net force acting on the object is: " + answer + " N");
    
    }
    
}