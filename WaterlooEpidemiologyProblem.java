package waterlooepidemiologyproblem;

// importing the scanner object.
import java.util.Scanner;

/**
 *
 * AKSHITH KANDIVANAM
 */
public class WaterlooEpidemiologyProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instantiating the scanner object.
        Scanner keyedInput = new Scanner(System.in);
        
        // declaring variables to store inputted variables from the user.
        int time = 0;
        int P = keyedInput.nextInt();
        int N = keyedInput.nextInt();
        int R = keyedInput.nextInt();
      
        // tying variables to the inputted variables.
        int total_people = P;
        int people_infected = R;
        int num_infected_dayZERO = N;
         
        // while loop to iterate for people_infected <=P.
        while (people_infected <= P){
             
             time += 1;
             people_infected += num_infected_dayZERO * R;
             num_infected_dayZERO *= R;
             
         }
         
        // code to print out time (days).
         System.out.println(time);
        
                
        
        
        
    }
    
}
