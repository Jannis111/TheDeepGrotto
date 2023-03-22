package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.TheDeepGrotto;

public class SceneBody extends StaticScene {

    private TheDeepGrotto theDeepGrotto;

    public SceneBody(TheDeepGrotto theDeepGrotto) {
        this.theDeepGrotto = theDeepGrotto;
    }
    @Override
    public void setupScene() {
    }

    @Override
    public void setupEntities() {
    }
}
