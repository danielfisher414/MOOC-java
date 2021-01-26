
public class HealthStation {

    private int count;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.count += 1;

        return person.getWeight();
    }

    public void feed(Person person) {
        int weight = person.getWeight();
        weight += 1;
        person.setWeight(weight);
    }

    public int weighings() {

        return this.count;
    }

}
