package restaurantorderingsystems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * An abstract class that manages a list of observers (e.g., for order updates) and the items in an order. It includes methods for adding/removing observers, placing orders, and processing payments. It notifies observers of changes in the order status.
 * 
 */
public abstract class OrderObservableAPI {
    private List<OrderObserverAPI> observers = new ArrayList<>();
    private List<MenuItemAPI> itemsInOrder = new ArrayList<>();
    private String orderDetails;
    protected PaymentProcessorAPI paymentProcessor;

    public abstract void addItemToOrder(MenuItemAPI item);
    public abstract void removeItemFromOrder(MenuItemAPI item);
    public abstract void placeOrder();
    public abstract void addObserver(OrderObserverAPI observer);
    public abstract void removeObserver(OrderObserverAPI observer);
    public abstract void notifyObservers();
    public abstract void setPaymentProcessor(PaymentProcessorAPI paymentProcessor);
    public abstract void processPayment(double amount);
}