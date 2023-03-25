package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.Henk;
import com.github.hanyaeger.tutorial.entities.enemies.GoblinMobile.GoblinMobile;
import com.github.hanyaeger.tutorial.entities.enemies.GoblinStatic.GoblinStatic;
import com.github.hanyaeger.tutorial.entities.enemies.Hobgoblin.HobGoblin;
import com.github.hanyaeger.tutorial.entities.enemies.frank.Frank;
import com.github.hanyaeger.tutorial.entities.enemies.frank.FrankSprite;
import com.github.hanyaeger.tutorial.entities.spawner.ArrowSpawner;

public class TestLevel extends DynamicScene implements EntitySpawnerContainer {
    private TheDeepGrotto theDeepGrotto;

    public TestLevel(TheDeepGrotto theDeepGrotto) {
        this.theDeepGrotto = theDeepGrotto;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/backgroundMusic.mp3");
    }

    @Override
    public void setupEntities() {
        
    }

    @Override
    public void setupEntitySpawners() {
        addEntitySpawner(new ArrowSpawner(getWidth(), getHeight()));
    }
}
