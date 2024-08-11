package restaurantorderingsystems;

/**
 *
 * A concrete implementation of PaymentStrategyAPI. It represents a payment strategy using a credit card. The pay() method processes the payment by printing a message indicating that payment has been made with a credit card.
 * 
 */
public class CreditCardPayment implements PaymentStrategyAPI {
    public final String name = "CreditCardPayment";
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with Credit Card.");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
