
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int num = 0;
        if (number1 > number2 && number1 > number3) {
            num = number1;
        } else if (number2 > number3 && number2 > number3) {
            num = number2;
        } else if (number3 > number2 && number3 > number1) {
            num = number3;
        } else if (number1 == number2 && number1 == number3) {
            num = number1;
        }

        return num;
    }

    public static void main(String[] args) {
        int result = greatest(9, 9, 9);
        System.out.println("Greatest: " + result);
    }
}
