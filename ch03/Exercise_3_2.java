import java.util.Scanner;

public class Exercise_3_2 {
    
    public static void main(String[] args) {
        //initialize the Scanner
        Scanner in = new Scanner(System.in);
        final double nineDivFive = 1.8;

        //Prompts Person inputs a temperature in Celsius
        System.out.print("Enter a temperature in Celsius: ");
        
        //Take the input
        double tempInput = in.nextDouble();
        
        //Check for the proper input from tempInput 
        System.out.printf("User input = %f\n", tempInput);

        //Calculation. I used an assigned value for the 9/5 part of the conversion. since it doesn't change
        final double fahCalc = tempInput * nineDivFive + 32.0;

       //Check for the proper input from tempInput 
        System.out.printf("Final calculation are as follows %.1f C = %.1f F", tempInput, fahCalc); 
    }

}   
