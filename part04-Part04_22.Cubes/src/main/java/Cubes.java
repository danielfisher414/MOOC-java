
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        int sum;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            number = Integer.valueOf(input);
           sum = number * number * number;
            System.out.println(sum); 
        }
        
    }
}
