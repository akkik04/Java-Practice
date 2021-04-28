/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returningdatabacktomainprogram;

// code for scanner class to retrieve input from user.
import java.util.Scanner;

/** Akshith Kandivanam
 *  Mr. Martins
 *  ICS-3U1
 *  2021-01-11
 *  Methods and Returning Data Back To The Main Program
 */
public class ReturningDataBacktoMainProgram {

    // subroutine for calculating the value of a number squared.
    public static double CalcSquared (double num1)
    {
        // arithmetic calculation to determine the value of a number squared.
        double squared = (num1 * num1);
    
        // rounding for the value of "squared", in the case of a decimal value being entered by the user.
        squared = squared * 100.0;
        squared = Math.round(squared);
        squared = squared / 100.0;
    
        // code to return data back to main method.
        return (squared);
    }
    
    // subroutine for calculating the value of a number cubed.
    public static double CalcCubed (double num1)
    {
        // arithmetic calculation to determine the value of a number cubed.
        double cubed = (num1 * num1 * num1);
    
        // rounding for the value of "cubed", in the case of a decimal value being entered by the user.
        cubed = cubed * 100.0;
        cubed = Math.round(cubed);
        cubed = cubed / 100.0;
        
        // code to return data back to main method.
        return (cubed);
    }
    
    // subroutine for calculating the value of two numbers multiplied together.
    public static double CalcMultiply (double num1, double num2)
    {
        // arithmetic calculation to determine the value of two numbers multiplied together.
        double product = num1 * num2;
    
        // rounding for the value of "product", in the case of a decimal value being entered by the user. 
        product = product * 100.0;
        product = Math.round(product);
        product = product / 100.0;
        
        // code to return data back to main method.
        return (product);
    }
    
    // subroutine for calculating the value of the average of 3 numbers.
    public static double CalcAvg (double num1, double num2, double num3)
    {
        // declaring and initializing variables as double to store the values for sum, average, and a constant to store value for numbers.
        double avg; 
        double sum;
        final double numbers = 3;
        
        // code for the arithmetic calculation of the sum.
        sum = num1 + num2 + num3;
        
        // code for the arithmetic calculation of the average.
        avg = sum / numbers;
        
        // rounding for the value of "avg", in the case of a decimal value being entered by the user.  
        avg = avg * 100.0;
        avg = Math.round(avg);
        avg = avg / 100.0;
        
        // code to return data back to main method.
        return (avg);
    }
    
    // subroutine for calculating the value of the perimeter of a rectangle.
    public static double CalcPerimeter (double num1, double num2)
    {
        // declaring and initializing variable as double to store the value for perimeter. 
        double perimeter = (2 * num1) + (2 * num2);
        
        // rounding for the value of "perimeter", in the case of a decimal value being entered by the user.  
        perimeter = perimeter * 100.0;
        perimeter = Math.round(perimeter);
        perimeter = perimeter / 100.0;
        
        // code to return data back to main method.
        return (perimeter);
    }
    
    // subroutine for calculating the value of the larger number between two numbers.
    public static double CalcLargerNum (double num1, double num2)
    {
        // declaring and initializing variables to store various values.
        double numA = num1;
        double numB = num2;
        double ans = (Math.max(numA, numB));
        
        
        // code to return data back to main method.
        return (ans);
        
    }
    
    // subroutine for calculating the value of the hypotenuse of a triangle.
    public static double CalcHypotenuse (double num1, double num2)
    {
        // declaring and initializing variable as double to store the value of hypotenuse.
        double hypot = Math.hypot(num1, num2);
    
        // rounding for the value of "hypot", in the case of a decimal value being entered by the user.
        hypot = hypot * 100.0;
        hypot = Math.round(hypot);
        hypot = hypot / 100.0;
    
        // code to return data back to main method.
        return (hypot);
    }
    
    // subroutine for calculating the value of the volume of a rectangle.
    public static double CalcVolume (double num1, double num2, double num3)
    {
        // declaring and initializing a variable as double to store the value of volume.
        double volume = (num1 * num2 * num3);
    
        // rounding for the value of "volume", in the case of a decimal value being entered by the user.
        volume = volume * 100.0;
        volume = Math.round(volume);
        volume = volume / 100.0;
    
        // code to return data back to main method.
        return (volume);
    }
    
