package restaurantorderingsystems;

/**
 *
 * Concrete implementations of OrderItemDecoratorAPI. These classes represent specific types of decorations (e.g., extra cheese, special sauce) that can be added to menu items to modify their name and price.
 * 
 */
public class ExtraCheeseDecorator extends OrderItemDecoratorAPI {
    public ExtraCheeseDecorator(MenuItemAPI menuItem) {
        super(menuItem);
    }

    @Override
    public String getName() {
        return menuItem.getName() + " + Extra Cheese";
    }

    @Override
    public double getPrice() {
        return menuItem.getPrice() + 1.00;
    }

    @Override
    public void prepare() {
        menuItem.prepare();
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
}
