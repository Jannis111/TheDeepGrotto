package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.map.Wall;
import com.github.hanyaeger.tutorial.entities.text.GUI;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Henk extends DynamicSpriteEntity implements KeyListener, Collider, Collided {
    private static int health = 10;
    private static int bomb = 1;
    private TheDeepGrotto theDeepGrotto;
    private GUI gui;
    private int direction;

    public Henk(Coordinate2D initialLocation, TheDeepGrotto theDeepGrotto, GUI gui) {
        super("sprites/henkIdle.png", initialLocation, new Size(30, 30), 1, 4);

        this.theDeepGrotto = theDeepGrotto;

        this.gui = gui;
        gui.setGUIText(health, bomb);
    }


    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.LEFT)) {
            setMotion(3, 270d);
            direction = 270;
        } else if (pressedKeys.contains(KeyCode.RIGHT)) {
            setMotion(3, 90d);
            direction = 90;
        } else if (pressedKeys.contains(KeyCode.UP)) {
            setMotion(3, 180d);
            direction = 180;
        } else if (pressedKeys.contains(KeyCode.DOWN)) {
            setMotion(3, 0d);
            direction = 0;
        } else if (pressedKeys.isEmpty()) {
            setSpeed(0);
        }
    }

    @Override
    public void onCollision(Collider collider) {
        if (collider instanceof Wall) {
            setSpeed(0);
            if (direction == 0) {
                setAnchorLocationY(getAnchorLocation().getY() - 1);
            } else if (direction == 90) {
                setAnchorLocationX(getAnchorLocation().getX() - 1);
            } else if (direction == 180) {
                setAnchorLocationY(getAnchorLocation().getY() + 1);
            } else if (direction == 270) {
                setAnchorLocationX(getAnchorLocation().getX() + 1);
            }


        } else {
            --health;
            System.out.println("collision");
            setAnchorLocation(new Coordinate2D(100, 100));

        }
        if (health == 0) {
            this.theDeepGrotto.setActiveScene(3);
            health = 10;
        }

    }
}
