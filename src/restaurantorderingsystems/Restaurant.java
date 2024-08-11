package restaurantorderingsystems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * The Restaurant class is a singleton that manages the menu and orders within the restaurant. It provides methods for adding and removing menu items, handling orders, and processing payments.
 * 
 * The class ensures there is only one instance of the restaurant throughout the application, which is accessed through the getInstance() method.
 */
public class Restaurant {
    private static Restaurant instance;
    private List<MenuItemAPI> menu;
    private List<OrderObservableAPI> orders; 

    private Restaurant() {
        menu = new ArrayList<>();
	orders = new ArrayList<>();
    }

    public static Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }

    public void addMenuItem(MenuItemAPI item) {
        menu.add(item);
    }

    public void removeMenuItem(MenuItemAPI item) {
        menu.remove(item);
    }

    public MenuItemAPI getItemById(int id) {
        for (MenuItemAPI item : menu) {
            if (item instanceof Drink && ((Drink) item).id == id) return item;
            if (item instanceof Fries && ((Fries) item).id == id) return item;
            if (item instanceof Burger && ((Burger) item).id == id) return item;
        }
        return null; // Or throw an exception if preferred
    }

    public void addOrder(OrderObservableAPI order) {
        System.out.println("The order is placed: " + order + "\n");
        orders.add(order);
	order.placeOrder();
    }

    public void removeOrder(OrderObservableAPI order) {
        orders.remove(order);
    }

    public void payOrder(OrderObservableAPI order, double amount) {
        order.processPayment(amount);
	removeOrder(order);
    }

    public void showMenu() {
        for (MenuItemAPI item : menu) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}
