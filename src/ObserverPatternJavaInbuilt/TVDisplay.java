package ObserverPatternJavaInbuilt;

import java.util.Observable;
import java.util.Observer;

public class TVDisplay implements Observer{

  private float temperature;
  Observable observable;
  
  public TVDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }
  @Override
  public void update(Observable o, Object arg) {
    if(o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData)o;
      this.temperature = weatherData.getTemperature(); //pulling data(better than Observable pushing data)
    }
    display();
  }
  
  public void display() {
    System.out.println("Current temperature is : " + temperature);
  }

}
