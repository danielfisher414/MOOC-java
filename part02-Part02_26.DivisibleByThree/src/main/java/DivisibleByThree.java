
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(1, 13);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        if(beginning == 1){
            beginning += 2;
        }
        while (beginning <= end) {
            System.out.println(beginning);
            if (end % 2 == 0 && end % 3 == 0) {
                end += 0;

            } else if (end % 2 == 0) {
                end += 2;
            }
            if (beginning % 2 == 0 && beginning % 3 == 0) {
                beginning += 3;
            } else if (beginning % 2 == 0) {
                beginning += 1;
            } else if (beginning == 1 || beginning == 11) {
                beginning += 2;
            } else if (beginning % 3 == 0) {
                beginning += 3;
            }
            if (beginning > end) {
                beginning -= 3;
                break;
            }

//            System.out.println(beginning);
        }
    }
}
