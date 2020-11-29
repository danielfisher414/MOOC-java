
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        int input;
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
                System.out.println("Number of numbers: " + num);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }

    }
}
