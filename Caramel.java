public class Caramel extends CondimentDecorator {
    Coffee coffee;

    public Caramel(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + " with Caramel";
    }

    public double cost() {
        return coffee.cost() + 250.0;
    }
}
