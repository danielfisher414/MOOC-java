
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int start = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number?");
        int end = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        while (start <= end) {

            sum += start++;

//            System.out.println(start);
            if (start == end) {
                int totalSum = 0;
                totalSum = sum + end;
                System.out.println("The sum is: " + totalSum);

            }
        }

    }
}
