
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class JokeManager {

    private ArrayList<String> list;

    public JokeManager() {
        this.list = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.list.add(joke);
    }

    public String drawJoke() {
        if (this.list.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random random = new Random();
        String randomElement = this.list.get(random.nextInt(this.list.size()));

        return randomElement;
    }

    public void printJokes() {
        for (String word : this.list) {
            System.out.println(word);
        }
    }
}
