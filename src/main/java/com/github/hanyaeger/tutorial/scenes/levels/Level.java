package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.entities.YaegerEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.tutorial.entities.map.TestTileMap;

import java.util.ArrayList;
import java.util.List;

public class Level extends DynamicScene {


    private List<Room> rooms = new ArrayList<>();
    private List<int[][]> roomTileMaps = new ArrayList<>();

    @Override
    public void setupScene() {
        initializeRooms();
    }

    private void initializeRooms() {
        // In de TileMap staan de IDs per object al benoemd (zie tutorial)
        Room roomOne = new Room(roomTileMaps[0]);
        roomOne.addEnemies(initializeEnemies(0));
        rooms.add(roomOne);

        // Etc... voor de overige Rooms van level one
    }

    private List<Enemy> initializeEnemies() {
        List<Enemy> enemies = new ArrayList<>();
        TestTileMap testTileMap = roomTileMaps[0];
        // Initialiseer per ID uit de tilemap de juiste Enemy en stop die in de Enemy lijst
    }

    @Override
    public void setupEntities() {
        for (Room room : rooms) {
            for (YaegerEntity entity : room.getEntities()) {
                addEntity(entity);
            }
        }
    }
}


