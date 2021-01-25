
import java.nio.file.Paths;
import java.util.Scanner;

import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Name of the file: ");
        String nameOfFile = scanner.nextLine();

        try ( Scanner read = new Scanner(Paths.get(nameOfFile))) {

            while (read.hasNextLine()) {    
                lines.add(read.nextLine());
                
            }
        } catch (Exception e) {
            System.out.println("Error in the file: " + nameOfFile);
        }
        
        
       // System.out.println(lines);
        //converting arraylist to string;
        int count = 0;
        String listString = "";
        for(String s : lines){
            listString += lines;
            count++;
            if(count == 1){
            break;}
           
        }
       String modifiedList = listString.replace("[","").replace("]","").replace(", "," ");
      //  System.out.println(modifiedList);
        //prints: [lily,3, anton,5, levi,4, amy,1]
       String[] parts = modifiedList.split(" ");
        
      // System.out.println(parts[0]);
       // prints: lilly,3
       
        int lastPart = parts.length;
        lastPart -= 1;
        for(int index = 0; index <= lastPart;index++){
        String person = parts[index];

       String[] finalParts = person.split(",");
       
       String name = finalParts[0];
       int age = Integer.valueOf(finalParts[1]);
       
       String years = " years";
       
       if (age ==1){
       years = " year";
       }
       
        System.out.println(name+","+" age: "+age +years);
        }
//        for(int i =0 ; i < 4 ;i++){
//        
//        
//        System.out.println(finalParts[indexForName]);
//        System.out.println(finalParts[indexForAge]);    
//        
//        indexForName += 2;
//        indexForAge +=2;
//        
//        }
        
        
        
    }
}
