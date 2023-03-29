package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.Henk;

import java.util.Random;

public class BossButton extends SpriteEntity implements Collider, Collided {

    public BossButton(Coordinate2D location, Size size, String resource) {
        super(resource, location, size);
    }

    @Override
    public void onCollision(Collider collider) {
        int bufferWidth = 100;
        int bufferHeight = 100;
        if (collider instanceof Henk) {
            setAnchorLocation(new Coordinate2D(
                    new Random().nextInt((int) (getSceneWidth() - 2 * bufferWidth)) + bufferWidth,
                    new Random().nextInt((int) (getSceneHeight() - 2 * bufferHeight)) + bufferHeight));
        }
    }
}
