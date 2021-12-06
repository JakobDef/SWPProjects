package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Actor;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor {
    int x;
    int y;


    public CircleActor(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(java.awt.Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50,50);
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if(this.y <= 600){
            this.y++;
        }
        else{
            this.y = 0;
        }
    }

}
