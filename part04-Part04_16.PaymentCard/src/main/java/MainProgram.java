
public class MainProgram {

    public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.print("Paul: ");
        System.out.println(paulsCard);
        System.out.print("Matt: ");
        System.out.println(mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.print("Paul: ");
        System.out.println(paulsCard);
        System.out.print("Matt: ");
        System.out.println(mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.print("Paul: ");
        System.out.println(paulsCard);
        System.out.print("Matt: ");
        System.out.println(mattsCard);
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
    }
}
