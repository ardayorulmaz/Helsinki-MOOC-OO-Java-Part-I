
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;
    private String meal;
    

    public void addMeal(String meal) {
        
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String food : this.meals) {
            System.out.println(food);
        }
    }

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void clearMenu() {
        this.meals.clear();
    }

    // add the methods here
}
