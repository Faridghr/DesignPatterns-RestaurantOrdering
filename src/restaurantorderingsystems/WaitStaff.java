package restaurantorderingsystems;

/**
 *
 * A concrete implementation of the OrderObserverAPI interface. It represents a kitchen staff member who is notified about order updates. The update() method in this class prints a message indicating that the kitchen is preparing the order based on the provided order details.
 * 
 */
public class WaitStaff implements OrderObserverAPI {
    @Override
    public void update(String orderDetails) {
        System.out.println("Waitstaff is serving: " + orderDetails);
    }
}
