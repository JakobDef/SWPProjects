package at.jakob.games.wintergame;

import at.jakob.games.wintergame.Actors.*;
import at.jakob.games.wintergame.Strategy.MoveLeft;
import at.jakob.games.wintergame.Strategy.MoveRight;
import at.jakob.games.wintergame.Strategy.MoveStrategy;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<Actor> actors;

    public MainGame(String title){
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        MoveStrategy mr1 = new MoveRight(0,0, 0.3f);
        MoveStrategy mr2 = new MoveLeft(500,100, 0.1f);
        MoveStrategy mr3 = new MoveLeft(500,200, 0.2f);

        this.actors.add(new RectActor(mr3));
        this.actors.add(new OvalActor(100, 400, OvalActor.direction.right));
        this.actors.add(new CircleActor(mr1));
        this.actors.add(new CircleActor(mr2));
        this.actors.add(new SnowflakeActor(SnowflakeActor.size.small));
        this.actors.add(new SnowflakeActor(SnowflakeActor.size.big));
        this.actors.add(new SnowflakeActor(SnowflakeActor.size.medium));
        this.actors.add(new SnowflakeActor(SnowflakeActor.size.small));

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor: this.actors) {
            actor.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
