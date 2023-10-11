import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Order Details: " + espresso.getDescription() + ", Cost:" + espresso.cost());

        // Add vanilla to the espresso
        Coffee vanillaEspresso = new Vanilla(espresso);
        System.out.println("Order Details: " + vanillaEspresso.getDescription() + ", Cost:" + vanillaEspresso.cost());

        // Creating a latte with vanilla and caramel
        Coffee latte = new Latte();
        Coffee vanillaCaramelLatte = new Vanilla(new Caramel(latte));
        System.out.println("Order Details: " + vanillaCaramelLatte.getDescription() + ", Cost:" + vanillaCaramelLatte.cost());
        Scanner scanner = new Scanner(System.in);
        // Creating a cappuccino with double vanilla and chocolate
        Coffee cappuccino=new Cappuccino();
        Coffee doublevanillaChocolateCappuccino=new Vanilla((new Vanilla(new Chocolate(cappuccino))));
        System.out.println("Order Details: " + doublevanillaChocolateCappuccino.getDescription() + ", Cost:" + doublevanillaChocolateCappuccino.cost());

        System.out.println("Welcome to the Coffee Order System!");
        System.out.println("Available Coffees: 1. Espresso  2. Cappuccino  3. Latte");
        System.out.print("Enter the number of your choice: ");

        int coffeeChoice = scanner.nextInt();
        Coffee coffee = createCoffee(coffeeChoice);

        System.out.println("\nAvailable Condiments: 1. Vanilla  2. Chocolate  3. Caramel");
        System.out.print("Enter the number of the condiment you want to add (or 0 for no condiment): ");

        int condimentChoice = scanner.nextInt();
        while (condimentChoice != 0) {
            coffee = addCondiment(coffee, condimentChoice);
            System.out.print("Enter another condiment (or 0 to finish): ");
            condimentChoice = scanner.nextInt();
        }

        System.out.println("\nOrder Details:");
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: T" + coffee.cost());

        scanner.close();
    }

    private static Coffee createCoffee(int choice) {
        switch (choice) {
            case 1:
                return new Espresso();
            case 2:
                return new Cappuccino();
            case 3:
                return new Latte();
            default:
                throw new IllegalArgumentException("Invalid coffee choice");
        }
    }

    private static Coffee addCondiment(Coffee coffee, int choice) {
        switch (choice) {
            case 1:
                return new Vanilla(coffee);
            case 2:
                return new Chocolate(coffee);
            case 3:
                return new Caramel(coffee);
            default:
                throw new IllegalArgumentException("Invalid condiment choice");
        }
    }
}
