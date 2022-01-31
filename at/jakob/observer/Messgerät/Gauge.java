package at.jakob.observer.Messgerät;

import java.util.ArrayList;
import java.util.List;

public class Gauge {

    private List<Observer> observerList;

    public Gauge() {
        this.observerList = new ArrayList<>();
    }

    void draw(int x){
        for (Observer obs: observerList) {
            obs.draw(x);
        }
    }

    void addObserver(Observer obs){
        this.observerList.add(obs);
    }

}
