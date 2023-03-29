package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.scenes.GameOverScene;
import com.github.hanyaeger.tutorial.scenes.IntroScene;
import com.github.hanyaeger.tutorial.scenes.StartScene;
import com.github.hanyaeger.tutorial.scenes.WinScene;
import com.github.hanyaeger.tutorial.scenes.levels.BossLevel;
import com.github.hanyaeger.tutorial.scenes.levels.RoomOneLevelOne;
import com.github.hanyaeger.tutorial.scenes.levels.RoomTwoLevelOne;

public class TheDeepGrotto extends YaegerGame {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("TheDeepGrotto");
        setSize(new Size(800, 800));
    }

    @Override
    public void setupScenes() {
        addScene(1, new StartScene(this));
        addScene(2, new IntroScene(this));
        addScene(3, new GameOverScene(this));
        addScene(4, new WinScene(this));
        addScene(5, new RoomOneLevelOne(this));
        addScene(6, new RoomTwoLevelOne(this));
        addScene(7, new BossLevel(this));
    }
}
