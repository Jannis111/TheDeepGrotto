package com.github.hanyaeger.tutorial.entities.enemies.Hobgoblin;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.entities.Henk;
import com.github.hanyaeger.tutorial.entities.enemies.Goblin;
import com.github.hanyaeger.tutorial.entities.enemies.Sprite;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class HobGoblin extends Goblin {

    public HobGoblin(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        addEntity(new Sprite("sprites/goblinIdle.png", new Coordinate2D(0, 0), 50, 1, 1, 0));
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.V)) {
            if (Henk.nukeBomb >= 1) {
                remove();
            }
        } else if (pressedKeys.contains(KeyCode.C)) {
            if (Henk.strongBomb >= 1) {
                remove();
            }
        }
    }
}
