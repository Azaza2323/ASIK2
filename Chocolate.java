public class Chocolate extends CondimentDecorator {
    Coffee coffee;

    public Chocolate(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + " with Chocolate";
    }

    public double cost() {
        return coffee.cost() + 100.0;
    }
}
