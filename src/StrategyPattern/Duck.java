package StrategyPattern;

public abstract class Duck {
  
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  
  public Duck() {
    
  }
  
  public abstract void display();
  
  public void performFly() {
    // delegate to behavior class
    flyBehavior.fly();
  }
  
  public void performQuack() {
    quackBehavior.quack();
  }
  
  public void swim() {
    System.out.println("Swimming");
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}