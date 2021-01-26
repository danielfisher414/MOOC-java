/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Items {

    private String identifier;
    private String name;

    public Items(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;

    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return this.name;
    }

    public String getString() {

        return this.identifier + ": " + this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Items)) {
            return false;
        }
        Items comparedItems = (Items) compared;

        return this.identifier.equals(comparedItems.identifier);
    }
}
