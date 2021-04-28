package waterlooboilingwaterproblem;

// code to import scanner object.
import java.util.Scanner;
/**
 *
 * AKSHITH KANDIVANAM
 */
public class WaterlooBoilingWaterProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instantiating the scanner object.
        Scanner kp = new Scanner (System.in);
        
        // declaring variables to store values.
        int BOILING_TEMP = kp.nextInt();
        int ATMOSPHERIC_PRESSURE;
        
        // arithmetic calculation to determine the atmospheric pressure.
        ATMOSPHERIC_PRESSURE = (5 * BOILING_TEMP) - 400;
        
        // printing out the atmospheric pressure.
        System.out.println(ATMOSPHERIC_PRESSURE);
        
        // series if-statements to determine if you are above sea level, below sea level, or at sea level.
        if (ATMOSPHERIC_PRESSURE < 100){
            System.out.println("1");
        }
        
        else if (ATMOSPHERIC_PRESSURE > 100){
            
            System.out.println("-1");
        }
        
        else {
            System.out.println("0");
        }
        
    }
    
}
