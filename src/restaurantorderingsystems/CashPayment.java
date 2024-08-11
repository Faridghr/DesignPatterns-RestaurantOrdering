package restaurantorderingsystems;

/**
 *
 * A concrete implementation of PaymentStrategyAPI. It represents a payment strategy using cash. The pay() method processes the payment by printing a message indicating that payment has been made with cash.
 * 
 */
public class CashPayment implements PaymentStrategyAPI {
    public final String name = "CashPayment";
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with Cash.");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
