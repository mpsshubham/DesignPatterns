package StrategyPattern;

public class Main {
  
  public static void main(String[] args) {
    
    Duck mallardDuck = new MallardDuck();
    mallardDuck.performFly();
    mallardDuck.setFlyBehavior(new NoFly()); // changing behavior at run time
    mallardDuck.performFly();
    mallardDuck.performQuack();
    mallardDuck.display();
    //adding new behavior is also very easy now, just implement FlyBehavior/QuackBehavior
  }
}
