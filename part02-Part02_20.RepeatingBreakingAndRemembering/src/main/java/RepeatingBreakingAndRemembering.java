
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int totalSum = 0;
        int numberCount = 0;
        double average = 0.0;
        double averageCount = 0.0;
        double averageSum = 0.0;
        int even = 0;
        int odd = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input != -1) {
                sum += input;
                totalSum = sum;
                numberCount++;
                averageCount++;
                averageSum = totalSum;

                average = averageSum / averageCount;

            }
            if (input % 2 == 0) {
                even++;
            } else if (input % 2 != 0 && input != -1) {
                odd++;
            }
            if (input == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + totalSum);
                System.out.println("Numbers: " + numberCount);
                System.out.println("Average: " + average);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);

                break;
            }

        }
    }

}
