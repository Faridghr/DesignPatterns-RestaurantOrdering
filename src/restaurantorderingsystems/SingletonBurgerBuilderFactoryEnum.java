package restaurantorderingsystems;

/**
 *
 * An enum-based singleton that ensures there is only one instance of BurgerBuilderFactory. It provides a global point of access to the BurgerBuilderFactory instance.
 * 
 */
enum SingletonBurgerBuilderFactoryEnum { 
    INSTANCE; 

    private final BurgerBuilderFactoryAPI burgerBuilderFactory; 

    SingletonBurgerBuilderFactoryEnum() { 
        burgerBuilderFactory = new BurgerBuilderFactory(); 
    } 

    public BurgerBuilderFactoryAPI getBurgerBuilderFactory() { 
        return burgerBuilderFactory; 
    } 
}
