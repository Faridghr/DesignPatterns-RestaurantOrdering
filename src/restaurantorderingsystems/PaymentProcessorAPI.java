package restaurantorderingsystems;

/**
 *
 *  An abstract class responsible for processing payments. It provides a method for setting a payment strategy and processing payments with the chosen strategy. It abstracts away the details of different payment methods.
 * 
 */
public abstract class PaymentProcessorAPI {
    protected PaymentStrategyAPI strategy;

    public void setStrategy(PaymentStrategyAPI strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        strategy.pay(amount);
    }
    
    public PaymentStrategyAPI getStrategy(){
        return this.strategy;
    }
}
