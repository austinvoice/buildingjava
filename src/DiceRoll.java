// program to roll dice and test patterns
import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        System.out.println("Let's roll some dice!");
        System.out.println("Exit when 3 odd rolls.");
        Random rand = new Random();
        int odds = 0;
        int count = 0;

        while (odds < 3) {
            // roll die
            // print value
            int roll = rand.nextInt(6) + 1;
            System.out.println("You rolled a " + roll);
            count++;
            if (roll % 2 == 1) {
                odds++;
            }
            else {
                odds = 0;
            }
        }
        System.out.println();
        System.out.println("Total rolls: " + count);

        Scanner console = new Scanner(System.in);
        int number = 0;

        while (number != 0) {
            System.out.println("Enter a number (0 to quit): ");
            number = console.nextInt();
        }
    }
}
