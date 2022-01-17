package at.jakob.observer.uebung;

import at.jakob.observer.uebung.observers.ACObserver;
import at.jakob.observer.uebung.observers.HeaterObserver;
import at.jakob.observer.uebung.observers.SaltObserver;
import at.jakob.observer.uebung.observers.SuperSaltObserver;

public class main {

    public static void main(String[] args) {

        TemperatureSensor t1 = new TemperatureSensor();
        Observer so1 = new SaltObserver();
        Observer ho1 = new HeaterObserver();
        Observer aco1 = new ACObserver();
        Observer so2 = new SaltObserver();
        Observer sso1 = new SuperSaltObserver();
        SuperSaltObserver sso2 = new SuperSaltObserver();

        t1.addObserver(so1);
        t1.addObserver(so2);
        t1.addObserver(ho1);
        t1.addObserver(aco1);
        t1.addObserver(sso1);
        t1.addObserver(sso2);

        //sso1.sayHello();      Funktioniert nicht
        sso2.sayHello();


        t1.alarm();

    }

}
