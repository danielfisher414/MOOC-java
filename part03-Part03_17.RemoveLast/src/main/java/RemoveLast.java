
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here

        ArrayList<String> strings = new ArrayList<>();
//        strings.add("First");
//        strings.add("Second");
//        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            System.out.println("");
        } else if (strings.size() >= 0) {
            strings.remove(strings.size() - 1);
        }
        System.out.println(strings);
    }

}
