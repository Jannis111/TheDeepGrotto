package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.tutorial.Buttons.ExitGameButton;
import com.github.hanyaeger.tutorial.Buttons.StartGameButton;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GameOverScene extends SceneBody {

    public GameOverScene(TheDeepGrotto theDeepGrotto) {
        super(theDeepGrotto);
    }

    @Override
    public void setupEntities() {
        var gameOverSceneText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2), "You lost"
        );
        setTextStyle(gameOverSceneText);
        addEntity(gameOverSceneText);
        addEntity(new StartGameButton(new Coordinate2D(getWidth() / 2, getHeight() / 2 + 75), theDeepGrotto, "Start game", Color.WHITE, Font.font("Roboto", FontWeight.BOLD, 30)));
        addEntity(new ExitGameButton(new Coordinate2D(getWidth() / 2, getHeight() / 2 + 150), theDeepGrotto, "Exit game", Color.WHITE, Font.font("Roboto", FontWeight.BOLD, 30)));
    }
}
