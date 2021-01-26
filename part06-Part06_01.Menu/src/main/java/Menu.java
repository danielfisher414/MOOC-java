
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }

    }

    public void printMeals() {
        for (int count = 0; count < this.meals.size(); count++) {
            System.out.println(this.meals.get(count));
        }
    }

    public void clearMenu() {

        for (int lastNumber = this.meals.size() - 1; lastNumber >= 0; lastNumber--) {
            this.meals.remove(lastNumber);
        }
    }
}
