package com.github.hanyaeger.tutorial.entities.enemies.GoblinMobile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.tutorial.entities.enemies.Goblin;
import com.github.hanyaeger.tutorial.entities.enemies.Sprite;
import com.github.hanyaeger.tutorial.entities.map.Wall;

public class GoblinMobile extends Goblin implements Collided {

    private int direction = 0;


    public GoblinMobile(Coordinate2D initialLocation) {
        super(initialLocation);
        setMotion(2, direction);

    }

    @Override
    protected void setupEntities() {
        addEntity(new Sprite("sprites/goblinRun.png", new Coordinate2D(0, 0), 75, 1, 6, 30));
    }

    @Override
    public void onCollision(Collider collider) {
        if (collider instanceof Wall) {
            if (direction == 0) {
                direction = 180;
                setMotion(2, direction);
            } else if (direction == 90) {
                direction = 270;
                setMotion(2, direction);
            } else if (direction == 180) {
                direction = 0;
                setMotion(2, direction);
            } else if (direction == 270) {
                direction = 90;
                setMotion(2, direction);
            }

        }
    }
}
