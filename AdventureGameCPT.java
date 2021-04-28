
// ADVENTURE GAME CPT
package adventuregamecpt;


// code to import scanner and random class.
import java.util.Random;
import java.util.Scanner;

/** CODING DONE BY: Akshith Kandivanam
 *  Mr.Martins
 *  ICS-3U1
 *  2021-01-13
 *  Adventure Game CPT
 */

public class AdventureGameCPT {
    
    // SUBROUTINE FOR DISPLAYING THE MAIN MENU
    public static String MAIN_MENU (){
    
    // instantiating the scanner object
    Scanner keyedInput = new Scanner(System.in);
    String input = keyedInput.nextLine();
        
    // displaying the options to the user.
    System.out.println("\n\tWhat would you like to do?");
    System.out.println("\t1. Attack");
    System.out.println("\t2. Drink health potion");
    System.out.println("\t3. Run!");
            
    // code to return "input".
    return(input);
    
    }

    // SUBROUTINE FOR WHEN USER CHOOSES THE OPTION 3 "RUN".
    public static String INPUT_RUN (String enemy)
    {
        
    // code to print the output that occurs when the user chooses to run.
    System.out.println("\tYou run away from the " + enemy);
    
    // code to return "enemy".
    return(enemy);
    
    }
    
    // SUBROUTINE FOR GENERATING A RANDOM ENEMY FOR THE USER TO ATTACK.
    public static String ENEMY_GENERATOR (String enemy)
    {
        
    // instantiating the random object.
    Random rand = new Random();
    String [] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
    
    // code to display what enemy the user faces.
    enemy = enemies[rand.nextInt(enemies.length)];
    System.out.println("\t# " + enemy + " enemy has appeared! #\n");
        
    // code to return "enemy"
    return (enemy);
    
    }
    
    /**
     * @param args the command line arguments
     */
    
    // MAIN METHOD.
    public static void main(String[] args) {
        
        // declaring and instantiating the scanner and random objects in the main method.
        Scanner keyedInput = new Scanner(System.in);
        Random rand = new Random();
        
        // declaring an array to store values for the possible enemies that the user can face.
        String [] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        
        // declaring multiple variables to store various values.
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        
        // declaring constants to store various values.
        final int healthPotionHealAmount = 30;
        final int healthPotionDropChance = 50;
        
        // creating a boolean variable to store if the GAME is running or not.
        boolean GameRunning = true;
        
        // code to print the welcome message.
        System.out.println("Welcome to the Dungeon!");
        
        GAME:
        
        // while loop starts.
        while (GameRunning){
        
        System.out.println("------------------------------------------------");
        
        // code to display the random health of the enemy.
        int enemyHealth = rand.nextInt(maxEnemyHealth);
        String enemy = enemies[rand.nextInt(enemies.length)];
        System.out.println("\t# " + enemy + " enemy has appeared! #\n");
        
        // nested while loop starts.
        while (enemyHealth > 0){
            
            // code to print to the user: (their health, enemy health, and options).
            System.out.println("\tYour HP: " + health);
            System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
            System.out.println("\n\tWhat would you like to do?");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Drink health potion");
            System.out.println("\t3. Run!");
            
            // if statements for input choice of user equalling 1.
            String input = keyedInput.nextLine();
            if (input.equals("1")){
            
                // code to display the attack damage of user and enemy.
                int damageDealt = rand.nextInt(attackDamage);
                int DamageTaken = rand.nextInt(enemyAttackDamage);
                
                // code to perform the arithemetic calculation to determine the user health and enemy health after attack.
                enemyHealth -= damageDealt;
                health -= damageDealt;
                
                // code to print the output indicating health of user and enemy with damage endured.
                System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                System.out.println("\t> You recieve " + DamageTaken + " in retaliation!");
                
                // code to display if user health is too low.
                if (health < 1) {
                
                System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                break;
                
                }
            }
            
            // if statement for input choice of user equalling 2
            else if (input.equals("2")){
                if (numHealthPotions > 0){
                
                // code for the arithmetic calculation to determine the amount of potions left after user used potion(s).    
                health += healthPotionHealAmount;
                numHealthPotions--;
                
                // code to output the user's health after potion and number of potions left.
                System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "." +
                "\n\t> You now have " + health + " HP." + 
                "\n\t> You have " + numHealthPotions + " health potions left.\n");
                
                }
                // code for the occurence that a health potion does not remain to use.
                else {
                
                    System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!\n");
                }
                    
            }
            
            // if statement for input choice of user equalling 3.
            else if (input.equals("3")){
            
            // code to display the message.
            System.out.println("\tYou run away from the " + enemy);
            continue GAME;
            }
            
            // in case of an invalid command being entered by user.
            else {
            
                System.out.println("\tInvalid Command!");
            }
            
        }
        
        // code for health being lower than 1.
        if (health < 1){
        
        // code to print the output.
        System.out.println("You limp out of the dungeon, weak from the battle.");
        break;
        }
        
        // code to print the line if enemy is killed and drops a health potion.
        System.out.println("------------------------------------------------");
        System.out.println(" # " + enemy + " was defeated! #");
        System.out.println(" # You have " + health + " HP left #");
        
        // code to determine a random drop chance for a health potion by killing an enemy.
        if (rand.nextInt(100) < healthPotionDropChance){
        
            // code to add health potion to the inventory of the user after it is dropped by the enemy killed.
            numHealthPotions++;
            
            // code to print the output which indicates that the enemy that the user killed dropped a health potion.
            System.out.println(" # The " + enemy + " dropped a health potion! # ");
            
            // code to display how many potions the user has.
            System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
        }
        
        // code to display options after the user kills enemy.
        System.out.println("------------------------------------------------");
        System.out.println("What would you like to do now?");
        System.out.println("1... Continue Fighting");
        System.out.println("2... Exit Dungeon");
        String input = keyedInput.nextLine();
        
        // code to determine the occurence of an invalid input.
        while (!input.equals("1") && !input.equals("2")) {
        
            System.out.println("Invalid Command");
            input = keyedInput.nextLine();
        }
        
        // code for user choosing option 1 after killing an enemy.
        if (input.equals ("1")){
        
            System.out.println("You continue on your adventure!");
        }
        
        // code for user choosing option 2 after killing an enemy.
        else if (input.equals("2")){
        
            System.out.println("You have exited the dungeon, successful from your adventures!");
            break;
        }
        
        
        }
        
        // code to display the final message saying thank-you to the user for playing the GAME.
        System.out.println(" ");
        System.out.println("#######################");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("#######################");
        
    }
    
}
