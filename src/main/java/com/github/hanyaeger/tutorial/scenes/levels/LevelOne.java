package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.entities.YaegerEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.map.TestTileMap;

import java.util.ArrayList;
import java.util.List;

public class LevelOne extends DynamicScene {
    public TheDeepGrotto theDeepGrotto;
    private List<Room> rooms = new ArrayList<>();

    public LevelOne(TheDeepGrotto theDeepGrotto) {
        this.theDeepGrotto = theDeepGrotto;
    }

    @Override
    public void setupScene() {
        initializeRooms();
    }

    private void initializeRooms() {
        // In de TileMap staan de IDs per object al benoemd (zie tutorial)
        Room roomOne = new Room(theDeepGrotto, new TestTileMap());
        rooms.add(roomOne);
        Room roomTwo = new Room(theDeepGrotto, new TestTileMap());
        rooms.add(roomTwo);
        // Etc... voor de overige Rooms van level one
    }

    @Override
    public void setupEntities() {
        for (Room room : rooms) {
            room.addEnemies();
        }
    }

}
