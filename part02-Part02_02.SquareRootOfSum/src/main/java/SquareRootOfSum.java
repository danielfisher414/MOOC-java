
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.valueOf(scanner.nextLine());
        int secondNum = Integer.valueOf(scanner.nextLine());
        int bothNums=firstNum + secondNum;
        
        double squareRoot = Math.sqrt(bothNums);
        
        System.out.println(squareRoot);
    }
}
