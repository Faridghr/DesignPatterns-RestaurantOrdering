package restaurantorderingsystems;

/**
 *
 * A concrete implementation of FriesBuilderAPI. It handles the actual building process for Fries objects, allowing for flexible creation of Fries instances.
 * 
 */
class FriesBuilder implements FriesBuilderAPI { 
    private int id; 
    private double cost; 
    private String name; 

    @Override 
    public FriesBuilderAPI setId(int id) { 
        this.id = id; 
        return this; 
    } 

    @Override 
    public FriesBuilderAPI setCost(double cost) { 
        this.cost = cost; 
        return this; 
    } 

    @Override 
    public FriesBuilderAPI setName(String name) { 
        this.name = name; 
        return this; 
    } 

    @Override 
    public Fries build() { 
        return new Fries(id, cost, name); 
    } 
}
