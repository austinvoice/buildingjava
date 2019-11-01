// perform a series of tests for type

import java.util.Scanner;

public class TypeTest {
    public static void main(String[] args) {
        System.out.println("The program tests several ways");
        System.out.println("a token can be read.");
        System.out.println();

        Scanner console = new Scanner(System.in);

        // get user input and test
        System.out.print("Token? ");
        System.out.println(" hasNextInt = " +
                console.hasNextInt());
        System.out.println(" hasNextDouble = " +
                console.hasNextDouble());
        System.out.println(" hasNext = " +
                console.hasNext());
        System.out.println(" hasNextLine = " +
                console.hasNextLine());
        System.out.println();

        // call the method to get age
        int age = getInt(console, "How old are you? ");
    }

    public static int getInt(Scanner console, String prompt) {
        // get user input until is an int
        // starts with a fence pole question, then while loop
        // then stores variable
        console.next(); // discards current input
        System.out.print(prompt);
        while (!console.hasNextInt()) {
            console.next(); // discards current input
            System.out.println("Not an integer. Try again.");
            System.out.print(prompt);
        }
        return console.nextInt();
    }
}
