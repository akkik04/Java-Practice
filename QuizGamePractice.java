package quizgamepractice;

// code to import scanner class.
import java.util.Scanner;

/**
 *
 * AKSHITH KANDIVANAM
 */
public class QuizGamePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // code to instantiate the scanner object.
        Scanner keyedInput = new Scanner(System.in);
       
        // declaring variables and contants to store various values.
        final double QUESTIONS = 5;
        double percentage;
        int score = 0;
        int choice = 0;
        String answerPicked;
        
        // code to print the welcome message and instructions for the game.
        System.out.println("Welcome to our Chemistry Quiz-Game, let's get started!");
        System.out.println("There will be a total of 5 questions. Type the letter corresponding to the answer that you think is correct.");
        System.out.println(" ");
        
        // code to print question 1.
        System.out.println("Question 1. What is the product when sodium and chlorine undergo a synthesis reaction?");
        System.out.println("a. Sodium (I) chloride");
        System.out.println("b. Sodium chloride");
        System.out.println("c. Sodium monochloride");
        System.out.println("d. Sodium chlorine");
        answerPicked = keyedInput.nextLine();
        
       // code to determine the right answer for question 1.
       if (answerPicked.equals("b")){
       
       System.out.println("Good Job! You picked the right answer, let's continue");
       score = score + 1;
       }
       else {
       
       System.out.println("Wrong answer, better luck next time");
       }
       
       System.out.println(" ");
       
       // code to print question 2. 
       System.out.println("Question 2. What is the atomic mass of Lithium (Li)?");
       System.out.println("a. 22.99 amu");
       System.out.println("b. 6.941 amu");
       System.out.println("c. 4.003 amu");
       System.out.println("d. 1.008 amu");
       answerPicked = keyedInput.nextLine();
       
       // code to determine the right answer for question 2.
       if (answerPicked.equals("b")){
       
       System.out.println("Good Job! You picked the right answer, let's continue");
       score = score + 1;
       }
       else {
       
       System.out.println("Wrong answer, better luck next time");
       }
       
       System.out.println(" ");
       
       // code to print question 3.
       System.out.println("Question 3. What value represents Avogadro's Constant?");
       System.out.println("a. 6.14 x 10^25");
       System.out.println("b. 1.24 x 10^0");
       System.out.println("c. 6.02 x 10^19");
       System.out.println("d. 1.08 x 10^21");
       answerPicked = keyedInput.nextLine();
       
       // code to determine the right answer for question 3.
       if (answerPicked.equals("c")){
           
       System.out.println("Good Job! You picked the right answer, let's continue");
       score = score + 1;
       }
       else {
           System.out.println("Wrong answer, better luck next time");
       }
       
       System.out.println(" ");
       
       // code to print question 4.
       System.out.println("Question 4. What is the molar mass of Chlorine (Cl)?");
       System.out.println("a. 22.56 g/mol");
       System.out.println("b. 35.45 g/mol");
       System.out.println("c. 65.85 g/mol");
       System.out.println("d. 30.97 g/nol");
       answerPicked = keyedInput.nextLine();
       
       // code to determine the right answer for question 4.
       if (answerPicked.equals("b")){
           System.out.println("Good Job! You picked the right answer, let's continue");
           score = score + 1;
       }
       else {
           System.out.println("Wrong answer, better luck next time");
       }
       
       System.out.println(" ");
       
       // code to print question 5.
       System.out.println("Question 5. What is the chemical formula of methane gas?");
       System.out.println("a. CO2");
       System.out.println("b. HgO");
       System.out.println("c. CH4");
       System.out.println("d. NaCl");
       answerPicked = keyedInput.nextLine();
       
       // code to determine the right answer for question 5.
       if (answerPicked.equals("c")){
           System.out.println("Good Job! You picked the right answer.");
           score = score + 1;
       }
       else {
           System.out.println("Wrong answer, better luck next time");
       }
       
       System.out.println(" ");
       
       // code for the arithmetic calculation to determine the percentage that the user scored.
       percentage = score / QUESTIONS * 100.0;
       percentage = Math.round(percentage);
       
       // code to print the final output line which indicates the percentage that the user scored.
       System.out.println("You scored a percentange of: " + percentage + "%");
             
    }
    
}