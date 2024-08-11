package restaurantorderingsystems;

/**
 *
 * An interface defining a payment strategy. It includes a pay() method that is implemented by different payment strategy classes. This allows for flexible payment options.
 * 
 */
public interface PaymentStrategyAPI {
    String getName();
    void pay(double amount);
}
