package at.jakob.observer.uebung.observers;

import at.jakob.observer.uebung.Observer;

public class SuperSaltObserver extends SaltObserver implements Observer{
    @Override
    public void alarm() {
        System.out.println("EXTREME ALARM ~SuperSaltObserver");
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

}
