package restaurantorderingsystems;

/**
 *
 * An abstract class that represents a single item in the menu. It includes attributes such as name, price, and methods for preparing the item and getting its price. It can be extended by concrete menu item classes.
 *
 */
public abstract class MenuItemAPI {
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void prepare();
}