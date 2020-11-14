package StrategyPattern;

public abstract class Duck {
    //Declaring Instant Variable form the interfaces
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior=fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior=qb;
    }
    public abstract void display();
}
