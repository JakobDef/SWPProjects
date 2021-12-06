package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Strategy.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor extends AbstractActor {

    public RectActor(MoveStrategy ms) {
        super(ms);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(ms.getX(), ms.getY(), 50, 50);
    }
}
