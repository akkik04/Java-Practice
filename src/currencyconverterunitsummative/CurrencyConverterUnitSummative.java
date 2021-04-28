
package currencyconverterunitsummative;


// code to import scanner class.
import java.util.Scanner;

/** Akshith Kandivanam
 *  Mr. Martins
 *  ICS-3U1
 *  2021-01-13
 *  Currency Converter Program
 */

/**
 * EXCHANGE RATES ARE AS OF JANUARY 13TH, 2021 5:14PM.
 * 
 */


public class CurrencyConverterUnitSummative {
    
    // declaring static constant and array to allow access to each method.
    static final double ROUNDING_VAL = 100.0;
    static double [] Currency_Conversions = new double []{0.79, 57.61, 0.58, 0.65, 81.77, 58.16, 15.62, 4.18};
             
    // subroutine for calculating the CAD to USD.
    public static double CalcCADtoUSD (double num1)
    {
        // arithmetic calculation to determine the value of USD.
        double USD = num1 * Currency_Conversions[0];
    
        // rounding for the value of "USD", in the case of a decimal value being entered by the user.
        USD = USD * ROUNDING_VAL;
        USD = Math.round(USD);
        USD = USD / ROUNDING_VAL;
    
        // code to return data back to main method.
        return (USD);
    }
    
    // subroutine for calculating the CAD to INR.
    public static double CalcCADtoINR (double num1)
    {
        // arithmetic calculation to determine the value of INR.
        double INR = num1 * Currency_Conversions[1];
    
        // rounding for the value of "INR", in the case of a decimal value being entered by the user.
        INR = INR * ROUNDING_VAL;
        INR= Math.round(INR);
        INR = INR / ROUNDING_VAL;
        
        // code to return data back to main method.
        return (INR);
    }
    
    // subroutine for calculating the amount of CAD TO GBP.
    public static double CalcCADtoGBP(double num1)
    {
        // arithmetic calculation to determine the GBP.
        double GBP = num1 * Currency_Conversions[2]; 
    
        // rounding for the value of "GBP", in the case of a decimal value being entered by the user. 
        GBP = GBP * ROUNDING_VAL;
        GBP = Math.round(GBP);
        GBP = GBP / ROUNDING_VAL;
        
        // code to return data back to main method.
        return (GBP);
    }
    
    // subroutine for calculating CAD to EU
    public static double CalcCADtoEU (double num1)
    {
        // arithmetic calculation to determine the EU.
        double EU = num1 * Currency_Conversions[3];
        
        // rounding for the value of "EU", in the case of a decimal value being entered by the user.  
        EU = EU * ROUNDING_VAL;
        EU = Math.round(EU);
        EU = EU / ROUNDING_VAL;
        
        // code to return data back to main method.
        return (EU);
    }
    
    // subroutine for calculating CAD to JPY.
    public static double CalcCADtoJPY (double num1)
    {
        // declaring and initializing variable as double to store the value of JPY.
        double JPY = num1 * Currency_Conversions[4];
        
        // rounding for the value of "JPY", in the case of a decimal value being entered by the user.  
        JPY = JPY * ROUNDING_VAL;
        JPY = Math.round(JPY);
        JPY = JPY / ROUNDING_VAL;
        
        // code to return data back to main method.
        return (JPY);
    }
    
    // subroutine for calculating CAD to RUB.
    public static double CalcCADtoRUB (double num1)
    {
        // declaring and initializing variable as double to store value of RUB.
        double RUB = num1 * Currency_Conversions[5];
        
        // rounding for the value of "RUB", in the case of a decimal value being entered by the user. 
        RUB = RUB * ROUNDING_VAL;
        RUB = Math.round(RUB);
        RUB = RUB / ROUNDING_VAL;
        
        // code to return data back to main method.
        return (RUB);
        
    }
    
    // subroutine for calculating CAD to MXN.
    public static double CalcCADtoMXN (double num1)
    {
        // declaring and initializing variable as double to store the value of MXN.
        double MXN = num1 * Currency_Conversions[6];
    
        // rounding for the value of "MXN", in the case of a decimal value being entered by the user.
        MXN = MXN * ROUNDING_VAL;
        MXN = Math.round(MXN);
        MXN = MXN / ROUNDING_VAL;
    
        // code to return data back to main method.
        return (MXN);
    }
    
    // subroutine for calculating CAD to BRL.
    public static double CalcCADtoBRL (double num1)
    {
        // declaring and initializing a variable as double to store the value of BRL.
        double BRL = num1 * Currency_Conversions[7];
    
        // rounding for the value of "BRL", in the case of a decimal value being entered by the user.
        BRL = BRL * ROUNDING_VAL;
        BRL = Math.round(BRL);
        BRL = BRL / ROUNDING_VAL;
    
        // code to return data back to main method.
        return (BRL);
    }
    
