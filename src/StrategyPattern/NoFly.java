package StrategyPattern;

public class NoFly implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I cannot fly");
  }

}
