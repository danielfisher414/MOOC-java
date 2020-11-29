
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string: ");
        String firstNum = scan.nextLine();
        
        
        System.out.println("Give an integer: ");
        int secondNum = Integer.valueOf(scan.nextLine());
        
        
        System.out.println("Give a double: ");
        double thirdNum = Double.valueOf(scan.nextLine());
        
        
        System.out.println("Give a boolean: ");
        boolean fourthNum = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + firstNum);
        System.out.println("You gave the integer " + secondNum);
        System.out.println("You gave the double " + thirdNum);
        System.out.println("You gave the boolean " + fourthNum);
        
    }
}
