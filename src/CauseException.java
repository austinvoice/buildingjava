// test conditional exception

import java.util.Scanner;

public class CauseException {
    public static void main(String[] args) {
        double x = 1.0 / 0.0;
        System.out.println(x);
        System.out.println();

        // get input from user and compute factorial
        Scanner console = new Scanner(System.in);
        System.out.print("Factorial to calculate? ");
        int number = console.nextInt();
        for (int i = 1; i <=  number; i++) {
            System.out.printf("%4d! = %12d\n", i, factorial(i));
        }

        System.out.println();

        // get input from user and rate SAT score
        System.out.print("SAT score (800-1600)? ");
        int totalSAT = console.nextInt();
        System.out.println(rating(totalSAT));
    }

    // calculate rating for a given SAT score
    public static String rating(int totalSAT) {
        // pre condition or throw exception
        if (totalSAT < 400 || totalSAT > 1600){
            throw new IllegalArgumentException("Total: " + totalSAT);
        }
        else if (totalSAT < 800) {
            return "Not competitive";
        }
        else if (totalSAT > 1200) {
            return "Highly competitive";
        }
        else {
            return "Competitive";
        }
    }

    // calculate factorial to a max number
    public static int factorial(int number) {
        int product = 1;
        for (int i = 2; i <= number; i++) {
            product *= i;
        }
        return product;
    }





}
