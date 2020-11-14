package DecoratorPattern;

public class MochaDecorator extends CondimentDecorator {

    Beverage beverage; //As it have an instance variable of the thing it decorates HAS A COMPONENT

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;

    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha Toping ";
    }

    @Override
    public double cost() {
        return 2.00 + beverage.cost();
    }

}