package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Observer.Observer;
import org.lwjgl.Sys;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

import java.util.ArrayList;
import java.util.List;

public class PlayerActor implements Actor {
    private float x, y, speed;
    private List<Observer> observers;

    public PlayerActor() {
        super();
        this.x = 300;
        this.y = 300;
        this.speed = 1;
        this.observers = new ArrayList<>();
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(this.x, this.y, 50, 50);
    }

    @Override
    public void update(GameContainer gc, int delta){
        if (gc.getInput().isKeyDown(Input.KEY_LEFT) || gc.getInput().isKeyDown(Input.KEY_A)) {
            this.x -= (float)delta*this.speed;
            System.out.println("left: x = " + this.x);
        }

        if (gc.getInput().isKeyDown(Input.KEY_RIGHT) || gc.getInput().isKeyDown(Input.KEY_D)) {
            this.x += (float)delta*this.speed;
            System.out.println("right: x = " + this.x);
        }

        if (gc.getInput().isKeyDown(Input.KEY_UP) || gc.getInput().isKeyDown(Input.KEY_W)) {
            this.y -= (float)delta*this.speed;
            System.out.println("up: y = " + this.y);
        }

        if (gc.getInput().isKeyDown(Input.KEY_DOWN) || gc.getInput().isKeyDown(Input.KEY_S)) {
            this.y += (float)delta*this.speed;
            System.out.println("down: y = " + this.y);
        }

        if(this.x > 700){
            for (Observer observer: observers) {
                observer.inform();
            }

        }
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

}
