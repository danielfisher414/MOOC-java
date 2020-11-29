
public class Smallest {

    public static int smallest(int number1, int number2) {
        // Write some code here
        int num = 0;
        if (number1 > number2) {
            num = number2;
        } else if (number2 > number1) {
            num = number1;
        }
        // don't print anything inside this method
        // there must be a return in the end of the method
        return num;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
