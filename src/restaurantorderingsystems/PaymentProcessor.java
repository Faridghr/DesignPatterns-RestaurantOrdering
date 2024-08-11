package restaurantorderingsystems;

/**
 *
 * A concrete implementation of PaymentProcessorAPI. It uses a PaymentStrategy to perform payment operations. The setStrategy() method allows setting a specific payment strategy, and the processPayment() method delegates the payment processing to the chosen strategy.
 * 
 */
public class PaymentProcessor extends PaymentProcessorAPI {
    protected PaymentStrategyAPI strategy;
    
    public PaymentProcessor(PaymentStrategyAPI strategy){
        this.strategy = strategy;
        
    }
    @Override
    public void setStrategy(PaymentStrategyAPI strategy) {
        this.strategy = strategy;
    }

    @Override
    public void processPayment(double amount) {
        strategy.pay(amount);
    }
    
    @Override
    public PaymentStrategyAPI getStrategy(){
        return this.strategy;
    }
}
