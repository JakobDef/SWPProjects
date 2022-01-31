package at.jakob.Test.observer;

import at.jakob.Test.Observer;

public class Lichtsteuerung implements Observer {


    @Override
    public void rangeReached(int x) {
        System.out.println("Licht auf Geschwindichkeit " + x + "km/h eingestellt.");
    }
}
