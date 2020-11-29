
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        int sumTotal = 0;
        sumTotal = number1 + number2 + number3 + number4;

        return sumTotal;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        
        double averageReturn = 0;
        averageReturn = sum(number1, number2, number3, number4) / 4.0;

       
        return averageReturn;
    }

    public static void main(String[] args) {
        double result = average(1, 2, 3, 4);
        System.out.println("Average: " + result);
    }
}
