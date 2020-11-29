
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        double num = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");

            input = Integer.valueOf(scanner.nextLine());

            if (input > 0) {
                sum += input;
                num += 1;
                continue;
            } else if (input < 0) {
                sum += input;
                num += 1;
                continue;
            } else if (input == 0) {

                System.out.println("Average of the numbers: " + sum / num);
                break;
            }
        }
    }
}
