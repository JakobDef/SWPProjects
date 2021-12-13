package at.jakob.games.wintergame.Singleton;

import org.w3c.dom.css.Counter;

public class CounterSingleton {
    private static CounterSingleton instance = null;
    private int counter = 0;

    private CounterSingleton() {

    }

    public static CounterSingleton getInstance(){
        if (instance == null){
            instance = new CounterSingleton();
        }
        return instance;
    }

    public void increaseCounter(){
        this.counter++;
    }

    public int getCounter(){
        return counter;
    }


}
