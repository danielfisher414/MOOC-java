
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();

        // user will input the name of the file
        System.out.println("Name of the file:");
        String nameOfFile = scanner.nextLine();

        System.out.println("");

        try ( Scanner read = new Scanner(Paths.get(nameOfFile))) {

            while (read.hasNextLine()) {
                lines.add(read.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // the while loop to allow the user to input a name
        System.out.println("Enter names, an empty line quits");
        while (true) {
            
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            if (lines.contains(name)) {
                System.out.println("The name is on the list.");
            } else{
                System.out.println("The name is not on the list");}
            
        }
        System.out.println("Thank you!");
        

    }
}
