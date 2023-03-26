package com.github.hanyaeger.tutorial.entities.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BossHealthText extends TextEntity {
    public BossHealthText(Coordinate2D initialLocation) {
        super(initialLocation);

        setFont(Font.font("Serif", FontWeight.BOLD, 30));
        setFill(Color.BLACK);
    }

    public void setBossHealthText(int bossHealth) {
        setText("Boss Health: " + bossHealth);
    }
}
