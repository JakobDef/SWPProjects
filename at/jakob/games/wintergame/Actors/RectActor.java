package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Observer.Observer;
import at.jakob.games.wintergame.Strategy.MoveStrategy;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectActor extends AbstractActor implements Observer {
    private Color color;

    public RectActor(MoveStrategy ms) {
        super(ms);
        this.color = Color.white;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawRect(ms.getX(), ms.getY(), 50, 50);
        graphics.setColor(Color.white);
    }

    @Override
    public void inform() {
        this.color = Color.orange;
    }
}
