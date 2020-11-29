
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double num = 0;
        int input;

        while (true) {
            input = Integer.valueOf(scanner.nextLine());

            if (input > 0) {
                sum += input;
                num += 1;
                continue;
            } else if (input == 0 && sum == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (input == 0) {
                System.out.println(sum / num);

                break;
            }

        }

    }
}
