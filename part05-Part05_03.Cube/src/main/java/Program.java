
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube c = new Cube(7);
        System.out.println(c.toString());

        System.out.println();

        Cube d = new Cube(3);
        System.out.println(d.toString());

    }
}
