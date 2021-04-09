package StrategyPattern;

public class MallardDuck extends Duck {
  
  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("Mallard Duck");
  }

}
