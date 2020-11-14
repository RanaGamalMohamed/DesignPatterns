package StrategyPattern;

public class Main {
    public static void main (String args[]){
     RubberDuck rubberDuck=new RubberDuck();
     rubberDuck.display();
      rubberDuck.performQuack();
      rubberDuck.performFly();
      //if we want to modify our behavior
      rubberDuck.setQuackBehavior(new Quack());
      rubberDuck.performQuack();


      DomesticDuck domesticDuck=new DomesticDuck();
      domesticDuck.display();
      domesticDuck.performQuack();
      domesticDuck.performFly();
    }
}

