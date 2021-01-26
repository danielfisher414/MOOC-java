/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Container {

    private int amount;
    private int container;
    private int container2;
    
    public Container() {
        this.amount = amount;
        this.container = container;
        this.container2 = container2;
    }

    public int contains() {

        return this.container;
    }

    public void add(int amount) {
        if (amount < 0) {
            amount = 0;
        }

        this.container += amount;

        if (this.container > 100) {
            this.container = 100;
        }

    }

    public void remove(int amount) {
        this.container -= amount;
        if (this.container < 0) {
            this.container = 0;
        }
    }

    public String toString() {

        return this.container + "/100";
    }

}
