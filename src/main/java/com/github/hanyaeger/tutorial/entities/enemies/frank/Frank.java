package com.github.hanyaeger.tutorial.entities.enemies.frank;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.entities.enemies.Enemy;
import com.github.hanyaeger.tutorial.entities.enemies.Sprite;

public class Frank extends Enemy {
    public Frank(Coordinate2D location) {
        super(location);
    }

    @Override
    protected void setupEntities() {
        addEntity(new Sprite("sprites/frank.png", new Coordinate2D(0, 0), 75, 1, 1, 0));
    }
}
