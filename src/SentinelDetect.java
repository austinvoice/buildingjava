// program to detect a sentinel key

import java.util.Scanner;

public class SentinelDetect<min> {
    public static void main(String[] args) {
        // prime variable
        Scanner console = new Scanner(System.in);

        // placing a post
        System.out.print("Enter a number (0 to quit): ");
        int number = console.nextInt();
        int min = number;

        // set minimum, look for user input or exit with 0
        while (number != 0) {
            // test if minimum value
            if (number < min) {
                min = number;
            }
            // request user input, exit on 0
            System.out.print("Enter a number (0 to quit): ");
            number = console.nextInt();
        }
        System.out.println("The minimum is " + min + ".");
    }
}