
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.valueOf(scanner.nextLine());
        int secondNum = Integer.valueOf(scanner.nextLine());

        if (firstNum > secondNum) {
            System.out.println(firstNum + " is greater than " + secondNum + ".");
        } else if (firstNum < secondNum) {
            System.out.println(firstNum + " is smaller than " + secondNum + ".");
        } else if (secondNum < firstNum) {
            System.out.println(secondNum + " is smaller than " + firstNum + ".");
        } else if (secondNum == firstNum) {
            System.out.println(secondNum + " is equal to " + firstNum + ".");
        } else {
            System.out.println("Try again.");
        }

    }
}
