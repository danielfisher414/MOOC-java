
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();

        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {

                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int number = Integer.valueOf(parts[1]);

            if (command.equals("remove")) {
                if (number > 0) {
                    secondContainer -= number;
                }
                if (secondContainer < 0) {
                    secondContainer = 0;
                }

            } else if (command.equals("add")) {
                firstContainer.add(number);

            } else if (command.equals("move")) {
                if (number == 0) {
                    continue;
                }

                if (number > 0) {
                    if (firstContainer.contains() >= number) {
                        firstContainer.remove(number);
                        secondContainer += number;
                    } else if (firstContainer.contains() < number) {
                        secondContainer = firstContainer.contains();
                        firstContainer.remove(number);

                    }
                }
                if (secondContainer > 100) {
                    secondContainer = 100;
                }
            }
        }

    }
}
