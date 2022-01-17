package at.jakob.observer.uebung;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {

    private List<Observer> observers;
    private int temperature;

    public TemperatureSensor(){
        this.observers = new ArrayList<>();
        this.temperature = 69;
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void alarm(){
        for (Observer observer: this.observers){
            observer.alarm();
        }
    }

}
