package StrategyPattern;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I Can't quack");
    }
}
