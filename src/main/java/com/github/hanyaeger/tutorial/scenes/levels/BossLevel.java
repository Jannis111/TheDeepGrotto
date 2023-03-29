package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.Henk;
import com.github.hanyaeger.tutorial.entities.enemies.frank.Frank;
import com.github.hanyaeger.tutorial.entities.map.BossButton;
import com.github.hanyaeger.tutorial.entities.map.BossTileMap;
import com.github.hanyaeger.tutorial.entities.spawner.ArrowSpawner;
import com.github.hanyaeger.tutorial.entities.text.BossHealthText;
import com.github.hanyaeger.tutorial.entities.text.GUI;

public class BossLevel extends LevelOne {
    public BossLevel(TheDeepGrotto theDeepGrotto) {
        super(theDeepGrotto);
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/bossMusic.mp3");
        setBackgroundImage("backgrounds/levelBackground.png");
    }

    @Override
    public void setupEntities() {
        var gui = new GUI(new Coordinate2D(10, 10));
        var bossHealthText = new BossHealthText(new Coordinate2D(575, 10));
        addEntity(gui);
        addEntity(bossHealthText);
        Henk player = new Henk(new Coordinate2D(400, 60), theDeepGrotto, gui, bossHealthText);
        addEntity(player);
        Frank frank = new Frank(new Coordinate2D(360, 700), bossHealthText, player.getBossHealth());
        addEntity(frank);
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
