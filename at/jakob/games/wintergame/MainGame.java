package at.jakob.games.wintergame;

import at.jakob.games.wintergame.Actors.CircleActor;
import org.newdawn.slick.*;

public class MainGame extends BasicGame {
    CircleActor ca1,ca2;


    public MainGame(String title){
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.ca1 = new CircleActor(100, 100);
        this.ca2 = new CircleActor(150, 150);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.ca1.update(gameContainer, delta);
        this.ca2.update(gameContainer, delta);

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.ca1.render(graphics);
        this.ca2.render(graphics);

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
