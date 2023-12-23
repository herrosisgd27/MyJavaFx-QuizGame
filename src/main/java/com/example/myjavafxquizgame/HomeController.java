package com.example.myjavafxquizgame;

import javafx.application.Platform;
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
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HomeController {
//    @FXML
//    private AnchorPane myPane; // misalkan ini adalah elemen Pane dari FXML

    @FXML
    private ProgressBar proses;

    @FXML
    private Button playBtnQuiz;

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

    @FXML
    private void initialize() {
//        String css;
//        css = getClass().getResource("/CSS/style.css").toExternalForm();
//        proses.getStylesheets().add(css);
//        myLabel.getStylesheets().add(css);
//        myLabel.getStyleClass().add("myLabel");


        playBtnQuiz.setOnMouseEntered(e -> {
            playBtnQuiz.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #5C8374;");
        });

        playBtnQuiz.setOnMouseExited(e -> {
            playBtnQuiz.setStyle("-fx-background-color: #5C8374; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #333333;");
        });

        new Thread(() -> {
            for (double i = 0.0; i <= 1.0; i += 0.01) {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                double progress = i;
                // Ubah progres di JavaFX Application Thread
                proses.setProgress(progress);
            }
            // Setelah selesai mengubah progres, buka stage baru
            Platform.runLater(() -> playBtnQuiz.setVisible(true));

        }).start();

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

    private void openQuizStage() {
        Platform.runLater(() -> {
            try {
                Stage thisstage = (Stage) playBtnQuiz.getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quiz.fxml"));
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
