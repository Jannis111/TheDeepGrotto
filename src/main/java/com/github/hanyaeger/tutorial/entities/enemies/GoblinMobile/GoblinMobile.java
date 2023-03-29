package com.github.hanyaeger.tutorial.entities.enemies.GoblinMobile;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.entities.enemies.Goblin;
import com.github.hanyaeger.tutorial.entities.enemies.Sprite;


public class GoblinMobile extends Goblin {

    private final int direction = 270;


    public GoblinMobile(Coordinate2D initialLocation) {
        super(initialLocation);
        setMotion(2, direction);

    }

    @Override
    protected void setupEntities() {
        Sprite goblinMobileSprite = new Sprite("sprites/goblinRun.png", new Coordinate2D(0, 0), 75, 1, 6, 30);
        HitboxGoblinMobile goblinMobileHitbox = new HitboxGoblinMobile(new Coordinate2D(20, 35), this, goblinMobileSprite, 30, 40, direction);
        addEntity(goblinMobileSprite);
        addEntity(goblinMobileHitbox);
    }
}
