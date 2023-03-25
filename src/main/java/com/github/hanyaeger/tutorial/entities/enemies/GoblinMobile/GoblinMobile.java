package com.github.hanyaeger.tutorial.entities.enemies.GoblinMobile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.entities.enemies.Goblin;
import com.github.hanyaeger.tutorial.entities.enemies.Sprite;

public class GoblinMobile extends Goblin {
    public GoblinMobile(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        addEntity(new Sprite("sprites/goblinRun.png", new Coordinate2D(0, 0), 75, 1, 6, 30));
    }
}
