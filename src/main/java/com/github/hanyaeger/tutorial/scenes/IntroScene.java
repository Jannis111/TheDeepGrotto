package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class IntroScene extends SceneBody {
    public IntroScene(TheDeepGrotto theDeepGrotto) {
        super(theDeepGrotto);

    }

    @Override
    public void setupEntities() {
        var introSceneText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2), "Let's go on an adventure"
        );
        introSceneText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        introSceneText.setFill(Color.BLACK);
        introSceneText.setFont(Font.font("Serif", FontWeight.BOLD, 70));
        addEntity(introSceneText);
    }
}
