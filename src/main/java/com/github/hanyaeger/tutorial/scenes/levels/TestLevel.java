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
        Henk player = new Henk(new Coordinate2D(100, 100), theDeepGrotto);
        addEntity(player);
        GoblinStatic goblinStatic = new GoblinStatic(new Coordinate2D(500, 500));
        addEntity(goblinStatic);
        HobGoblin hobGoblin = new HobGoblin(new Coordinate2D(300, 300));
        addEntity(hobGoblin);
        GoblinMobile goblinMobile = new GoblinMobile(new Coordinate2D(200, 200));
        addEntity(goblinMobile);
        Frank frank = new Frank(new Coordinate2D(600, 600));
        addEntity(frank);
    }

    @Override
    public void setupEntitySpawners() {

        addEntitySpawner(new ArrowSpawner(getWidth(), getHeight()));


    }
}
