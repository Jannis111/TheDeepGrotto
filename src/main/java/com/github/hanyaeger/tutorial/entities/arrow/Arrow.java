package com.github.hanyaeger.tutorial.entities.arrow;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.entities.Henk;
import com.github.hanyaeger.tutorial.entities.enemies.Sprite;

public class Arrow extends DynamicCompositeEntity implements Collided, SceneBorderCrossingWatcher, Collider {

    public Arrow(Coordinate2D initialLocation, int speed) {
        super(initialLocation);
        setMotion(speed, 180);
    }

    @Override
    protected void setupEntities() {
        addEntity(new Sprite("sprites/arrow.png", new Coordinate2D(0, 0), 80, 1, 1, 0));
    }

    @Override
    public void onCollision(Collider collider) {
        if (collider instanceof Henk) {
            remove();
        }
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        if (sceneBorder == SceneBorder.TOP) {
            remove();
        }

    }


}
