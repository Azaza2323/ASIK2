public class Vanilla extends CondimentDecorator {
    Coffee coffee;

    public Vanilla(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + " with Vanilla";
    }

    public double cost() {
        return coffee.cost() + 200.0;
    }
}
