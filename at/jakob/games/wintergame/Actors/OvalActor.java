package at.jakob.games.wintergame.Actors;

import at.jakob.games.wintergame.Actor;
import org.newdawn.slick.GameContainer;

import java.awt.*;

public class OvalActor implements Actor {
    private int x;
    private int y;
    private direction dir;
    private static final float speed = 0.2f;

    public enum direction {
        right, left, up, down;
    }

    @Override
    public void update(GameContainer gc, int delta) {

    }

    @Override
    public void render(Graphics graphics) {

    }
}
