package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class WinScene extends SceneBody {
    TheDeepGrotto theDeepGrotto;

    public WinScene(TheDeepGrotto theDeepGrotto) {
        this.theDeepGrotto = theDeepGrotto;
    }

    public void setupEntities() {
        var winSceneText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2), "You win"
        );
        winSceneText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        winSceneText.setFill(Color.WHITE);
        winSceneText.setFont(Font.font("Serif", FontWeight.BOLD, 70));
        addEntity(winSceneText);
    }
}
