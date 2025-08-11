import java.util.Scanner;
import java.util.Random;


public class Exercise_3_3 {
    
    public static void main(String[] args) {
    // importing the random module
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    // System.out.println(number);
    
    // importing the ability to get user input
    Scanner in = new Scanner(System.in);

    // Initial prompt to user and input to their number
    System.out.println("I'm thinking of a number between 1 and 100.\nCan you guess what it is?");
    System.out.print("Type a number: ");
    int userInput = in.nextInt();
    System.out.printf("Your guess is: %d\n", userInput);
    System.out.printf("The number I was thinking of is: %d\n", number);

    // Calculating how much they were off by
    int calc = (number - userInput);

    // Telling the user how much they were off by
    System.out.printf("You were off by: %d ", calc);
    }

}
