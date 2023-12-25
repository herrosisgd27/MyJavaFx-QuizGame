package com.example.myjavafxquizgame;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class KategoriController extends Hover{
    public Button fiqih,tahsin,aqidah,sejarah;

    public Label textFiqih,textTahsin,textAqidah,textSejarah;

//    @FXML
//    public Group fiqih;
    public Circle bulat1,bulat2,bulat3,bulat4;

    public void initialize(){
        addHoverEffectKategori(fiqih,tahsin,aqidah,sejarah,bulat1,bulat2,bulat3,bulat4);

        fiqih.setOnAction(event ->openFiqihStage());
        sejarah.setOnAction(event ->openSkiStage());
        aqidah.setOnAction(event ->openAqidahStage());
        tahsin.setOnAction(event ->openTahsinStage());

    }

    private void openFiqihStage() {
        Platform.runLater(() -> {
            try {
                Stage thisstage = (Stage) fiqih.getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quizFikih.fxml"));
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

    private void openAqidahStage() {
        Platform.runLater(() -> {
            try {
                Stage thisstage = (Stage) aqidah.getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quizAqidah.fxml"));
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

    private void openSkiStage() {
        Platform.runLater(() -> {
            try {
                Stage thisstage = (Stage) sejarah.getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quizSKI.fxml"));
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
    private void openTahsinStage() {
        Platform.runLater(() -> {
            try {
                Stage thisstage = (Stage) tahsin.getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("quizTahsin.fxml"));
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
