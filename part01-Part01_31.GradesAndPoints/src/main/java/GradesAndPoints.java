
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give point [0-100]:");
        int num = Integer.valueOf(scan.nextLine());
        if (num < 0) {
            System.out.println("Grade: Impossible!");
        } else if (num <= 49) {
            System.out.println("Grade: failed");
        } else if (num <= 59) {
            System.out.println("Grade: 1");
        } else if (num <= 69) {
            System.out.println("Grade: 2");
        } else if (num <= 79) {
            System.out.println("Grade: 3");
        } else if (num <= 89) {
            System.out.println("Grade: 4");
        } else if (num <= 100) {
            System.out.println("Grade: 5");
        } else if (num >= 69) {
            System.out.println("Grade: incredible!");
        }
    }
}
