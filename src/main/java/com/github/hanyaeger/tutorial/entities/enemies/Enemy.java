package com.github.hanyaeger.tutorial.entities.enemies;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.tutorial.entities.Henk;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Enemy extends DynamicCompositeEntity implements KeyListener {
    
    public Enemy(Coordinate2D location) {
        super(location);
    }

    @Override
    protected void setupEntities() {

    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.V)) {
            if (Henk.nukeBomb >= 1) {
                remove();
            }
        }
    }
}
