package com.github.hanyaeger.tutorial.entities.enemies.GoblinStatic;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.entities.enemies.Goblin;
import com.github.hanyaeger.tutorial.entities.enemies.Sprite;

public class GoblinStatic extends Goblin {
    public GoblinStatic(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        addEntity(new Sprite("sprites/goblinIdle.png", new Coordinate2D(0, 0), 50, 1, 4, 25));
    }

}


