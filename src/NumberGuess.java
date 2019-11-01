// program to guess a number
// gives user hints

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random(); // init random
        int number = rand.nextInt(100); // random 0-99

        // first user input, fence post
        System.out.print("Your guess (0-99)? ");
        int guess = console.nextInt();
        int numGuesses = 1;

        // give hints until correct
        while (guess != number) {
            int numMatches = matches(number, guess);
            System.out.println("Incorrect. Hint: " +
                    numMatches + " digits match.");
            System.out.print("Guess again (0-99)? ");
            guess = console.nextInt();
            numGuesses++;
        }

        System.out.println("You got it right in " +
                numGuesses + " tries.");
    }

    public static int matches(int number, int guess) {
        int numMatches = 0;

        // test first digit or second digit
        if (guess / 10 == number / 10 ||
            guess / 10 == number % 10 ) {
            numMatches++;
        }
        // check second digit for match and case where digits are the same
        if (guess / 10 != guess % 10 &&
                (guess % 10 == guess / 10 ||
                guess % 10 == number % 10)) {
            numMatches++;
        }
        return numMatches;
    }
}
