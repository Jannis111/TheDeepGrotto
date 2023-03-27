package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.YaegerEntity;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.Henk;
import com.github.hanyaeger.tutorial.entities.enemies.GoblinMobile.GoblinMobile;
import com.github.hanyaeger.tutorial.entities.enemies.GoblinStatic.GoblinStatic;
import com.github.hanyaeger.tutorial.entities.enemies.Hobgoblin.HobGoblin;
import com.github.hanyaeger.tutorial.entities.enemies.frank.Frank;
import com.github.hanyaeger.tutorial.entities.text.GUI;

public class Room extends LevelOne implements TileMapContainer {
    private TileMap tileMap;

    public Room(TheDeepGrotto theDeepGrotto, TileMap tileMap) {
        super(theDeepGrotto);
        this.tileMap = tileMap;
    }


    public void addEnemies() {
        var gui = new GUI(new Coordinate2D(10, 10));
        addEntity(gui);
        GoblinStatic goblinStatic = new GoblinStatic(new Coordinate2D(500, 500));
        addEntity(goblinStatic);
        HobGoblin hobGoblin = new HobGoblin(new Coordinate2D(300, 300));
        addEntity(hobGoblin);
        GoblinMobile goblinMobile = new GoblinMobile(new Coordinate2D(200, 200));
        addEntity(goblinMobile);
        Frank frank = new Frank(new Coordinate2D(600, 600));
        addEntity(frank);
        Henk player = new Henk(new Coordinate2D(60, 60), theDeepGrotto, gui);
        addEntity(player);
    }

    @Override
    public void setupTileMaps() {
        addTileMap(tileMap);
    }
}
