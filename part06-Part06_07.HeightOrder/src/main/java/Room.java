
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
public class Room {

    ArrayList<Person> personList;

    public Room() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);

    }

    public boolean isEmpty() {
        if (this.personList.isEmpty()) {
            return true;
        }

        return false;
    }

    public ArrayList<Person> getPersons() {

        return personList;
    }

    public Person shortest() {
        if (personList.isEmpty()) {
            return null;
        }

        Person shortestPerson = personList.get(0);

        for (Person people : personList) {
            if (shortestPerson.getHeight() > people.getHeight()) {
                shortestPerson = people;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (personList.isEmpty()) {
            return null;
        }

        Person shortestPerson = personList.get(0);

        for (Person people : personList) {
            if (shortestPerson.getHeight() > people.getHeight()) {
                shortestPerson = people;
            }
        }

        personList.remove(shortestPerson);

        return shortestPerson;
    }

}
