package at.jakob.games.wintergame.Factory;

import at.jakob.games.wintergame.Actors.Actor;
import at.jakob.games.wintergame.Actors.CircleActor;
import at.jakob.games.wintergame.Actors.OvalActor;
import at.jakob.games.wintergame.Actors.RectActor;
import at.jakob.games.wintergame.Strategy.MoveLeft;
import at.jakob.games.wintergame.Strategy.MoveRight;
import at.jakob.games.wintergame.Strategy.MoveStrategy;

import java.util.Random;

public class RandomActorFactory {

    public static Actor getRandomActor(){
        Random random = new Random();
        int number = random.nextInt(3);

        if(number == 0) {
            return new CircleActor(new MoveRight(random.nextInt(700),random.nextInt(700), random.nextFloat()));
        }
        else if(number == 1){
            return new RectActor(new MoveLeft(random.nextInt(700),random.nextInt(700), random.nextFloat()));
        }

        return new OvalActor(random.nextInt(700),random.nextInt(700), OvalActor.direction.right);
    }

}
