package ObserverPattern;

public interface Observable {
    public void registerObserver(Observer o);//passing an instance of the observer that observe the Observable obj.
    public void removeObserver(Observer o);
    public void notifyObserver();
}
