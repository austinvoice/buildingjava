// import file and create formatted output

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnderlineFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("out/production/Builidng Graphics/paper.txt"));
        expandFile(input);
    }

    public static void expandFile(Scanner input) {
        while (input.hasNextLine()) {
            String text = input.nextLine();
            if (text.length() > 0 && text.startsWith(".")) {
                System.out.println(text.substring(1));
                for (int i = 1; i <= text.length() - 1; i++) {
                    System.out.print("-"); // underline
                }
                System.out.println();
            } else {
                System.out.println(text);
            }
        }
    }
}
