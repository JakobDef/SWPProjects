package at.jakob.Test;

public class Motorsteuerung {
    Algorithmus modus;

    public Motorsteuerung(Algorithmus modus){
        this.modus = modus;
    }

    public void drive(){
        this.modus.drive();
    }

    public void setAlgorithmus(Algorithmus modus){
        this.modus = modus;
    }

}
