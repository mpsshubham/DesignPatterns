package ObserverPattern;

public class Main {

  public static void main(String[] args) {
    
    WeatherData weatherData = new WeatherData();
    TVDisplay tvDisplay = new TVDisplay(weatherData);
    InternetDisplay internetDisplay = new InternetDisplay(weatherData);
    
    weatherData.setMeasurements(12, 23, 34);
    weatherData.setMeasurements(34, 45, 56);
  }

}
