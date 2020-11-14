package ObserverPattern;

//import java.util.IObserver;

public class DisplayWeatherOne implements Display, Observer {
    private float temp;
    private float pressure;
    private float humidity;
    private Observable weatherData;

    public DisplayWeatherOne(Observable weatherData){
      this.weatherData=weatherData;
      weatherData.registerObserver((Observer) this);
    }

    @Override
    public void display() {
        System.out.println("Currently The Temp is"+ temp +"The Humidity "+ humidity +"and the Pressure is "+ pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
    this.pressure=pressure;
    this.humidity=humidity;
    this.temp=temp;
    display();
    }
}
