import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        String[] array = {"steve", "bob", "nadaniel","abdul"};
        Main.sort(array);
//        System.out.println(array);
//    boolean decider = false;
        for(int index = 0; index < array.length;index++){
            System.out.print(array[index]+" ");
            
        }
//        System.out.println(decider);
        
    }
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    public static void sort(String[] array){
        Arrays.sort(array);
//        System.out.println(Arrays.sort(array));
        
    }
    public static void sortIntegers(ArrayList<Integer> integers){
    Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
    Collections.sort(strings);
    }
}
