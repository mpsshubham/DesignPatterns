package ObserverPattern;

//TV display will just display Temperature

public class TVDisplay implements Observer {

  private float temperature;
  private Subject weatherData; // we need this reference so that observer can remove itself from subject whenever observer wants
  
  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    display();
  }

  public TVDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  
  public void display() {
    System.out.println("Current temperature is : " + temperature);
  }
}
