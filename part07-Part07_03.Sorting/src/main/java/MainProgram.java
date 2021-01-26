
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {-10, 15, 6, 2, 7, 1, 3, 7, 5};
        System.out.println(MainProgram.smallest(numbers));

    }

    public static int smallest(int[] array) {
        int check = 0;
        int smallest = 0;
        int expectedSmallNum = 0;
        for (int index = 0; index < array.length; index++) {

            if (array[expectedSmallNum] > array[index]) {
                smallest = array[index];
                expectedSmallNum = index;
                check++;
            }
            
       // smallest keeps saying 10, do an additional check where if smallest is zero and index is 0. then the number is -10
       //otherwise it is not
            if(smallest == 0 && check == 0){
            smallest = array[0];
            }
            
        }
       
        
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int count = 0;
        int indexOfSmallest = 0;

        for (int index = 0; index < array.length; index++) {

            if (smallest > array[index]) {

                smallest = array[index];
//            return index;
            }
            if (array[index] == smallest) {
                indexOfSmallest = count;
            }
            count++;

        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
//this will start at the index that was set
        int startNum = table[startIndex];
        int smallestIndex = startIndex;

        while (startIndex < table.length) {
//            System.out.println(startIndex);
            if (startNum > table[startIndex]) {

                startNum = table[startIndex];

                smallestIndex = startIndex;
            }
            startIndex++;
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int number1 = array[index1];
        int number2 = array[index2];
        //the transfer has converted number2 to it. So number2 cant be changed
        int transfer = number2;
//        System.out.println(transfer);
        array[index1] = array[index2];
        array[index2] = number1;
    }

    public static void sort(int[] array) {
        int smallestIndex = 0;
        int startSortIndex = 0;
//        System.out.println(array.length);
//        System.out.println(Arrays.toString(array));
        for (int count = 0; count < array.length; count++) {
            System.out.println(Arrays.toString(array));
            smallestIndex = indexOfSmallestFrom(array, startSortIndex);
            swap(array, startSortIndex, smallestIndex);
            startSortIndex++;

        }

    }
}
