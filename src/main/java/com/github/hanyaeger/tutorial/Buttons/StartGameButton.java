package com.github.hanyaeger.tutorial.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class StartGameButton extends Button {
    TheDeepGrotto theDeepGrotto;

    public StartGameButton(Coordinate2D initialLocation, TheDeepGrotto theDeepGrotto, String nameButton, Color color, Font font) {
        super(initialLocation, theDeepGrotto, nameButton, color, font);
        this.theDeepGrotto = theDeepGrotto;
    }


    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        theDeepGrotto.setActiveScene(5);
    }
}
