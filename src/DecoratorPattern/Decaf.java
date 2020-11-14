package DecoratorPattern;
//Works as A concrete Component

public class Decaf extends Beverage{
    public Decaf(){
        description="Decaf ";
    }
    @Override
    public double cost() {
        return 3.00;
    }
}
