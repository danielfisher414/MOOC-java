
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageIndicator = 0;
        String oldest = "";
        while (true) {

            String input = scanner.nextLine();
            String[] parts = input.split(",");
            if (input.equals("")) {
                System.out.println("Name of the oldest: " + oldest);
                break;
            }

            int age = Integer.valueOf(parts[1]);
            String name = parts[0];

            if (ageIndicator < age) {
                ageIndicator = age;
                oldest = name;
            }

        }

    }
}
