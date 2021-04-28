package stringvowelsprogram;

// importing the scanner class.
import java.util.Scanner;

/**
 *
 * AKSHITH KANDIVANAM
 */

public class StringVowelsProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);
        
        // declaring variables to store various values.
        String phrase = kp.nextLine();
        int vowels = 0;
        
        // code to print the instructions to the user.
        System.out.println("Please enter a phrase without any capital letters:");
                
        System.out.println(" ");
                   
        // creating a for-loop to iterate through the length of the string (phrase).
        for (int i = 0; i < phrase.length(); i++){
                    
            // creating an if-statement to check if the string contains any of the vowels and add it to our list.
            if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i'
                    || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u'){
            
                vowels++;
            }
            
        }
        
        // code to print out the final output which indicates the amount of vowels in the phrase.
        System.out.println("There are " + vowels + " vowels in this phrase");
    }
    
}
