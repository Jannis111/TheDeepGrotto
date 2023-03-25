package com.github.hanyaeger.tutorial.entities.enemies;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Enemy extends DynamicCompositeEntity implements Collider {
    public Enemy(Coordinate2D location) {
        super(location);


    }

    @Override
    protected void setupEntities() {

    }


}
