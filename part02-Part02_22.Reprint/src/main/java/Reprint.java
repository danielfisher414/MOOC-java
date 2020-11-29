
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        System.out.println("How many times?");
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop

        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());
        int x = 1;
        int reprint = 0;
        while (x <= input) {
            reprint = x++;

            printText();
        }

    }

    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        // write some code here

        System.out.println("In a hole in the ground there lived a method");

    }
}
