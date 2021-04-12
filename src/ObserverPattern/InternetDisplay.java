package ObserverPattern;

/**
 * InternetDisplay will display all the data
 */
public class InternetDisplay implements Observer{

  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;
  
  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
  
  public InternetDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  
  public void display() {
    System.out.println("Current conditions are : " + temperature + ", "+ humidity +", "+", " + pressure);
  }

}
