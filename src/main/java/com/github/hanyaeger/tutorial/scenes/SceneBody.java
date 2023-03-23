package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;

public class SceneBody extends StaticScene {

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/menuMusic.mp3");
        setBackgroundImage("backgrounds/menuBackground.png");
    }

    @Override
    public void setupEntities() {
    }
}
