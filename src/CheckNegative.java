// check if sum adds to negative, report to user

import java.util.Scanner;

public class CheckNegative {
    public static void main(String[] args) {
        Scanner input1 = new Scanner("38 4 19 -27 -15 -3 4 19 38");
        Scanner input2 = new Scanner("14 7 -10 9 -18 -8 17 42 98");
        Scanner input3 = new Scanner("14 7 -100 9 -18 -8 17 42 98");
        checkNegativeSum(input1);
        System.out.println();
        checkNegativeSum(input2);
        System.out.println();
        checkNegativeSum(input3);
    }

    public static void checkNegativeSum(Scanner input) {
        int sum = 0;
        boolean found = false;
        int count = 0;
        while (input.hasNextInt() && !found) {
            int next = input.nextInt();
            count++;
            sum += next;
            if (sum < 0) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Negative sum found after " + count + " steps.");
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("No negative sum.");
        }
    }
}
