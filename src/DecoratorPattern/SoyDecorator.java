package DecoratorPattern;

public class SoyDecorator extends CondimentDecorator {
    Beverage beverage;
    public SoyDecorator(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return 1.00+ beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"Soy Toping ";
    }
}
