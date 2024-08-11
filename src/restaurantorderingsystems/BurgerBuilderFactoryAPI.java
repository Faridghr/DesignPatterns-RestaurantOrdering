package restaurantorderingsystems;

/**
 *
 * An interface for a factory that provides a BurgerBuilder instance. It defines a method to obtain a BurgerBuilder for constructing Burger objects.
 * 
 */
public interface BurgerBuilderFactoryAPI {
    BurgerBuilderAPI getBurgerBuilder(); 
}
