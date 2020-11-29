
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        int firstSum = firstNum+secondNum;
        int secondSum = firstNum-secondNum;
        int thirdSum = firstNum * secondNum;
        
        double firstDividedNum = firstNum;
        double secondDividedNum = secondNum;
        
        double fourthSum = firstDividedNum / secondDividedNum;
        
        
        System.out.println(firstNum + " + "+ secondNum+ " = " + firstSum);
        System.out.println(firstNum + " - "+ secondNum+ " = " + secondSum);
        System.out.println(firstNum + " * "+ secondNum+ " = " +  thirdSum);
        System.out.println(firstNum + " / "+ secondNum+ " = " + fourthSum);
        
    }
}
