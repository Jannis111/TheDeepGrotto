package com.github.hanyaeger.tutorial.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.tutorial.TheDeepGrotto;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Button extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
   private TheDeepGrotto theDeepGrotto;
    public Button(Coordinate2D initialLocation, TheDeepGrotto theDeepGrotto, String naamButton, Color color, Font font) {
        super(initialLocation, naamButton);
        setFill(color);
        setFont(font);
        this.theDeepGrotto = theDeepGrotto;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }

    @Override
    public void onMouseEntered() {
        setFill(Color.VIOLET);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.PURPLE);
        setCursor(Cursor.DEFAULT);
    }
}
