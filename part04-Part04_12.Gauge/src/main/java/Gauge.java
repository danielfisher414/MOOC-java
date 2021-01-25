/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Gauge {

    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (this.value < 5) {

            this.value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }

    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        boolean check = false;
        if (this.value == 5) {
            check = true;
        }
        return check;
    }

}
