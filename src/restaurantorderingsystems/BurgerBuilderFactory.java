package restaurantorderingsystems;

/**
 *
 * A concrete implementation of BurgerBuilderFactoryAPI. It creates and returns instances of BurgerBuilder, managing the creation of BurgerBuilder instances.
 * 
 */
public class BurgerBuilderFactory implements BurgerBuilderFactoryAPI { 
    @Override 
    public BurgerBuilderAPI getBurgerBuilder() { 
        return new BurgerBuilder(); 
    } 
}
