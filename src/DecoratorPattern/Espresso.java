package DecoratorPattern;
//Works as A concrete Component

public class Espresso extends Beverage{
    public Espresso(){
        description="Espresso ";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}