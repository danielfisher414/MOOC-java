
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());
        int end = 100;

        for (int start = input; start <= end; start++) {

            System.out.println(start);

        }

    }
}
