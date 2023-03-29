package com.github.hanyaeger.tutorial.entities.enemies.frank;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.entities.enemies.Enemy;
import com.github.hanyaeger.tutorial.entities.enemies.Hitbox;
import com.github.hanyaeger.tutorial.entities.enemies.Sprite;
import com.github.hanyaeger.tutorial.entities.text.BossHealthText;


public class Frank extends Enemy {

    private final BossHealthText bossHealthText;

    public Frank(Coordinate2D location, BossHealthText bossHealthText, int bossHealth) {
        super(location);
        this.bossHealthText = bossHealthText;
        bossHealthText.setBossHealthText(bossHealth);
    }

    @Override
    protected void setupEntities() {
        addEntity(new Sprite("sprites/frank.png", new Coordinate2D(0, 0), 75, 1, 1, 0));
        addEntity(new Hitbox(new Coordinate2D(0, 0), 65, 75));

    }


}