    // subroutine for calculating the value of the area of a circle.
    public static double CalcAreaCircle (double num1)
    {
        // declaring and initializing a variable as double to store the value for area of circle.
        double areaCircle = Math.PI * Math.pow(num1, 2);
    
        // rounding for the value of "areaCircle", in the case of a decimal value being entered by the user.
        areaCircle = areaCircle * 100.0;
        areaCircle = Math.round(areaCircle);
        areaCircle = areaCircle / 100.0;
    
        // code to return data back to main method.
        return (areaCircle);
    }
    
    // // subroutine for calculating the value of the area of a triangle.
    public static double CalcAreaTriangle (double num1, double num2)
    {
        // declaring and initializing variables to store various values.
        double base = num1;
        double height = num2;
        double areaTriangle = (num1 * num2) / 2;
    
        // rounding for the value of "areaTriangle", in the case of a decimal value being entered by the user.
        areaTriangle = areaTriangle * 100.0;
        areaTriangle = Math.round(areaTriangle);
        areaTriangle = areaTriangle / 100.0;
    
        // code to return data back to main method.
        return (areaTriangle);
    
    }
    
    
    // main method.
    public static void main(String[] args) {
        
        // instantiating the scanner object.    
        Scanner keyedInput = new Scanner(System.in);

        //  declaring variables as integer and double to store values for choice, num1, num2, and num3.
        int choice = 0;
        double num1, num2, num3;
        double answer;
       
    // creating a while loop to execute all the following code as long as the choice number is not equal to 11.    
    while (choice != 11) {
    
        System.out.println("Choose an option from the list below please:");
        System.out.println("Option 1... Find the value of a number squared");
        System.out.println("Option 2... Find the value of a number cubed");
        System.out.println("Option 3... Find the product of two numbers");
        System.out.println("Option 4... Find the average of 3 numbers");
        System.out.println("Option 5... Find the perimeter of a rectangle");
        System.out.println("Option 6... Find the larger number");
        System.out.println("Option 7... Find the hypotenuse of a right angle triangle");
        System.out.println("Option 8... Find the volume of a rectangle");
        System.out.println("Option 9... Find the area of a circle");
        System.out.println("Option 10... Find the area of a triangle");
        System.out.println("Option 11... Exit");
        System.out.println("-----------------------------------------------------------");
        
        System.out.println(" ");
        
        // code for prompting the user to enter a choice number to print lines for the inputted choice.
        System.out.print("Please enter your choice:");
        choice = keyedInput.nextInt();
        
        
        // 1st "if" statement for choice number equalling 1.
         if (choice == 1)
         {
         // code for prompting the user to enter a number to square.    
         System.out.print("Enter the number you would like to square:");
         num1 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine called "CalcSquared".
         answer = CalcSquared(num1);
         
         // code to print the final output line which indicates the value of the number squared.
         System.out.println("The value of the number squared is " + answer);
         }
         
         
         // 2nd "if" statement for choice number equalling 2.
         if (choice == 2)
         {
         // code for prompting the user to enter a number to cube.   
         System.out.print("Enter the number you would like to cube:");
         num1 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine called "CalcCubed".
         answer = CalcCubed(num1);
         
         // code to print the final output line which indicates the value of the number cubed. 
         System.out.println("The value of the number cubed is " + answer);
         }
         
         
         // 3rd "if" statement for choice number equalling 3.
         if (choice == 3)
         {
         // code for prompting the user to enter two numbers to multiply.  
         System.out.println("Enter the numbers you would like to multiply:");
         System.out.print("First Number:");
         num1 = keyedInput.nextDouble();
         System.out.print("Second Number:");
         num2 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine called "CalcMultiply".
         answer = CalcMultiply (num1, num2);
         
         // code to print the final output line which indicates the value of the two numbers multiplied. 
         System.out.println("The product is " + answer);
         }
         
         
         // 4th "if" statement for choice number equalling 4.
         if (choice == 4)
         {
         // code for prompting the user to enter three numbers to average. 
         System.out.println("Enter the three numbers you would like to average:");
         System.out.print("First Number:");
         num1 = keyedInput.nextDouble();
         System.out.print("Second Number:");
         num2 = keyedInput.nextDouble();
         System.out.print("Third Number:");
         num3 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine called "CalcAvg".
         answer = CalcAvg (num1, num2, num3);
         
         // code to print the final output line which indicates the value of the average of the three numbers.
         System.out.println("The average of the three numbers is " + answer);
         }
         
         
         // 5th "if" statement for choice number equalling 5.
         if (choice == 5)
         {
         // code for prompting the user to enter the length and width of a rectangle.  
         System.out.println("Enter the length and width of the rectangle:");
         System.out.print("Length:");
         num1 = keyedInput.nextDouble();
         System.out.print("Width:");
         num2 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine called "CalcPerimeter".
         answer = CalcPerimeter (num1, num2);
         
         // code to print the final output line which indicates the value of the perimeter.
         System.out.println("The perimeter is " + answer);
         }
        
         
         // 6th "if" statement for choice number equalling 6.
         if (choice == 6)
         {
         // code for prompting the user to enter the two numbers to find the larger number.  
         System.out.println("Enter two numbers to find out the larger number:");
         System.out.print("Number 1:");
         num1 = keyedInput.nextDouble();
         System.out.print("Number 2:");
         num2 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine called "CalcLargerNum".
         answer = CalcLargerNum (num1, num2);
         
         // code to print the final output line which indicates the value of the larger number.
         System.out.println("The larger number is " + answer);
         }
         
         
         // 7th "if" statement for choice number equalling 7.
         if (choice == 7)
         {
         // code for prompting the user to enter the length of Side A and Side B of the triangle.  
         System.out.println("Enter the length of Side A and Side B to calculate the hypotenuse:");
         System.out.print("Length of Side A:");
         num1 = keyedInput.nextDouble();
         System.out.print("Length of Side B:");
         num2 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine called "CalcHypotenuse".
         answer = CalcHypotenuse (num1, num2);
         
         // code to print the final output line which indicates the value of the hypotenuse of the triangle.
         System.out.println("The hypotenuse of the triangle is " + answer);
         }
    
         
         // 8th "if" statement for choice number equalling 8.
         if (choice == 8)
         {
         // code for prompting the user to enter the length, width, and height of a rectangle.  
         System.out.println("Enter the length, width, and height of the rectangle to calculate the volume:");
         System.out.print("Length:");
         num1 = keyedInput.nextDouble();
         System.out.print("Width:");
         num2 = keyedInput.nextDouble();
         System.out.print("Height");
         num3 = keyedInput.nextDouble();
         
         // code to retrieve data from subroutine called "CalcVolume".
         answer = CalcVolume (num1, num2, num3);
         
         // code to print the final output line which indicates the value of the volume.
         System.out.println("The volume of the rectangle is " + answer);
         }
         
         
         // 9th "if" statement for choice number equalling 9.
         if (choice == 9)
         {
         // code for prompting the user to enter the radius of a circle.  
         System.out.println("Enter the radius of the circle to calculate the area:");
         System.out.print("Radius:");
         num1 = keyedInput.nextDouble();
         
         
         // code to retrieve data from subroutine called "CalcAreaCircle".
         answer = CalcAreaCircle (num1);
         
         // code to print the final output line which indicates the value of the area of the circle. 
         System.out.println("The area of the circle is " + answer);
         }
         
         
         // 10th "if" statement for choice number equalling 10.
         if (choice == 10)
         {
         // code for prompting the user to enter the base and height of a triangle.  
         System.out.println("Enter the base and height of the triangle to calculate the area:");
         System.out.print("Base:");
         num1 = keyedInput.nextDouble();
         System.out.print("Height:");
         num2 = keyedInput.nextDouble();
         
         // code to transfer to subroutine called "CalcAreaTriangle".
         answer = CalcAreaTriangle (num1, num2);
         
         // code to print the final output line which indicates the value of the area of the triangle.
         System.out.println("The area of the triangle is " + answer);
         }
         
         // 11th "if" statement for choice number equalling 11.
         if (choice == 11)
         {
         // code to print a goodbye message and exit program.
         System.out.println("Goodbye, have a great day!");
         System.exit(0);
         }    
    
        System.out.println("------------------------------------------------------------");
    }   
    
    }   
    
}
