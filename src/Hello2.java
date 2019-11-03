// creates an output file and writes

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Hello2 {
    public static void main(String [] args) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("hello.txt"));

        // text of file
        output.println("Hello world!");
        output.println();
        output.println("This program produces four");
        output.println("lines of output");
    }
}
