package waterloosilentauctionproblem;

// importing the scanner object.
import java.util.Scanner;


/**
 *
 * AKSHITH KANDIVANAM
 */
public class WaterlooSilentAuctionProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);
        
        // declaring variables to store various values.
        int numOfBids = Integer.parseInt(kp.nextLine());
        int highestBid = 0;
        int bidPrice = 0;
        String name = "";
        String winner = "";
                
        // for-loop to iterate for the number of bids.
        for(int i = 0; i < numOfBids; i++) {
            
            name = kp.nextLine();
            bidPrice = Integer.parseInt(kp.nextLine());
            
                // nested if-statement to apply the name of the person as the winner if their bid price is higher than the highest bid before.
                if(bidPrice > highestBid) {
                        highestBid = bidPrice;
                        winner = name;
                }
        }
        
        // code to print out the winner of the silent auction.
        System.out.println(winner);
     
    }
    
}
