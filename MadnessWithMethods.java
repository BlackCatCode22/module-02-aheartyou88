import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {

        // getAnIntFromTheUser Method
        int num1 = getAnIntFromTheUser();
        int num2 = getAnIntFromTheUser();

        // CompareTwoInts and sunTwoInts Method
        int bigNumber = compareTwoInts(num1, num2);
        int sumMath = sumTwoInts(num1, num2);

        // Provides the larger integer
        System.out.println("\n" + "The larger number of the two entered is:  " + bigNumber);

        // Provides the sum
        System.out.println("\n" + "1st entry + 2nd entry = " + sumMath);
    }

    public static int getAnIntFromTheUser() {

        // user has to enter an integer 2x's
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer here: ");

        int value = scan.nextInt();
        return value;
    }
    // Display the larger number
    public static int compareTwoInts (int num1, int num2) {

        if (num1 > num2) {
            return num1;
        }
        {
            return num2;
        }
    }
    // Takes 2 integers and returns the sum
    public static int sumTwoInts(int num1, int num2) {


        //Return the sum of num1 + num2
        return num1 + num2;

    }
}
