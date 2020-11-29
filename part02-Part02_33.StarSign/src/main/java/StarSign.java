
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(5);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        int beginning = 0;

        while (beginning < number) {
            System.out.print("*");
            beginning++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int beginning = 0;
        int nothing = 0;
        int starSize;
        starSize = size * size;

        while (nothing < size) {
            System.out.print("*");

            nothing++;
            beginning++;
            if (nothing == size && beginning != starSize) {
                System.out.println("");
                nothing -= size;
            }

        }

    }
// width = 5 height = 6

    public static void printRectangle(int width, int height) {
        // third part of the exercise

        int beginningWidth = 0;
        int beginningHeight = 0;
        int overalSize = width * height;
        int zeroHeight = 1;

        while (beginningWidth < width) {
            System.out.print("*");

            beginningWidth++;

            if (beginningWidth == width && zeroHeight != height) {
                System.out.println("");
                beginningWidth -= width;
                zeroHeight++;

            }
        }

    }
// triangle size = 3

    public static void printTriangle(int size) {
        // fourth part of the exercise

        int stars = size;
        int input = 0;

        while (input < size) {
            input++;
//            System.out.print(input);
            if (stars == 0 || size == 0) {
                break;
            }

            if (input > stars) {

                System.out.print("*");
            }

            if (input == size) {
                System.out.println("*");
                input = 0;
                stars--;
            }

        }

    }
}
