
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int stars = 1;
        int starsIndex = 0;
        for (int index = 0; index < array.length; index++) {

            while (starsIndex < array[index]) {
                System.out.print("*");

                starsIndex++;
            }

            if (starsIndex == array[index]) {
                System.out.println("");
                starsIndex = 0;

            }

        }
    }

}
