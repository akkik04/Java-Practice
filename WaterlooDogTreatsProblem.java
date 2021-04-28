package waterloodogtreatsproblem;

// code to import scanner object.
import java.util.Scanner;

/**
 *
 * AKSHITH KANDIVANAM
 */
public class WaterlooDogTreatsProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instantiating the scanner object.
        Scanner keyedInput = new Scanner(System.in);
        
        // creating variables to store various values for the program.
        double SMALL_TREATS;
        double MEDIUM_TREATS;
        double LARGE_TREATS;
        double DETERMINANT;
        
        // series of statements to print instructions to the user regarding the input.
        System.out.println("Please enter the number of small treats that Barley recieved:");
        SMALL_TREATS = keyedInput.nextDouble();
        System.out.println(" ");
        
        System.out.println("Please enter the number of medium treats that Barley recieved:");
        MEDIUM_TREATS = keyedInput.nextDouble();
        
        System.out.println(" ");
        System.out.println("Please enter the number of large treats that Barley recieved:");
        LARGE_TREATS = keyedInput.nextDouble();
        
        System.out.println(" ");
        
       // arithmetic calculation to determine if the puppy is happy or sad.
       DETERMINANT = (1 * SMALL_TREATS) + (2 * MEDIUM_TREATS) + (3 * LARGE_TREATS);
       
       // if-statement to determine if the output displays happy or sad depending on the algorithm.
       if (DETERMINANT >= 10){
           System.out.println("Barley is happy");
       }
       
       else {
           
           System.out.println("Barley is sad");
           
            } 
                
         }
    
    }
