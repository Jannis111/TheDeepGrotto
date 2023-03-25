package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.Henk;
import com.github.hanyaeger.tutorial.entities.enemies.frank.Frank;
import com.github.hanyaeger.tutorial.entities.map.BossTileMap;
import com.github.hanyaeger.tutorial.entities.map.TestTileMap;
import com.github.hanyaeger.tutorial.entities.spawner.ArrowSpawner;
import com.github.hanyaeger.tutorial.entities.text.GUI;

public class BossLevel extends DynamicScene implements TileMapContainer, EntitySpawnerContainer {
    private TheDeepGrotto theDeepGrotto;

    public BossLevel(TheDeepGrotto theDeepGrotto) {
        this.theDeepGrotto = theDeepGrotto;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/backgroundMusic.mp3");
        setBackgroundImage("backgrounds/levelBackground.png");
    }

    @Override
    public void setupEntities() {
        var gui = new GUI(new Coordinate2D(10, 10));
        addEntity(gui);
        Frank frank = new Frank(new Coordinate2D(600, 600));
        addEntity(frank);
        Henk player = new Henk(new Coordinate2D(60, 60), theDeepGrotto, gui);
        addEntity(player);
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new BossTileMap());
    }

    @Override
    public void setupEntitySpawners() {
        addEntitySpawner(new ArrowSpawner(getWidth(), getHeight()));
    }
}
