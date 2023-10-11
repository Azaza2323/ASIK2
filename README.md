# ASIK2
# Coffee Order System with Decorator Pattern

## Implementing the Decorator Pattern (60 points)

1. **Create a base Coffee class:**
    - **description:** A string describing the coffee type.
    - **cost():** A method that returns the cost of the coffee.
    - *Feel free to add more properties/methods to customize.*

2. **Create concrete coffee classes:**
    - Extend the Coffee class to represent different types of coffee.

3. **Implement decorators:**
    - Create decorator classes that also extend the Coffee class.
    - **Properties/Methods:**
        - **coffee:** A reference to the wrapped Coffee object.
        - **getDescription():** A method that returns a description of the coffee with the added condiment.
        - **cost():** A method that calculates the cost of the coffee with the added condiment.

4. **Implement at least three different decorators:**
    - Each condiment should modify the description and cost of the coffee it is added to.

5. **Create a main class:**
    - Demonstrate the use of the Decorator pattern by creating various coffee orders.
    - Use different combinations of concrete coffee classes and decorators.

### Additional Notes

- The `Main` class serves as the entry point for the Coffee Order System.
- Helper methods `createCoffee` and `addCondiment` facilitate the creation and modification of coffee orders.
- The code includes concrete coffee classes (`Espresso`, `Cappuccino`, `Latte`) and decorator classes (`Chocolate`, `Caramel`, `Vanilla`).
- The main class demonstrates the creation of predefined coffee orders and user interaction for custom orders.

## Part 2: Documentation and Submission (10 points)

Write a well-structured report that includes the following:

- A brief explanation of the Decorator design pattern and its use case.
- Screenshots of your code parts (choose only important ones) and results.
- Any additional information or insights gained during the assignment.
