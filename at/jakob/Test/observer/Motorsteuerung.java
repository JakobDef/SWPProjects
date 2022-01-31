package at.jakob.Test.observer;

import at.jakob.Test.Algorithmus;
import at.jakob.Test.Observer;
import at.jakob.Test.algorithms.Economy;
import at.jakob.Test.algorithms.SuperSpar;
import at.jakob.Test.algorithms.TopSpeed;

public class Motorsteuerung implements Observer {
    Algorithmus modus;

    public Motorsteuerung(Algorithmus modus){
        this.modus = modus;
    }

    public void drive(){
        this.modus.drive();
    }

    //wird in Teil2 nicht mehr gebraucht
    public void setAlgorithmus(Algorithmus modus){
        this.modus = modus;
    }

    @Override
    public void rangeReached(int x) {
        if(x < 51 && x >= 0) {
            this.modus = new SuperSpar();
            System.out.println(x + "km/h erreicht: Der Motor befindet sich im Super Spar Modus");
        }
        else if (x < 101){
            this.modus = new Economy();
            System.out.println(x + "km/h erreicht: Der Motor befindet sich im Economy Modus");
        }
        else if (x > 100){
            this.modus = new TopSpeed();
            System.out.println(x + "km/h erreicht: Der Motor befindet sich im Top Speed Modus");
        }
        else {
            System.out.println("Rückwärtsgang!");
        }
    }
}
