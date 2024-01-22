package Observer_Pattern;

public interface WetterStation {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
