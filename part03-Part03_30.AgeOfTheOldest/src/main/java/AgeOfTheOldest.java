
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumBigger = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("Age of the oldest: " + sumBigger);
                break;

            }

            String[] parts = input.split(",");

            int sum = Integer.valueOf(parts[1]);

            if (sumBigger < sum) {
                sumBigger = sum;

            }

        }

    }
}
