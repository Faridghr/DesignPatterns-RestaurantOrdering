package restaurantorderingsystems;

/**
 *
 * A concrete classes that extend MenuItemAPI which represents a specific type of menu item.
 * 
 */
public class Burger extends MenuItemAPI {
    int id;
    private double price;
    private String name;

    public Burger(int id, double price, String name) {
        this.id = id;
	this.name = name;
        this.price = price;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing burger: " + name);
    }

    @Override
    public String toString() {
        return "Burger item {id= " + id + " , cost= " + price + " , name= " + name + " }";
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    public int getId(){
        return this.id;
    }
    
    @Override
    public double getPrice(){
        return this.price;
    }
}
