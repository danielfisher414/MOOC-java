
public class Division {

    public static void main(String[] args) {

        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
        division(3, 5);
    }

    // implement the method here
    public static void division(int numberator, int denomiator) {
        double number = 0;
        double devision = 0;
        double division = 0;
        double numberatorForDecimal = numberator;
        double denomiatorForDecimal = denomiator;
        number += numberator / denomiator;
        double decimal = numberatorForDecimal/denomiatorForDecimal;
        number = numberator/denomiator;
//        System.out.println("numberator: " + numberator + " denomiator: "+ denomiator);
        
        System.out.println(decimal);
    }
}
