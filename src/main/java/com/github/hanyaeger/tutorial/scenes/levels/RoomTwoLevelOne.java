package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.Henk;
import com.github.hanyaeger.tutorial.entities.enemies.GoblinMobile.GoblinMobile;
import com.github.hanyaeger.tutorial.entities.enemies.GoblinStatic.GoblinStatic;
import com.github.hanyaeger.tutorial.entities.enemies.Hobgoblin.HobGoblin;
import com.github.hanyaeger.tutorial.entities.map.RoomTwoLevelOneMap;
import com.github.hanyaeger.tutorial.entities.text.BossHealthText;
import com.github.hanyaeger.tutorial.entities.text.GUI;

public class RoomTwoLevelOne extends DynamicScene implements TileMapContainer {
    private final TheDeepGrotto theDeepGrotto;

    public RoomTwoLevelOne(TheDeepGrotto theDeepGrotto) {
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
        var bossHealthText = new BossHealthText(new Coordinate2D(500, 10));
        addEntity(gui);
        GoblinStatic goblinStaticOne = new GoblinStatic(new Coordinate2D(100, 500));
        addEntity(goblinStaticOne);
        GoblinStatic goblinStaticTwo = new GoblinStatic(new Coordinate2D(600, 700));
        addEntity(goblinStaticTwo);
        HobGoblin hobGoblin = new HobGoblin(new Coordinate2D(670, 170));
        addEntity(hobGoblin);
        GoblinMobile goblinMobile = new GoblinMobile(new Coordinate2D(400, 200));
        addEntity(goblinMobile);
        Henk player = new Henk(new Coordinate2D(60, 60), theDeepGrotto, gui, bossHealthText);

        addEntity(player);
    }

    @Override
    public void setupTileMaps() {

        addTileMap(new RoomTwoLevelOneMap());
    }

}
