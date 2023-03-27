package com.github.hanyaeger.tutorial.entities.spawner;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.EntitySpawner;
import com.github.hanyaeger.tutorial.entities.arrow.Arrow;

import java.util.Random;

public class ArrowSpawner extends EntitySpawner {

    private final double sceneWidth;
    private final double sceneHeight;

    public ArrowSpawner(double sceneWidth, double sceneHeight) {
        super(500);
        this.sceneWidth = sceneWidth;
        this.sceneHeight = sceneHeight;
    }

    @Override
    protected void spawnEntities() {
        spawn(new Arrow(randomLocation(), 1));
    }

    private Coordinate2D randomLocation() {
        double x = new Random().nextInt((int) sceneWidth);
        return new Coordinate2D(x, sceneHeight);
    }
}
