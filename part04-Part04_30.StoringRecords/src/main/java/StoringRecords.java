
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        
        String name;
        int age;
        try(Scanner read = new Scanner(Paths.get(file))){
        
            while(read.hasNextLine()){
            String line = read.nextLine();
            String parts[] = line.split(",");
            name = parts[0];
            age = Integer.valueOf(parts[1]);
            
            persons.add(new Person(name,age));
            
            }
        } catch(Exception e){
            System.out.println("Error with the file: "+ file);}
        
        return persons;

    }
}
