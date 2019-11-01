import java.util.Random;
import java.util.Scanner;

public class RandomCalc {
    public static void main(String[] args) {
        // test how many times to random roll a 7
        Random r = new Random();
        int sum = 0;
        int count = 0;
        while (sum != 7) {
            int roll1 = r.nextInt(6) + 1;
            int roll2 = r.nextInt(6) + 1;
            sum = roll1 + roll2;
            count++;
            System.out.println(roll1 + " + " + roll2 + " = " + sum);
        }
        System.out.println("Lucky 7!");
        System.out.println("Rolls: " + count);

        // print a string multiple times
        Scanner console = new Scanner(System.in);
        System.out.print("Phrase? ");
        String s = console.next();
        System.out.print("How many times? ");
        int number = console.nextInt();
        System.out.println();
        multiprint(s, number);

        // test for input sentinel to quit
        // Scanner console = new Scanner(System.in);
        sum = 0;
        System.out.print("next integer (-1 to quit)? ");
        number = console.nextInt();
        while (number != -1) {
            sum += number;
            System.out.print("next integer (-1 to quit)? ");
            number = console.nextInt();
        }
        System.out.println("sum = " + sum);
    }

    // print a string multiple times
    public static void multiprint(String s, int number) {
        System.out.print("[");
        for (int i = 1; i <= number; i++) {
            System.out.print(s);
            if (i < number) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();
    }
}
