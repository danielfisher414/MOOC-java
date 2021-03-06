
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner read = new Scanner(Paths.get(file))) {

            while (read.hasNextLine()) {
                lines.add(read.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file "  + file + " failed");
            return;
        }

        

        if (lines.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
