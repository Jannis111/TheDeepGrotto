package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.tutorial.Buttons.PlayGameButton;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartScene extends SceneBody {

    public StartScene(TheDeepGrotto theDeepGrotto) {
        super(theDeepGrotto);
    }

    public void setupEntities() {
        var startSceneText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2), "The Deep Grotto"
        );
        setTextStyle(startSceneText);
        addEntity(startSceneText);
        addEntity(new PlayGameButton(new Coordinate2D(getWidth() / 2, getHeight() / 2 + 75), theDeepGrotto, "Start game", Color.WHITE, Font.font("Roboto", FontWeight.BOLD, 30)));
    }

}
