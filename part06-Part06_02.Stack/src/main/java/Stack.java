
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class Stack {

    ArrayList<String> array;

    public Stack() {
        this.array = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.array.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<String> values() {

        return this.array;
    }

    public void add(String value) {
        this.array.add(value);
    }

    public String take() {
        String lastValue = this.array.get(array.size() - 1);
        this.array.remove(array.size() - 1);
        return lastValue;
    }

}
