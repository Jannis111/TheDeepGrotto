package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.Henk;

public class Door extends SpriteEntity implements Collider /*, Collided */ {
    /*
    TheDeepGrotto theDeepGrotto;
    int setActiveSceneNumber;
*/
    public Door(Coordinate2D location, Size size, String resource /*, TheDeepGrotto theDeepGrotto, int setActiveSceneNumber*/) {
        super(resource, location, size);
        /* this.theDeepGrotto = theDeepGrotto; */
    }
/*
    @Override
    public void onCollision(Collider collider) {
        if (collider instanceof Henk) {
            this.theDeepGrotto.setActiveScene(setActiveSceneNumber);
        }
    }
    */

}
