// program to guess a number
// gives user hints

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        // text introduction
        giveIntro();
        Scanner console = new Scanner(System.in);

        // pick a random number for the guess
        Random rand = new Random(); // init random
        int number = rand.nextInt(100); // random 0-99

        // first user input, fence post, test for range and type
        int guess = getGuess(console);
        int numGuesses = 1;

        // give hints until correct
        while (guess != number) {
            int numMatches = matches(number, guess);
            System.out.println("Incorrect. (Hint: " +
                    numMatches + " digits match.)");
            System.out.print("Guess again (0-99)? ");
            guess = console.nextInt();
            numGuesses++;
        }

        // complete summary of tries
        System.out.println("You got it right in " +
                numGuesses + " tries.");
    }

    public static int getGuess(Scanner console) {
        int guess = getInt(console, "Your guess (0-99)? ");
        while (guess < 0 || guess >= 100) {
            System.out.println("Out of range. Try again.");
            guess = getInt(console, "Your guess (0-99)? ");
        }
        return guess;
    }

    public static int getInt(Scanner console, String prompt) {
        // get user input until is an int
        // starts with a fence pole question, then while loop
        // then stores variable
        System.out.print(prompt);
        while (!console.hasNextInt()) {
            console.next(); // discards current input
            System.out.println("Not an integer. Try again.");
            System.out.print(prompt);
        }
        return console.nextInt();
    }

    private static void giveIntro() {
        System.out.println("This program asks for input");
        System.out.println("and tells you if there's a match");
        System.out.println("with hints and robust error checks.");
        System.out.println();
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
