package com.example.myjavafxquizgame;

import javafx.application.Platform;
import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.input.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.util.Random;


public class HomeController {
//    @FXML
//    private AnchorPane myPane; // misalkan ini adalah elemen Pane dari FXML
    @FXML
    private ProgressBar proses;

    @FXML
    private Button playBtnQuiz;

    @FXML
    private Circle bulatKuning, bulatA,bulatB,bulatUngu;

    @FXML
    private AnchorPane myLabel;

//    @FXML
//    private void initialize() {
//        playBtnQuiz.setOnAction(event -> {
//            // Mulai thread untuk mengubah progres bertahap
//            new Thread(() -> {
//                for (double i = 0.0; i <= 1.0; i += 0.01) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    double progress = i;
//                    // Ubah progres di JavaFX Application Thread
//                    proses.setProgress(progress);
//                }
//                // Setelah selesai mengubah progres, buka stage baru
//                openQuizStage();
//
//            }).start();
//        });
//    }

        Timeline timeline = new Timeline();
        Random random = new Random();
    @FXML
    private void initialize() {
        jalankanAnimasi();

        playBtnQuiz.setOnMouseEntered(e -> {
            playBtnQuiz.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 28px; -fx-border-radius : 32px; -fx-text-fill: #5C8374;");
        });

        playBtnQuiz.setOnMouseExited(e -> {
            playBtnQuiz.setStyle("-fx-background-color: #5C8374; -fx-background-radius: 28px; -fx-border-radius : 32px; -fx-text-fill: #333333;");
        });









//        new Thread(() -> {
//            for (double i = 0.0; i <= 1.0; i += 0.01) {
//                try {
//                    Thread.sleep(30);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                double progress = i;
//                // Ubah progres di JavaFX Application Thread
//                proses.setProgress(progress);
//            }
//            // Setelah selesai mengubah progres, buka stage baru
//            Platform.runLater(() -> playBtnQuiz.setVisible(true));
//
//        }).start();

//        playBtnQuiz.setVisible(false);

        playBtnQuiz.setOnAction(event ->openQuizStage());

        playBtnQuiz.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                openQuizStage();
            }
        });


//        playBtnQuiz.setOnAction(event -> {
//            // Mulai thread untuk mengubah progres bertahap
//            if(event. == KeyCode.ENTER)
//            openQuizStage();
//        });
    }


    private void jalankanAnimasi() {
        animasiX(random.nextInt(309), bulatA); // Angka 500 adalah nilai maksimal Y yang diinginkan
        animasiY(random.nextInt(309), bulatKuning);
        animasiX(random.nextInt(309), bulatB);
        animasiY(random.nextInt(309), bulatUngu);
    }

    private void animasiY(double endY, Circle bulat){
        if (bulat != null) {
            double startY = random.nextInt(500);
            double moveDuration = 8.0;

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
            double startX = random.nextInt(100,800);
            double moveDuration = 8.0;

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
