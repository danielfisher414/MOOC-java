
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Where to below
        System.out.println("Where to?");

        int inputEnd = Integer.valueOf(scanner.nextLine());

        // Where from Below
        System.out.println("Where from?");

        int inputStart = Integer.valueOf(scanner.nextLine());

        for (int start = inputStart; start <= inputEnd; start++) {
            System.out.println(start);

        }

    }
}
