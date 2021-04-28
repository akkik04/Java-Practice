package waterlooshiftysumproblem;

//importing the scanner object.
import java.util.Scanner;

/**
 *
 * AKSHITH KANDIVANAM
 */
public class WaterlooShiftySumProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);
        
        // declaring variables to store various values.
        int N = kp.nextInt();
        int num_of_shifts = kp.nextInt();
        int sum = 0;
        sum = sum + N;
        
        // for-loop to iterate for the num_of_shifts that the user entered to calculate the shifty sum.
        for (int i = 0; i < num_of_shifts; i++){
            
            // algorithm to determine the sum of the shifts.
            N = N * 10;
            sum = sum + N;
        }
        
        // code to print out the sum of the total shifts.
        System.out.println(sum);
    }
    
}
