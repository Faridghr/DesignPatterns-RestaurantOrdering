package restaurantorderingsystems;

/**
 *
 * An interface that defines the contract for observers in the observer pattern used for handling order updates. It includes a single method update(String orderDetails) that is called to notify the observer about changes or updates in the order details.
 * 
 */
public interface OrderObserverAPI {
    void update(String orderDetails);
}
