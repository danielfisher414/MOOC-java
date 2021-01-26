
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<>();

        String identifier = "";
        String name = "";

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String input = scanner.nextLine();

            if (input.isEmpty()) {

                break;
            }

            identifier = input;

            System.out.println("Name? (empty will stop)");

            input = scanner.nextLine();

            if (input.isEmpty()) {

                break;

            }
            name = input;

            Items item = new Items(identifier, name);

            if (!items.contains(item)) {
                items.add(item);
            }

        }
        System.out.println("==Items==");
        //for each loop for the items
        for (Items num : items) {
            System.out.println(num.getString());
        }

    }
}
