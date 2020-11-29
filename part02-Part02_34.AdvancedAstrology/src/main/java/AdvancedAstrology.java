
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise

        for (int beginning = 0; beginning < number; beginning++) {
            System.out.print("*");

        }
        System.out.println();
//
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise

        for (int beginning = 1; beginning <= number; beginning++) {
            System.out.print(" ");
        }

    }
// printTriangle(4)

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int ending = 1;
        int spaceSize = size;
        spaceSize -= 1;
        int sizeUp = size;
        sizeUp += 1;

//        stars
        for (int beginningStars = 0; beginningStars <= ending; beginningStars++) {
            if (beginningStars == ending && ending < sizeUp) {
                printSpaces(spaceSize);
                spaceSize--;
                printStars(beginningStars);

                ending++;
                beginningStars = 0;

            }

        }

    }
    //                System.out.print(beginning);
    //triangle

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int ending = 1;
        int spaceSize = height;
        int oringialSpaceSize = height;
        oringialSpaceSize -= 2;
        spaceSize -= 1;
        int sizeUp = height;
        sizeUp += 1;
        int lastStarCount = 0;
        int starSum = 2;
        int numberThree = 3;

//        stars
        for (int beginningStars = 0; beginningStars <= ending; beginningStars++) {
            if (beginningStars == ending && ending < sizeUp) {
                printSpaces(spaceSize);
                spaceSize--;

                if (beginningStars == 1) {
                    printStars(beginningStars);
                }
                if (beginningStars > 1) {
                    printStars(numberThree);

                    numberThree += 2;

                }
                if (beginningStars == height) {
                    int lastTwoLines = 3;
                    printSpaces(oringialSpaceSize);

                    printStars(lastTwoLines);

                    printSpaces(oringialSpaceSize);
                    printStars(lastTwoLines);
                }

                ending++;
                beginningStars = 0;

            }

        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
//        printStars(5);
//        printSpaces(5);
        printTriangle(4);
        System.out.println("---");
        christmasTree(10);
        System.out.println("---");
//        christmasTree(4);
    }
}
