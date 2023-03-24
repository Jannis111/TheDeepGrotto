package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.Henk;
import com.github.hanyaeger.tutorial.entities.map.TestTileMap;
import com.github.hanyaeger.tutorial.entities.text.GUI;

public class TestLevel extends DynamicScene implements TileMapContainer {
    private TheDeepGrotto theDeepGrotto;

    public TestLevel(TheDeepGrotto theDeepGrotto) {
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
        Henk player = new Henk(new Coordinate2D(50, 50), gui);
        addEntity(player);
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new TestTileMap());
    }
}
