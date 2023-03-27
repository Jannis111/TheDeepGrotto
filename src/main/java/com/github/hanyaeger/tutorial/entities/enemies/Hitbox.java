package com.github.hanyaeger.tutorial.entities.enemies;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class Hitbox extends RectangleEntity implements Collider, Collided {


    public Hitbox(Coordinate2D initialLocation, int width, int heigth) {
        super(initialLocation);
        setWidth(width);
        setHeight(heigth);
        setFill(Color.TRANSPARENT);
    }


    @Override
    public void onCollision(Collider collider) {

    }
}
