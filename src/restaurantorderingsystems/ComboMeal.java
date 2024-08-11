package restaurantorderingsystems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *  A concrete implementation of MenuItemAPI and MenuComponentAPI. It represents a combination of multiple menu items bundled together, with methods to add and remove items, calculate a combined price, and prepare the combo meal.
 * 
 */
public class ComboMeal extends MenuItemAPI implements MenuComponentAPI {
    private List<MenuItemAPI> items = new ArrayList<>();
    private int id;    

    public ComboMeal(int id, String name) {
        this.name = name;
	this.id = id;
    }

    @Override
    public void add(MenuItemAPI item) {
        items.add(item);
    }

    @Override
    public void remove(MenuItemAPI item) {
        items.remove(item);
    }

    @Override
    public List<MenuItemAPI> getComponents() {
        return items;
    }

    @Override
    public double getPrice() {
        double comboPrice = 0.0;
        for (MenuItemAPI item : items) {
            comboPrice += item.getPrice();
        }
        // Apply a discount for combo (e.g., 10% off)
        return comboPrice * 0.9;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing combo: " + name);
        for (MenuItemAPI item : items) {
            item.prepare();
        }
    }

    @Override
    public String toString() {
        return "Combo item {id= " + id + " , cost= " + price + " , name= " + name + " }";
    }
}
