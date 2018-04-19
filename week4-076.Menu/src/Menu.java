
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    
    public void addMeal(String meal){
        if(meals.contains(meal) == false){
        meals.add(meal);
    }
    }
        
        public void printMeals(){
            for(String name : meals)
                System.out.println(name);
        }
        
        public void clearMenu(){
            meals.clear();
        }
    }

