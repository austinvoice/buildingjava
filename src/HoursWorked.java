// import file and interpret data for hours worked

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HoursWorked {
    public static void main(String[] args) throws FileNotFoundException {
        // request user input to match ID
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        int desiredID = console.nextInt();
        boolean found = false;

        Scanner input = new Scanner(new File("out/production/Builidng Graphics/hours.txt"));

        while (input.hasNextLine()) {
            // input tokens from data for one employee
            // takes one line and tokenize
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);

            // take in token from line and assign to variables
            int id = lineScan.nextInt();
            if (id == desiredID) {
                double totalHours = 0.0;
                String name = lineScan.next();
                int days = 0;
                found = true;

                // read line until no next double
                while (lineScan.hasNextDouble()) {
                    totalHours += lineScan.nextDouble();
                    days++;
                }
                // print formatted statement of results from input
                System.out.printf("%s (ID# %d) worked %.2f hours (%.2f hours/day).\n",
                        name, id, totalHours, totalHours / days);
            }
        }
        if (!found) {
            System.out.printf("ID #%d not found.\n", desiredID);
        }
    }
}
