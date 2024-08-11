package restaurantorderingsystems;

/**
 *
 * An interface similar to DrinkBuilderAPI, but for building Fries objects. It includes methods for setting properties of a Fries item and a build() method to create the Fries instance.
 * 
 */
interface FriesBuilderAPI { 
    FriesBuilderAPI setId(int id); 
    FriesBuilderAPI setCost(double cost); 
    FriesBuilderAPI setName(String name); 
    Fries build(); 
}
