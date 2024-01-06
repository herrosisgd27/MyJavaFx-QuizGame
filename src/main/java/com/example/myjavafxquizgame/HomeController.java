package com.example.myjavafxquizgame;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.util.Random;

public class HomeController{

    @FXML
    private Button playBtnQuiz;

    @FXML
    private Circle bulatKuning, bulatA,bulatB,bulatUngu;

    @FXML
    private AnchorPane myLabel;

        Random random = new Random();
    @FXML
    private void initialize() {
        jalankanAnimasi();

        playBtnQuiz.setOnMouseEntered(e -> {
            playBtnQuiz.setStyle("-fx-background-color: #476056; -fx-background-radius : 28px; -fx-border-radius : 32px; -fx-text-fill: #ffffff;");
        });

        playBtnQuiz.setOnMouseExited(e -> {
            playBtnQuiz.setStyle("-fx-background-color: #5C8374; -fx-background-radius: 28px;");
        });
        playBtnQuiz.setOnAction(event ->openQuizStage());

    }

    private void jalankanAnimasi() {
        animasiX(random.nextInt(500), bulatA); // Angka 500 adalah nilai maksimal Y yang diinginkan
        animasiY(random.nextInt(500), bulatKuning);
        animasiX(random.nextInt(500), bulatB);
        animasiY(random.nextInt(500), bulatUngu);
    }

    private void animasiY(double endY, Circle bulat){
        if (bulat != null) {
            double startY = random.nextInt(100,500);
            double moveDuration = 20.0;

            // Membuat objek Timeline untuk setiap lingkaran
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(bulat.layoutYProperty(), startY)),
                    new KeyFrame(Duration.seconds(moveDuration), new KeyValue(bulat.layoutYProperty(), endY)),
                    new KeyFrame(Duration.seconds(moveDuration * 2), new KeyValue(bulat.layoutYProperty(), startY))
            );

            // Set looping untuk animasi
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
        } else {
            System.out.println("bulat is null. Check FXML file connection.");
        }
    }

    private void animasiX(double endX, Circle bulat){
        if (bulat != null) {
            double startX = random.nextInt(100,500);
            double moveDuration = 20.0;

            // Membuat objek Timeline untuk setiap lingkaran
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(bulat.layoutXProperty(), startX)),
                    new KeyFrame(Duration.seconds(moveDuration), new KeyValue(bulat.layoutXProperty(), endX)),
                    new KeyFrame(Duration.seconds(moveDuration * 2), new KeyValue(bulat.layoutXProperty(), startX))
            );

            // Set looping untuk animasi
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
        } else {
            System.out.println("bulat is null. Check FXML file connection.");
        }
    }

    private void openQuizStage() {
        Platform.runLater(() -> {
            try {
                Stage thisstage = (Stage) playBtnQuiz.getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("kategori.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
