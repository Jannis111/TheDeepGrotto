package com.github.hanyaeger.tutorial.entities.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GUI extends TextEntity {

    public GUI(Coordinate2D initialLocation) {
        super(initialLocation);
        setFont(Font.font("Serif", FontWeight.BOLD, 28));
        setFill(Color.BLACK);
    }

    public void setGUIText(int health, int strongBomb, int nukeBomb) {
        setText("Health: " + health + " | " + "StrongBombs: " + strongBomb + " | " + "NukeBombs: " + nukeBomb);
    }

}
