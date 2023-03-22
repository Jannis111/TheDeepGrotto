package com.github.hanyaeger.tutorial.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class RestartGameButton extends Button {
    TheDeepGrotto theDeepGrotto;

    public RestartGameButton(Coordinate2D initialLocation, TheDeepGrotto theDeepGrotto, String nameButton, Color color, Font font) {
        super(initialLocation, theDeepGrotto, nameButton, color, font);
        this.theDeepGrotto = theDeepGrotto;
    }

}