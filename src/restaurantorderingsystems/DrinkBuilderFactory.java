package restaurantorderingsystems;

/**
 *
 * A concrete implementation of DrinkBuilderFactoryAPI. It creates and returns instances of DrinkBuilder. This class is used to encapsulate the creation logic for DrinkBuilder instances.
 * 
 */
class DrinkBuilderFactory implements DrinkBuilderFactoryAPI { 
    @Override 
    public DrinkBuilderAPI getDrinkBuilder() { 
        return new DrinkBuilder(); 
    } 
} 
