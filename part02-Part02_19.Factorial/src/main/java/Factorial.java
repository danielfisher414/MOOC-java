
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lastNum = 1;
        int totalSum = 1;

        System.out.println("Give a number: ");
        int firstNum = 1;

        for (int input = Integer.valueOf(scanner.nextLine()); firstNum <= input; firstNum++) {

            int sum = 0;

            sum += firstNum;
            totalSum *= sum;

//            System.out.println("Sum: " + sum);
            System.out.println("Factorial: " + totalSum);
//            System.out.println("firstNum: "+ firstNum);

//            firstNum = firstNum--;
//            secondNum = secondNum--;
        }

    }
}
