package com.github.hanyaeger.tutorial.entities.enemies;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Sprite extends DynamicSpriteEntity {

    public Sprite(String resource, Coordinate2D initialLocation, int size, int rows, int columns, int setAutoCycleSpeed) {
        super(resource, initialLocation, new Size(size), rows, columns);
        setAutoCycle(setAutoCycleSpeed);
    }
}
