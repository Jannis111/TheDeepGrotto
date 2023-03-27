package com.github.hanyaeger.tutorial.entities.enemies.GoblinMobile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.tutorial.entities.enemies.Sprite;
import com.github.hanyaeger.tutorial.entities.map.Door;
import com.github.hanyaeger.tutorial.entities.map.Wall;
import javafx.scene.paint.Color;

import java.util.Random;

public class HitboxGoblinMobile extends RectangleEntity implements Collider, Collided {
    private int direction;
    private int width;
    private int heigth;
    GoblinMobile goblinMobile;

    Sprite goblinMobileSprite;

    protected HitboxGoblinMobile(Coordinate2D initialLocation, GoblinMobile goblinMobile, Sprite goblinMobileSprite, int width, int height, int direction) {
        super(initialLocation);
        this.goblinMobile = goblinMobile;
        this.goblinMobileSprite = goblinMobileSprite;
        this.width = width;
        this.heigth = height;
        setWidth(width);
        setHeight(height);
        setFill(Color.TRANSPARENT);
        this.direction = direction;
    }


    @Override
    public void onCollision(Collider collider) {
        if (collider instanceof Wall || collider instanceof Door) {


            int directionArray[] = {0, 90, 180, 270};

            System.out.println(getAnchorLocation());

            int randomNumber = new Random().nextInt(4);
            if (direction == 0 && !(randomNumber == 0)) {
                direction = directionArray[randomNumber];
                setAnchorLocationY(getAnchorLocation().getY() - 3);
                // direction = 180;
            } else if (direction == 90 && !(randomNumber == 1)) {
                direction = directionArray[randomNumber];
                setAnchorLocationX(getAnchorLocation().getX() - 3);
                //direction = 270;
            } else if (direction == 180 && !(randomNumber == 2)) {
                direction = directionArray[randomNumber];
                setAnchorLocationY(getAnchorLocation().getY() + 3);
                //direction = 0;
            } else if (direction == 270 && !(randomNumber == 3)) {
                direction = directionArray[randomNumber];
                setAnchorLocationX(getAnchorLocation().getX() + 3);

                //direction = 90;
            }
            goblinMobile.setMotion(2, direction);
            goblinMobileSprite.setAnchorLocationY(getAnchorLocation().getY() - heigth + 3);
            goblinMobileSprite.setAnchorLocationX(getAnchorLocation().getX() - width + 3);

        }
    }


}



