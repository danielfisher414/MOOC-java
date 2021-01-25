
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfName = 0;
        String longName = "";
        double average = 0;
        int points = 0;
        while (true) {
            //this is my points to be used for the average
            points++;
            String input = scanner.nextLine();

            if (input.equals("")) {
                points -= 1;
                average = average / points;
                System.out.println("Longest name: " + longName);

                System.out.println("Average of the birth years: " + average);

                break;
            }

            String[] parts = input.split(",");
            String name = parts[0];
            Double number = Double.valueOf(parts[1]);

            average += number;
            //works used for finding the longest name
            if (sizeOfName < name.length()) {
                sizeOfName = name.length();
                longName = name;

            }

        }

    }
}
