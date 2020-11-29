
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int firstSum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondSum = Integer.valueOf(scanner.nextLine());
        int totalSum = firstSum * secondSum;
        System.out.println(firstSum + " * " + secondSum+ " = " + totalSum);
    }
}
