package restaurantorderingsystems;

/**
 *
 * An enum-based singleton that ensures only one instance of FriesBuilderFactory exists. It provides a global access point to the FriesBuilderFactory instance.
 * 
 */
enum SingletonFriesBuilderFactoryEnum { 
    INSTANCE; 

    private final FriesBuilderFactoryAPI friesBuilderFactory; 

    SingletonFriesBuilderFactoryEnum() { 
        friesBuilderFactory = new FriesBuilderFactory(); 
    } 

    public FriesBuilderFactoryAPI getFriesBuilderFactory() { 
        return friesBuilderFactory; 
    } 
}
