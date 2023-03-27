package com.github.hanyaeger.tutorial.entities.enemies.GoblinMobile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.tutorial.entities.map.Wall;
import javafx.scene.paint.Color;

public class HitboxGoblinMobile extends RectangleEntity implements Collider, Collided {
    private int direction;
    GoblinMobile goblinMobile;

    protected HitboxGoblinMobile(Coordinate2D initialLocation, GoblinMobile goblinMobile, int width, int heigth, int direction) {
        super(initialLocation);
        this.goblinMobile = goblinMobile;
        setWidth(width);
        setHeight(heigth);
        setFill(Color.TRANSPARENT);
        this.direction = direction;
    }

    @Override
    public void onCollision(Collider collider) {

        if (collider instanceof Wall) {
            if (direction == 0) {
                direction = 180;
            } else if (direction == 90) {
                direction = 270;
            } else if (direction == 180) {
                direction = 0;
            } else if (direction == 270) {
                direction = 90;
            }
            goblinMobile.setMotion(2, direction);
        }


    }


}
