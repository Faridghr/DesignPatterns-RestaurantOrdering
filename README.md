# **Restaurant Ordering System: A Design Pattern Project**

## **Overview**

This project is a practical exploration of design patterns, applied to a restaurant ordering system. It demonstrates how design patterns can be used to solve real-world software design challenges, resulting in a system that is flexible, scalable, and maintainable. The project utilizes multiple design patterns, including Singleton, Factory, Builder, Strategy, Composite, Adapter, Decorator, and Observer, to create a robust and extensible solution.

## **Design Patterns Used**

### **1. Singleton, Factory, and Builder**
- **Use Case:** Creating different types of menu items (e.g., drinks, appetizers, main courses, desserts).
- **Solution:** A Factory pattern works with the Builder pattern to generate instances of menu items. The Singleton pattern ensures a single instance of the Factory manages the creation logic.

### **2. Composite**
- **Use Case:** Handling combo meals.
- **Solution:** The Composite pattern allows the system to treat individual menu items and combo meals uniformly, simplifying management and manipulation of combinations.

### **3. Decorator**
- **Use Case:** Adding extra features or modifications to an order.
- **Solution:** The Decorator pattern enables dynamic modifications, such as adding extra cheese or handling different sizes for items.

### **4. Strategy**
- **Use Case:** Implementing different payment methods.
- **Solution:** The Strategy pattern allows for flexible payment processing, accommodating different algorithms for various payment methods.

### **5. Observer**
- **Use Case:** Notifying the kitchen and waitstaff when an order is placed or updated.
- **Solution:** The Observer pattern ensures real-time updates to kitchen and waitstaff, with the 'Order' class notifying relevant observers of status changes.

### **6. Adapter**
- **Use Case:** Adopting 'PaymentProcessor' in 'Order' for managing payment processes.
- **Solution:** The Adapter pattern resolves interface incompatibilities, allowing seamless integration of the payment process within the order management system.

## **UML Design Patterns**

### **Overview**
The following UML diagram illustrates the interaction between various classes and design patterns within the system. It showcases how different patterns like Singleton, Factory, Builder, Strategy, Composite, Adapter, Decorator, and Observer are applied to solve specific problems.

### **UML Diagram**
![Project Architecture](png/UML.png)

## **Future Work**

### **Additional Patterns to Consider**
- **Command Pattern:** Encapsulate requests as objects, potentially for handling undoable actions like order cancellations.
- **Facade Pattern:** Simplify the interface for interacting with complex subsystems, such as the kitchen, billing, and customer service.

### **GUI Application**
- **Planned:** Development of a graphical user interface (GUI) to enhance user interaction with the system.

## **Contribution**

- **Contributors:**
  - **[Farid Ghorbani](https://github.com/Faridghr):** Contributor
  - **[Gunjid Arora](https://github.com/gunjitNEU):** Contributor

This project is open for contributions! If you're interested in extending the design pattern solutions or exploring new patterns, feel free to fork the repository and submit pull requests. Your contributions can help make this project even more useful for educational and practical purposes.

## **License**

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

