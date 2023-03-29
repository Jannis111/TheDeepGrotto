package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.TheDeepGrotto;

public class LevelOne extends DynamicScene implements TileMapContainer, EntitySpawnerContainer {

    protected TheDeepGrotto theDeepGrotto;

    public LevelOne(TheDeepGrotto theDeepGrotto) {
        this.theDeepGrotto = theDeepGrotto;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/backgroundMusic.mp3");
        setBackgroundImage("backgrounds/levelBackground.png");
    }

    @Override
    public void setupEntities() {

    }

    @Override
    public void setupTileMaps() {

    }

    @Override
    public void setupEntitySpawners() {

    }
}
