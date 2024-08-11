package restaurantorderingsystems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 * 
 */
public class Order extends OrderObservableAPI {
    private List<OrderObserverAPI> observers = new ArrayList<>();
    private List<MenuItemAPI> itemsInOrder = new ArrayList<>();
    private String orderDetails = "";

    @Override
    public void addItemToOrder(MenuItemAPI item){
        System.out.println("Add " + item + " to Order.\n");
	itemsInOrder.add(item);

    }
    
    @Override
    public void removeItemFromOrder(MenuItemAPI item){
	 itemsInOrder.remove(item);
    }

    @Override
    public void placeOrder() {
        for (MenuItemAPI item : itemsInOrder) {
            this.orderDetails += item.getName() + "|";
        }
        notifyObservers();
    }

    @Override
    public void addObserver(OrderObserverAPI observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserverAPI observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (OrderObserverAPI observer : observers) {
            observer.update(orderDetails);
        }
    }

    @Override
    public void setPaymentProcessor(PaymentProcessorAPI paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
        System.out.println("Set payment strategy \"" + this.paymentProcessor.getStrategy().getName() + "\" to Order.\n");
    }

    @Override
    public void processPayment(double amount) {
        paymentProcessor.processPayment(amount);
    }
    
    @Override
    public String toString() {
        String detail = "";
        for (MenuItemAPI item : itemsInOrder){
            detail += item;
        }
        return detail;
    }
}
