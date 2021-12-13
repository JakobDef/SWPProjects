package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Observer.Observer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class SnowflakeActor implements Actor, Observer {
    private int width;
    private int height;
    private float x;
    private float y;
    private float speed;
    Random rand;
    private Color color;

    private size size;

    @Override
    public void inform() {
        this.color = Color.orange;
    }

    public enum size{
        small, medium, big
    }

    public SnowflakeActor(size size){
        super();
        this.rand = new Random();
        this. x = rand.nextInt(800) + 1;
        this.size = size;
        this.color = Color.white;

        if(this.size == size.small) {
            this.width = 10;
            this.height = 10;
        }
        else if(this.size == size.medium) {
            this.width = 30;
            this.height = 30;
        }
        else {
            this.width = 50;
            this.height = 50;
        }
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if(this.y <= 600){
            this.y+=this.width/10;
        }
        else{
            this.y = 0;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillOval(this.x, this.y, this.width, this.height);
        graphics.setColor(Color.white);
    }
}