    // main method.
    public static void main(String[] args) {
        
        // instantiating the scanner object.    
        Scanner keyedInput = new Scanner(System.in);

        // declaring variables as integer and double to store values for choice and num1.
        int choice = 0;
        double num1;
        double answer;
               
    // creating a while loop to execute all the following code as long as the choice number is not equal to 9.    
    while (choice != 9) {
    
        System.out.println("Choose an option from the list below please:");
        System.out.println("Option 1... Convert from Canadian Dollar (CAD) to United States Dollar (USD)");
        System.out.println("Option 2... Convert from Canadian Dollar (CAD) to Indian Rupee (INR)");
        System.out.println("Option 3... Convert from Canadian Dollar (CAD) to Great Britain Pound (GBP)");
        System.out.println("Option 4... Convert from Canadian Dollar (CAD) to Euro (EU)");
        System.out.println("Option 5... Convert from Canadian Dollar (CAD) to Japanese Yen (JPY)");
        System.out.println("Option 6... Convert from Canadian Dollar (CAD) to Russian Ruble (RUB)");
        System.out.println("Option 7... Convert from Canadian Dollar (CAD) to Mexican Peso (MXN)");
        System.out.println("Option 8... Convert from Canadian Dollar (CAD) to Brazilian Real (BRL)");
        System.out.println("Option 9... Exit");
        System.out.println("-----------------------------------------------------------");
        
        System.out.println(" ");
        
        // code for prompting the user to enter a choice number to print lines for the inputted choice.
        System.out.print("Please enter your choice:");
        choice = keyedInput.nextInt();
        
        
        // 1st "if" statement for choice number equalling 1.
         if (choice == 1)
         {
         // code for prompting the user to enter an amount in CAD.   
         System.out.print("Enter the amount in CAD:");
         num1 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine.
         answer = CalcCADtoUSD(num1);
         
         // code to print the final output line which indicates the value of amount in USD.
         System.out.println("The amount in USD is $" + answer);
         }
         
         
         // 2nd "if" statement for choice number equalling 2.
         if (choice == 2)
         {
         // code for prompting the user to enter an amount in CAD.
         System.out.print("Enter the amount in CAD:");
         num1 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine.
         answer = CalcCADtoINR(num1);
         
         // code to print the final output line which indicates the value of the amount in INR.
         System.out.println("The amount in INR is ₹" + answer);
         }
         
         
         // 3rd "if" statement for choice number equalling 3.
         if (choice == 3)
         {
         // code for prompting the user to enter amount in CAD.
         System.out.print("Enter the amount in CAD:");
         num1 = keyedInput.nextDouble();
                  
         // code to retrieve data from subroutine.
         answer = CalcCADtoGBP (num1);
         
         // code to print the final output line which indicates the amount in GBP.
         System.out.println("The amount in GBP is £" + answer);
         }
         
         
         // 4th "if" statement for choice number equalling 4.
         if (choice == 4)
         {
         // code for prompting the user to enter amount in CAD.
         System.out.print("Enter the amount in CAD:");
         num1 = keyedInput.nextDouble();
         
         
         // code to retrieve data from subroutine.
         answer = CalcCADtoEU (num1);
         
         // code to print the final output line which indicates the value of the amount in EU.
         System.out.println("The amount in EU is €" + answer);
         }
         
         
         // 5th "if" statement for choice number equalling 5.
         if (choice == 5)
         {
         // code for prompting the user to enter the amount in CAD.
         System.out.print("Enter the amount in CAD:");
         num1 = keyedInput.nextDouble();
         
         
         // code to retrieve data from subroutine.
         answer = CalcCADtoJPY (num1);
         
         // code to print the final output line which indicates the value of amount in JPY.
         System.out.println("The amount in JPY is ¥" + answer);
         }
        
         
         // 6th "if" statement for choice number equalling 6.
         if (choice == 6)
         {
         // code for prompting the user to enter amount in CAD.
         System.out.print("Enter amount in CAD:");
         num1 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine.
         answer = CalcCADtoRUB (num1);
         
         // code to print the final output line which indicates the value of the amount in RUB.
         System.out.println("The amount in RUB is ₽" + answer);
         }
         
         
         // 7th "if" statement for choice number equalling 7.
         if (choice == 7)
         {
         // code for prompting the user to enter the amount in CAD.
         System.out.print("Enter the amount in CAD:");
         num1 = keyedInput.nextDouble();
         
         
         // code to retrieve data from subroutine.
         answer = CalcCADtoMXN (num1);
         
         // code to print the final output line which indicates the value of the amount in MXN.
         System.out.println("The amount in MXN is $" + answer);
         }
    
         
         // 8th "if" statement for choice number equalling 8.
         if (choice == 8)
         {
         // code for prompting the user to enter the amount in CAD.
         System.out.print("Enter the amount in CAD:");
         num1 = keyedInput.nextDouble();
         
         
         // code to retrieve data from subroutine.
         answer = CalcCADtoBRL (num1);
         
         // code to print the final output line which indicates the value of number in miles.
         System.out.println("The amount in BRL is: R$" + answer);
         }
         
                         
         // 9th "if" statement for choice number equalling 9.
         if (choice == 9)
         {
         // code to print a goodbye message and exit program.
         System.out.println("Thank you for using our Currency Converter, have a great day!");
         System.exit(0);
         }    
    
        System.out.println("------------------------------------------------------------");
    }   
    
    }   
    
}


