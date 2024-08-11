package restaurantorderingsystems;

/**
 *
 * A concrete implementation of BurgerBuilderAPI. It manages the process of building Burger objects, allowing for flexible and customized creation of Burger instances.
 * 
 */
public class BurgerBuilder implements BurgerBuilderAPI { 
    private int id; 
    private double cost; 
    private String name; 

    @Override 
    public BurgerBuilderAPI setId(int id) { 
        this.id = id; 
        return this; 
    } 

    @Override 
    public BurgerBuilderAPI setCost(double cost) { 
        this.cost = cost; 
        return this; 
    } 

    @Override 
    public BurgerBuilderAPI setName(String name) { 
        this.name = name; 
        return this; 
    } 

    @Override 
    public Burger build() { 
        return new Burger(id, cost, name); 
    } 
}
