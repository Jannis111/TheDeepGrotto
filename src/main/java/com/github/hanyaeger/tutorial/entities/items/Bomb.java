package com.github.hanyaeger.tutorial.entities.items;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.tutorial.entities.Henk;

public class Bomb extends SpriteEntity implements Collided, Collider {
    public Bomb(Coordinate2D location, Size size, String resource) {
        super(resource, location, size);
    }

    public static void useBomb() {
        var explosion = new SoundClip("audio/explosion.wav");
        explosion.play();
    }

    @Override
    public void onCollision(Collider collider) {
        if (collider instanceof Henk) {
            remove();
        }
    }
}
