
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
public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> luggages;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        luggages = new ArrayList<>();

    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = 0;
        ArrayList<Suitcase> toRemove = new ArrayList<>();

        luggages.add(suitcase);

        for (Suitcase objs : luggages) {
            weight += objs.totalWeight();

            if (weight > this.maximumWeight) {
                toRemove.add(suitcase);

                weight -= objs.totalWeight();
            }
        }

        luggages.removeAll(toRemove);

    }

    public void printItems() {
        for (Suitcase items : luggages) {
            items.printItems();
        }

    }

    public String toString() {
        int items = 0;
        int weight = 0;
        for (Suitcase objs : luggages) {
            items++;
            weight += objs.totalWeight();
        }

        return items + " suitcases " + "(" + weight + " kg)";
    }
}
