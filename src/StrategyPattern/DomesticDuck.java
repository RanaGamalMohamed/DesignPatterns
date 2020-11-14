package StrategyPattern;

public class DomesticDuck extends Duck {
    public DomesticDuck(){
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Domestic Duck");
    }
}
