package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.scenes.StartScene;

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
    }
}
