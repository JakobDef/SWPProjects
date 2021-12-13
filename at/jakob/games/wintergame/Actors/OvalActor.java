package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Observer.Observer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class OvalActor implements Actor, Observer {
    private int x;
    private int y;
    private direction dir;
    private Color color;

    public enum direction {
        right, left
    }

    public OvalActor(int x, int y, direction dir){
        super();
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if(this.x <= 1200){
            this.x++;
        }
        else{
            this.x = 0;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawOval(this.x, this.y, 80, 50);
        graphics.setColor(Color.white);
    }

    public void inform(){
        this.color = Color.red;
    }

}
