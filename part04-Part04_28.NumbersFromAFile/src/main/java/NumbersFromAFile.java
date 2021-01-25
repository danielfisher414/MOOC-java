
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> lines = new ArrayList<>();
        
        //reading the text file
        try(Scanner read = new Scanner(Paths.get(file))){
        
            while(read.hasNextLine()){
            lines.add(Integer.valueOf(read.nextLine()));
           }
        } catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        //printing the numbers
       // System.out.println(lines.get(1));
        int num =0;
        //System.out.println(lines);
        for(int i = 0; i <lines.size(); i++){
            if(lines.get(i) >= lowerBound && lines.get(i) <= upperBound ){
                num++;
            }
            
        }
        System.out.println("Numbers: "+ num);
    }

}
