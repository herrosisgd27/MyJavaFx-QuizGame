package com.example.myjavafxquizgame;

import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

public class Hover {
    //mmk
    public static void addHoverEffectQuiz(Button button1, Button button2, Button button3, Button button4) {
        DropShadow shadow = new DropShadow();

        button1.setOnMouseEntered(e -> {
            button1.setEffect(shadow);
            button1.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #5C8374;");
        });
        button1.setOnMouseExited(e -> {
            button1.setEffect(null);
            button1.setStyle("-fx-background-color: #5C8374; -fx-background-radius: 32px; -fx-border-radius: 32px; -fx-text-fill: #333333;");
        });

        button2.setOnMouseEntered(e -> {
            button2.setEffect(shadow);
            button2.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #5C8374;");
        });
        button2.setOnMouseExited(e -> {
            button2.setEffect(null);
            button2.setStyle("-fx-background-color: #5C8374; -fx-background-radius: 32px; -fx-border-radius: 32px; -fx-text-fill: #333333;");
        });

        button3.setOnMouseEntered(e -> {
            button3.setEffect(shadow);
            button3.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #5C8374;");
        });
        button3.setOnMouseExited(e -> {
            button3.setEffect(null);
            button3.setStyle("-fx-background-color: #5C8374; -fx-background-radius: 32px; -fx-border-radius: 32px; -fx-text-fill: #333333;");
        });

        button4.setOnMouseEntered(e -> {
            button4.setEffect(shadow);
            button4.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #5C8374;");
        });
        button4.setOnMouseExited(e -> {
            button4.setEffect(null);
            button4.setStyle("-fx-background-color: #5C8374; -fx-background-radius: 32px; -fx-border-radius: 32px; -fx-text-fill: #333333;");
        });
    }

    public static void addHoverEffectKategori(Button button1, Button button2, Button button3, Button button4) {
        DropShadow shadow = new DropShadow();

        button1.setOnMouseEntered(e -> {
            button1.setEffect(shadow);
            button1.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; textFill: white;");
        });
        button1.setOnMouseExited(e -> {
            button1.setEffect(null);
            button1.setStyle("-fx-background-radius: 25px; -fx-background-color: #e74c3c; textFill: #e74c3c");
        });

        button2.setOnMouseEntered(e -> {
            button2.setEffect(shadow);
            button2.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: white;");
        });
        button2.setOnMouseExited(e -> {
            button2.setEffect(null);
            button2.setStyle("-fx-background-color: #2ecc71; -fx-background-radius: 32px; -fx-border-radius: 32px; -fx-text-fill: #333333;");
        });

        button3.setOnMouseEntered(e -> {
            button3.setEffect(shadow);
            button3.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: white;");
        });
        button3.setOnMouseExited(e -> {
            button3.setEffect(null);
            button3.setStyle("-fx-background-color: #f1c40f; -fx-background-radius: 32px; -fx-border-radius: 32px; -fx-text-fill: #333333;");
        });

        button4.setOnMouseEntered(e -> {
            button4.setEffect(shadow);
            button4.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: white;");
        });
        button4.setOnMouseExited(e -> {
            button4.setEffect(null);
            button4.setStyle("-fx-background-color: #3498db; -fx-background-radius: 32px; -fx-border-radius: 32px; -fx-text-fill: #333333;");
        });
    }
}
