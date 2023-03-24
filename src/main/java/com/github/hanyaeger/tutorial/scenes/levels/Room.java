package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.entities.YaegerEntity;
import com.github.hanyaeger.tutorial.entities.Enemy;

public class Room {

    public Room(int[][] tileMap) {
        tileMap = new int[][]{
                {
                        0, 0, 0, 0
                },
                {
                        0, 0, 0, 0
                },
                {
                        0, 0, 0, 0
                },
                {
                        0, 0, 0, 0
                }
        };
    }


    public void addEnemies(Enemy enemy) {

    }

    public YaegerEntity[] getEntities() {
    }
}
