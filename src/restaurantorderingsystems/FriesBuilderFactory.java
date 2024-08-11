package restaurantorderingsystems;

/**
 *
 * A concrete implementation of FriesBuilderFactoryAPI. It creates and returns instances of FriesBuilder, encapsulating the logic for obtaining FriesBuilder instances.
 * 
 */
public class FriesBuilderFactory implements FriesBuilderFactoryAPI { 
    @Override 
    public FriesBuilderAPI getFriesBuilder() { 
        return new FriesBuilder(); 
    } 
} 
