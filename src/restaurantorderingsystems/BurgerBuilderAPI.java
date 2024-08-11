package restaurantorderingsystems;

/**
 *
 * An interface similar to DrinkBuilderAPI and FriesBuilderAPI, but for building Burger objects. It includes methods to set properties of a Burger and a build() method to create the Burger instance.
 * 
 */
public interface BurgerBuilderAPI { 
    BurgerBuilderAPI setId(int id); 
    BurgerBuilderAPI setCost(double cost); 
    BurgerBuilderAPI setName(String name); 
    Burger build(); 
}
