package com.github.hanyaeger.tutorial.entities.enemies.frank;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class FrankSprite extends DynamicSpriteEntity {

    public FrankSprite(Coordinate2D initialLocation) {
        super("sprites/frank.png", initialLocation, new Size(50));
    }
}
