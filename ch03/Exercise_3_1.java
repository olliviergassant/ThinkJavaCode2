import java.util.Scanner;

/**
 * Inputs two lines and repeats them back to the user.
 */
public class Exercise_3_1 {

    public static void main(String[] args) {
        int testNumber = 9;
        double testDouble = 9.63;;

        //print statement for the exercise
        //System.out.printf("this is the integer : %f", testNumber); // this should give an error because the testNumber is an int and not a float
        System.out.printf("this is the integer : %d\n", testNumber); // this should would since %d is for integers
        System.out.printf("this is the double number: %f", testDouble);
    
    }

}
