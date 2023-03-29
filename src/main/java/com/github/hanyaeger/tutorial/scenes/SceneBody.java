package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SceneBody extends StaticScene {

    protected TheDeepGrotto theDeepGrotto;

    public SceneBody(TheDeepGrotto theDeepGrotto) {
        this.theDeepGrotto = theDeepGrotto;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/menuMusic.mp3");
        setBackgroundImage("backgrounds/menuBackground.png");
    }

    @Override
    public void setupEntities() {
    }

    public void setTextStyle(TextEntity sceneText) {
        sceneText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        sceneText.setFill(Color.WHITE);
        sceneText.setFont(Font.font("Serif", FontWeight.BOLD, 70));
    }
}
