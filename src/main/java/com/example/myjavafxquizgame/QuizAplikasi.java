package com.example.myjavafxquizgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class QuizAplikasi extends Application {

    @Override
    public void start(Stage stage) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(QuizAplikasi.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        UI ui = new UI();
        stage.setTitle("Quiz Game!");
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        stage.show();
        ui.setUpMouseListeners(scene,stage);

    }

    public static void main(String[] args) {
        launch();
    }
}
