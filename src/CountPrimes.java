// computes the # of factors of an integer

import java.util.Scanner;

public class CountPrimes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int max = console.nextInt();

        int primeCount = 0;
        // test for prime number, factors = 2
        for (int i = 2; i <= max; i++) {
            if (countFactors(i) == 2) {
                // i is prime
                System.out.print(i + " ");
                primeCount++;
            }
        }
        System.out.println();
        double percent = 100.0 * primeCount / max;
        System.out.printf("%d primes (%.2f%%)", primeCount, percent);
    }

    public static int countFactors(int number) {
        // look at each integer i to number
        int count = 0;
        for (int i = 1; i <= number; i++) {
            // see whether i is a factor of number
            // count this and return result
            if (number % i == 0) {
                final int i1 = count++;
            }
        }
    return count;
    }
}
