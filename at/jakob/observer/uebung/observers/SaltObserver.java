package at.jakob.observer.uebung.observers;

import at.jakob.observer.uebung.Observer;

public class SaltObserver implements Observer {

    @Override
    public void alarm() {
        System.out.println("ALARM! ~SaltObserver");
    }
}
