package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Actor;
import org.newdawn.slick.GameContainer;

import java.awt.*;

public class HomerActor implements Actor {

    @Override
    public void update(GameContainer gc, int delta) {

    }

    @Override
    public void render(Graphics graphics) {

        graphics.drawString("I am Homer!", 50, 50);
    }
}
