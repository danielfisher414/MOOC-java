
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {58, 10};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        for (int index = 0; index < array.length; index++) {

            System.out.print(array[index]);
            if (index != array.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
