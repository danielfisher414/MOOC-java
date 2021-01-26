
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        //starts the text user interface
        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if (input.equals("stop")) {

                break;
            }

            if (input.equals("add")) {

                System.out.print("To add: ");
                String word = this.scanner.nextLine();
                list.add(word);
                continue;
            } else if (input.equals("list")) {

                this.list.print();

                continue;

            } else if (input.equals("remove")) {

                System.out.print("Which one is removed? ");
                int removeNum = Integer.valueOf(scanner.nextLine());

                list.remove(removeNum);
                continue;
            }

        }

    }

}
