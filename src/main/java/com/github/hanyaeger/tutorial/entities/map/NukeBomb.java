package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.tutorial.entities.items.Bomb;

public class NukeBomb extends Bomb {
    public NukeBomb(Coordinate2D location, Size size, String resource) {
        super(location, size, resource);
    }
}
