package restaurantorderingsystems;

/**
 *
 * An enum-based singleton that ensures there is only one instance of DrinkBuilderFactory. It provides a global point of access to the DrinkBuilderFactory instance, leveraging the Singleton design pattern.
 * 
 */
enum SingletonDrinkBuilderFactoryEnum { 
    INSTANCE; 

    private final DrinkBuilderFactoryAPI drinkBuilderFactory; 

    SingletonDrinkBuilderFactoryEnum() { 
        drinkBuilderFactory = new DrinkBuilderFactory(); 
    } 

    public DrinkBuilderFactoryAPI getDrinkBuilderFactory() { 
        return drinkBuilderFactory; 
    } 
}
