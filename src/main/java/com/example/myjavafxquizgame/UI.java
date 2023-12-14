package com.example.myjavafxquizgame;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class UI {
    private double xOffset = 0, yOffset = 0;
    public void setUpMouseListeners(Scene scene, Stage stage){
        scene.setOnMousePressed(event ->{
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        scene.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });
    }
}
