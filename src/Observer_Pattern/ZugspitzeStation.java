package Observer_Pattern;

import java.util.ArrayList;

public class ZugspitzeStation implements WetterStation{

    private ArrayList<Observer> observerList;
    private int temperatur;


    public ZugspitzeStation(){
        observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer obs: observerList) {
            obs.update(temperatur);

        }

    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
        notifyObservers();
    }
}
