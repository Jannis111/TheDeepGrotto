package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.tutorial.entities.map.Wall;
import com.github.hanyaeger.tutorial.entities.text.GUI;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Henk extends DynamicSpriteEntity implements KeyListener, Collider, Collided {
    private int health = 5;
    private int bomb = 1;
    private GUI gui;

    public Henk(Coordinate2D initialLocation, GUI gui) {
        super("sprites/henkIdle.png", initialLocation, new Size(35, 35), 1, 4);

        this.gui = gui;
        gui.setGUIText(health, bomb);
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.LEFT)) {
            setMotion(2, 270d);
        } else if (pressedKeys.contains(KeyCode.RIGHT)) {
            setMotion(2, 90d);
        } else if (pressedKeys.contains(KeyCode.UP)) {
            setMotion(2, 180d);
        } else if (pressedKeys.contains(KeyCode.DOWN)) {
            setMotion(2, 0d);
        } else if (pressedKeys.isEmpty()) {
            setSpeed(0);
        }
    }

    @Override
    public void onCollision(Collider collider) {
        if (collider instanceof Wall) {
            setSpeed(0);
        }
    }
}
