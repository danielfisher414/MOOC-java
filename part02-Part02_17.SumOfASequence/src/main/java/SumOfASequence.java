
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int end = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int start = 0; start <= end; start++) {
            sum += start;

            if (start == end) {
                System.out.println("The sum is " + sum);
            }
        }
    }
}
