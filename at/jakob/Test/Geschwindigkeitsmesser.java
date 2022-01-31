package at.jakob.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Geschwindigkeitsmesser {
    List<Observer> observerList;
    int geschwindigkeit;

    public Geschwindigkeitsmesser(){
        this.observerList = new ArrayList<>();
        this.geschwindigkeit = 0;
    }

    int messen(){
        Random rand = new Random();
        int random = rand.nextInt(12);
        this.geschwindigkeit += random;

        if(this.geschwindigkeit-random == 0){
            notifyObservers(this.geschwindigkeit);
        }
        else if(this.geschwindigkeit > 49 && this.geschwindigkeit - random <= 49) {
            notifyObservers(this.geschwindigkeit);
        }
        if(this.geschwindigkeit > 99 && this.geschwindigkeit - random <= 99){
            notifyObservers(this.geschwindigkeit);
        }



            return geschwindigkeit;
    }

    private void notifyObservers(int geschwindigkeit){
        for (Observer obs: observerList) {
            obs.rangeReached(geschwindigkeit);
        }
    }

    void addObserver(Observer obs){
        observerList.add(obs);
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }
}
