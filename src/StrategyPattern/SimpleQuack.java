package StrategyPattern;

public class SimpleQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Simple Quacking");
  }

}
