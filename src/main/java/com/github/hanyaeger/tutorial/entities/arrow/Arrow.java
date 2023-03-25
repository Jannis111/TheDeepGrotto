package com.github.hanyaeger.tutorial.entities.arrow;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.entities.Henk;
import javafx.scene.paint.Color;

public class Arrow extends DynamicCircleEntity implements Collided, SceneBorderCrossingWatcher, Collider {
    public Arrow(Coordinate2D initialLocation, int speed) {
        super(initialLocation);
        setMotion(speed, 180);
        setFill(Color.GRAY);
        setRadius(8);
    }

    @Override
    public void onCollision(Collider collider) {
        if (collider instanceof Henk) {

            remove();
        }
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        if (sceneBorder == sceneBorder.TOP) {
            remove();
        }

    }
}
