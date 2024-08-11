package restaurantorderingsystems;

/**
 *
 * An interface for a factory that provides a DrinkBuilder instance. It defines a method for obtaining a DrinkBuilder that can be used to construct Drink objects.
 * 
 */
public interface DrinkBuilderFactoryAPI {
    DrinkBuilderAPI getDrinkBuilder();
}
