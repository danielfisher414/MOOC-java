
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        while (true) {

            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());

            if (num <= -1) {
                sum += 1;
                continue;
            } else if (num > 0) {
                continue;
            } else if (num == 0) {
                System.out.println("Number of negative numbers: " + sum);
                break;
            }

        }

    }
}
