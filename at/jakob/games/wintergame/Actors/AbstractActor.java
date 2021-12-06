package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Strategy.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public abstract class AbstractActor implements Actor{
    protected MoveStrategy ms;

    public AbstractActor(MoveStrategy ms) {
        super();
        this.ms = ms;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        ms.update(delta);
    }
}
