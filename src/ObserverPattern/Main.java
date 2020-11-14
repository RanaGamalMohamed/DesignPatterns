package ObserverPattern;

public class Main {
    public static void main(String args[]){
        WeatherStation weatherStation=new WeatherStation();//Instance of the Observable
        DisplayWeatherOne display1=new DisplayWeatherOne(weatherStation);//Observer and passed as a parameter a Observable
        weatherStation.setMeasurements(40,80,22);
    }
}
