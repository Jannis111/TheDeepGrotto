package com.github.hanyaeger.tutorial.scenes.levels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import com.github.hanyaeger.tutorial.entities.Henk;

public class TestLevel extends DynamicScene {
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
        Henk player = new Henk(new Coordinate2D(100, 100));
        addEntity(player);
    }
}
