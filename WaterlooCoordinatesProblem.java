package waterloocoordinatesproblem;

// importing the scanner object.
import java.util.Scanner;

/**
 *
 * AKSHITH KANDIVANAM
 */
public class WaterlooCoordinatesProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);
        
        // declaring variables to store the values for each coordinate.
        int coordinate1 = kp.nextInt();
        int coordinate2 = kp.nextInt();
        
        // if-statements to determine which quadrant the coordinates correspond to.
        if ((coordinate1 > 0) && (coordinate2 > 0)){
            System.out.println("1");
        }
        else if ((coordinate1 < 0) && (coordinate2 > 0)){
            System.out.println("2");
        }
        else if ((coordinate1 < 0) && (coordinate2 < 0)){
            
            System.out.println("3");
        }
        else {
            System.out.println("4");
        }
    }
    
}
