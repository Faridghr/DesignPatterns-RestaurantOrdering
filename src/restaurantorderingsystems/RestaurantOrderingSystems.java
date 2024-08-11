package restaurantorderingsystems;

/**
 *
 * 
 */
public class RestaurantOrderingSystems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	// Create a restaurant instance	
	Restaurant restaurant = Restaurant.getInstance();
	
	// Create Burger Items and Add to Restaurant Menu
	BurgerBuilderFactoryAPI burgerFactory = SingletonBurgerBuilderFactoryEnum.INSTANCE.getBurgerBuilderFactory();
        
	restaurant.addMenuItem(burgerFactory.getBurgerBuilder().setId(1).setName("Classic Burger").setCost(5.99).build());
	restaurant.addMenuItem(burgerFactory.getBurgerBuilder().setId(2).setName("Cheese Burger").setCost(6.99).build());
	restaurant.addMenuItem(burgerFactory.getBurgerBuilder().setId(3).setName("Mashroom Burger").setCost(7.45).build());

	// Create Fries Items and Add to Restaurant Menu
        FriesBuilderFactoryAPI friesFactory = SingletonFriesBuilderFactoryEnum.INSTANCE.getFriesBuilderFactory();

	restaurant.addMenuItem(friesFactory.getFriesBuilder().setId(4).setName("French Fries").setCost(3.99).build());
	restaurant.addMenuItem(friesFactory.getFriesBuilder().setId(5).setName("Classic Fries").setCost(2.99).build());
        
	// Create Drinks Items and Add to Restaurant Menu
        DrinkBuilderFactoryAPI drinkFactory = SingletonDrinkBuilderFactoryEnum.INSTANCE.getDrinkBuilderFactory();

	restaurant.addMenuItem(drinkFactory.getDrinkBuilder().setId(6).setName("Coca-Cola").setCost(1.99).build());
	restaurant.addMenuItem(drinkFactory.getDrinkBuilder().setId(7).setName("Sprite").setCost(1.99).build());
	restaurant.addMenuItem(drinkFactory.getDrinkBuilder().setId(8).setName("Fanta").setCost(1.99).build());

        // Create a combo meal
        ComboMeal combo = new ComboMeal(9, "Burger Combo");
        combo.add(restaurant.getItemById(1));
        combo.add(restaurant.getItemById(4));
        combo.add(restaurant.getItemById(8));
        restaurant.addMenuItem(combo);

	System.out.println("\nRestaurant Menu:");
        restaurant.showMenu();
	
        
        System.out.println("\nAdded ExtraCheese to menu items \'Burger Combo\'\n");
	// Decorate the combo with extra cheese
        MenuItemAPI comboWithCheese = new ExtraCheeseDecorator(combo); 
        

        // Create an order and add the combo with cheese
        Order order = new Order();
        order.addItemToOrder(comboWithCheese);
	
	// Add observers
        KitchenStaff kitchenStaff = new KitchenStaff();
        WaitStaff waitStaff = new WaitStaff();
        order.addObserver(kitchenStaff);
        order.addObserver(waitStaff);

        // Set payment strategy and process payment
        PaymentProcessorAPI paymentProcessor = new PaymentProcessor(new CreditCardPayment());
        order.setPaymentProcessor(paymentProcessor);	
        
        // Place the order
        restaurant.addOrder(order);

	// Process the payment
        restaurant.payOrder(order, comboWithCheese.getPrice());
    }
    
}
