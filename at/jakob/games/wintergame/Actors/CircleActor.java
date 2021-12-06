package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Strategy.MoveRight;
import at.jakob.games.wintergame.Strategy.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor extends AbstractActor {


    public CircleActor(MoveStrategy ms) {
        super(ms);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(ms.getX(), ms.getY(), 50,50);
    };

}
