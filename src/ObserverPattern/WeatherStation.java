package ObserverPattern;

import java.util.ArrayList;


//The Observable Concrete class

public class WeatherStation implements Observable {
    private final ArrayList observers;
    private float temperature;;
    private float humidity;
    private float pressure;

  public WeatherStation(){
      observers=new ArrayList();

  }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Object o : observers) {
            Observer observer = (Observer) o;
            observer.update(temperature, pressure, humidity);
        }
    }
    public void measurementChanged(){
      notifyObserver();
    }
 public void setMeasurements(float temperature,float pressure,float humidity){
      this.temperature=temperature;
      this.pressure=pressure;
      this.humidity=humidity;
      measurementChanged();
 }

}
