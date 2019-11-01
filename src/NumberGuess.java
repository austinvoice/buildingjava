// program to guess a number
// gives user hints

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = 42; // always pick same number

        // user input, fence post
        System.out.print("Your guess? ");
        int guess = console.nextInt();
        int numGuesses = 1;

        while (guess != number) {
            System.out.println("Incorrect.");
            System.out.print("Guess again. ");
            guess = console.nextInt();
            numGuesses++;
        }
        System.out.println("You got it right in " +
                numGuesses + " tries.");
    }
}
