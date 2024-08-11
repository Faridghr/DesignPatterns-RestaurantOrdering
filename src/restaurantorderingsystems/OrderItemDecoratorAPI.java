package restaurantorderingsystems;

/**
 *
 * An abstract class that extends MenuItemAPI and acts as a decorator for adding extra features to menu items. It allows dynamic enhancement of menu items (e.g., adding extra cheese) by extending their functionality.
 * 
 */
public abstract class OrderItemDecoratorAPI extends MenuItemAPI {
    protected MenuItemAPI menuItem;

    public OrderItemDecoratorAPI(MenuItemAPI menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public abstract String getName();

    @Override
    public abstract double getPrice();
}
