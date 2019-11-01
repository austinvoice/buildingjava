// computes the min and max of a Hailstone progression
// currently proven to resolve to 1

import java.util.Scanner;

public class HailStone {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Value? ");
        int value = console.nextInt();

        System.out.print("Length? ");
        int length = console.nextInt();

        PrintHailstoneMinMax(value, length);
    }

    public static void PrintHailstoneMinMax(int value, int length) {
        int min = value;
        int max = value;
        int count = 0;

        for (int i = 1; i <= length - 1; i++) {

            System.out.print(value + " ");

            // iterate through hailstone function
            if (value % 2 == 0) {
                value = value / 2;
            }
            else {
                value = 3 * value + 1;
            }

            // check if max or min, store value
            if (value > max) {
                max = value;
            }
            else if (value < min) {
                min = value;
            }

            // keep track of count
            count++;

            // if reaches 1 stop
            if (min == 1) {
                System.out.print("1 Min");
                break;
            }
        }
        // print results
        System.out.println();
        System.out.println("Length: " + count);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
