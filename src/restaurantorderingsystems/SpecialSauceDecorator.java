package restaurantorderingsystems;

/**
 *
 * Concrete implementations of OrderItemDecoratorAPI. These classes represent specific types of decorations (e.g., extra cheese, special sauce) that can be added to menu items to modify their name and price.
 * 
 */
public class SpecialSauceDecorator extends OrderItemDecoratorAPI {
    public SpecialSauceDecorator(MenuItemAPI menuItem) {
        super(menuItem);
    }

    @Override
    public String getName() {
        return menuItem.getName() + " + Special Sauce";
    }

    @Override
    public double getPrice() {
        return menuItem.getPrice() + 0.75;
    }
    
    @Override
    public void prepare() {
        menuItem.prepare();
    }
}
