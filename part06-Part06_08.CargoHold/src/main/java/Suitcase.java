
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
public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int weight = 0;
        ArrayList<Item> toRemove = new ArrayList<>();

        items.add(item);

        for (Item numOfItems : items) {
            weight += numOfItems.getWeight();

            if (weight > this.maximumWeight) {
                weight -= numOfItems.getWeight();
                toRemove.add(item);
            }
        }
        items.removeAll(toRemove);

    }

    public void printItems() {
        for (Item allItems : items) {
            System.out.println(allItems);
        }
    }

    public int totalWeight() {
//        System.out.println("Total Weight ");
        int totalWeight = 0;
        for (Item allWeight : items) {
            totalWeight += allWeight.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {

        if (this.items.isEmpty()) {
            return null;
        }

        Item returnObject = this.items.get(0);
        for (Item obs : this.items) {
            if (returnObject.getWeight() < obs.getWeight()) {
                returnObject = obs;
            }

        }

        return returnObject;
    }

    public String toString() {
        int weight = 0;
        String wordItems = " items";

        for (Item totalOfItems : items) {
            weight += totalOfItems.getWeight();
        }
        if (items.size() == 0) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            wordItems = " item";
        }

        return this.items.size() + wordItems + " (" + weight + " kg)";
    }
}
