package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.Henk;
import com.github.hanyaeger.tutorial.entities.enemies.frank.Frank;
import com.github.hanyaeger.tutorial.entities.map.BossButton;
import com.github.hanyaeger.tutorial.entities.map.BossTileMap;
import com.github.hanyaeger.tutorial.entities.spawner.ArrowSpawner;
import com.github.hanyaeger.tutorial.entities.text.GUI;

public class BossLevel extends DynamicScene implements TileMapContainer, EntitySpawnerContainer {
    private final TheDeepGrotto theDeepGrotto;

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
        Henk player = new Henk(new Coordinate2D(400, 60), theDeepGrotto, gui);
        addEntity(player);
        BossButton button = new BossButton(new Coordinate2D(200, 200), new Size(30), "sprites/button.png");
        addEntity(button);
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