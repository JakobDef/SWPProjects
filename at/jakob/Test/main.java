package at.jakob.Test;

import at.jakob.Test.algorithms.Economy;
import at.jakob.Test.algorithms.SuperSpar;
import at.jakob.Test.algorithms.TopSpeed;
import at.jakob.Test.observer.Lichtsteuerung;
import at.jakob.Test.observer.Motorsteuerung;

public class main {
    public static void main(String[] args) {
        Economy ec = new Economy();
        SuperSpar ss = new SuperSpar();
        TopSpeed ts = new TopSpeed();

        Motorsteuerung motor1 = new Motorsteuerung(ec);
        Lichtsteuerung licht1 = new Lichtsteuerung();

        motor1.drive();

        motor1.setAlgorithmus(ss);

        motor1.drive();

        motor1.setAlgorithmus(ts);

        motor1.drive();


        //Teil 2
        Geschwindigkeitsmesser messer = new Geschwindigkeitsmesser();
        messer.addObserver(motor1);
        messer.addObserver(licht1);

        for(int i = 0; i < 20; i++){
            messer.messen();
        }

        System.out.println("\n\nDie maximale Geschwindigkei betrug " + messer.getGeschwindigkeit() + "km/h.");

    }
}
