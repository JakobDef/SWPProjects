package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Strategy.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor implements Actor {
    private MoveStrategy ms;


    public RectActor(MoveStrategy ms) {
        super();
        this.ms = ms;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        ms.update(delta);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(ms.getX(), ms.getY(), 50, 50);
    }
}
