package com.example.myjavafxquizgame;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ResultController extends Hover{
    QuizFikih quizFikih = new QuizFikih();
    QuizAqidah quizAqidah = new QuizAqidah();
    QuizSKI quizSKI = new QuizSKI();
    QuizTahsin quizTahsin = new QuizTahsin();
    @FXML
    public Label pesan, marksbenar, markssalah, markstext, nilai_maksimum, nilai;
    @FXML
    public Button lanjut,keluar;
    public Text benartext, salahtext;
    @FXML
    public ProgressIndicator benar_progress, salah_progress;

    @FXML
    public Rectangle marks_benar,marks_salah;

    int bobot;
    @FXML
    private void initialize(){
        addHoverEffectResult(keluar,lanjut);
        if(quizFikih.getCounter() != 1){
            System.out.println("INI FIQIH");
            Fiqih(quizFikih);
        }
        if(quizAqidah.getCounter() != 1){
            System.out.println("INI AQidaH");
            Aqidah(quizAqidah);
        }
        if(quizSKI.getCounter() != 1){
            System.out.println("INI SKI");
            SKI(quizSKI);
        }
        if(quizTahsin.getCounter() != 1){
            System.out.println("INI Tahsin");
            Tahsin(quizTahsin);
        }
        lanjut.setOnAction(event ->openLanjutStage());
        keluar.setOnAction(actionEvent -> openKeluarStage());
//        openKeluarStage();
    }


    private void openLanjutStage() {
        Platform.runLater(() -> {
            try {
                Stage thisstage = (Stage) lanjut.getScene().getWindow();
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

    private void openKeluarStage() {
        Stage thisstage = (Stage) keluar.getScene().getWindow();
        thisstage.close();
    }
    private void Fiqih(QuizFikih quizFikih){
        int nilaiCounter = quizFikih.getCounter();
        int maks = nilaiCounter;
        int benar = QuizFikih.benar;
    //        pesan.setText("HAHAHAH");
        if(benar <= 2){
            pesan.setText("NT bang");
        }else if(benar >= 3 && benar <= 6){
            pesan.setText("Tingkatin lagi bang, belajarnya");
        }else if(benar >= 7){
            pesan.setText("Yu semnagat yu tingkatin lagi, belajarnya");
        }else if(benar == QuizFikih.counter){
            pesan.setText("Busett, GG bang!!!");
        }else{
            pesan.setText("APA YANG SLAAH WOII");
        }
        nilai.setLayoutY(200);
    //        benartext.setText(String.valueOf("benar : "+QuizController.benar));
    //        salahtext.setText(String.valueOf("salah: "+QuizController.salah));

        System.out.println(QuizFikih.counter);
        marksbenar.setText(QuizFikih.benar + "/" + nilaiCounter);
        markssalah.setText(QuizFikih.salah + "/" + nilaiCounter);
        nilai.setText(String.valueOf(benar * 5));
    //        float benarr =  (float) QuizController.benar/nilaiCounter;
    //        benar_progress.setProgress(benarr);
    //
    //        float salahh =  (float) QuizController.salah/nilaiCounter;
    //        salah_progress.setProgress(salahh);
        nilai_maksimum.setText("dari 100");

    //        markstext.setText(String.valueOf(QuizController.benar + " Scores dicetak"));
    }

    private void Aqidah(QuizAqidah quizAqidah){
        int nilaiCounter = quizAqidah.getCounter();
        int maks = nilaiCounter;
        int benar = QuizAqidah.benar;
    //        pesan.setText("HAHAHAH");
        if(benar <= 2){
            pesan.setText("NT bang");
        }else if(benar >= 3 && benar <= 6){
            pesan.setText("Tingkatin lagi bang, belajarnya");
        }else if(benar >= 7){
            pesan.setText("Yu semnagat yu tingkatin lagi, belajarnya");
        }else if(benar == QuizAqidah.counter){
            pesan.setText("Busett, GG bang!!!");
        }else{
            pesan.setText("APA YANG SLAAH WOII");
        }
        nilai.setLayoutY(200);
    //        benartext.setText(String.valueOf("benar : "+QuizController.benar));
    //        salahtext.setText(String.valueOf("salah: "+QuizController.salah));

        System.out.println(QuizAqidah.counter);
        marksbenar.setText(QuizAqidah.benar + "/" + nilaiCounter);
        markssalah.setText(QuizAqidah.salah + "/" + nilaiCounter);
        nilai.setText(String.valueOf(benar * 5));
    //        float benarr =  (float) QuizController.benar/nilaiCounter;
    //        benar_progress.setProgress(benarr);
    //
    //        float salahh =  (float) QuizController.salah/nilaiCounter;
    //        salah_progress.setProgress(salahh);
        nilai_maksimum.setText("dari 100");

    //        markstext.setText(String.valueOf(QuizController.benar + " Scores dicetak"));
    }

    private void SKI(QuizSKI quizSKI){
        int nilaiCounter = quizSKI.getCounter();
        int maks = nilaiCounter;
        int benar = QuizSKI.benar;
    //        pesan.setText("HAHAHAH");
        if(benar <= 2){
            pesan.setText("NT bang");
        }else if(benar >= 3 && benar <= 6){
            pesan.setText("Tingkatin lagi bang, belajarnya");
        }else if(benar >= 7){
            pesan.setText("Yu semnagat yu tingkatin lagi, belajarnya");
        }else if(benar == QuizSKI.counter){
            pesan.setText("Busett, GG bang!!!");
        }else{
            pesan.setText("APA YANG SLAAH WOII");
        }
        nilai.setLayoutY(200);
    //        benartext.setText(String.valueOf("benar : "+QuizController.benar));
    //        salahtext.setText(String.valueOf("salah: "+QuizController.salah));

        System.out.println(QuizSKI.counter);
        marksbenar.setText(QuizSKI.benar + "/" + nilaiCounter);
        markssalah.setText(QuizSKI.salah + "/" + nilaiCounter);
        nilai.setText(String.valueOf(benar * 5));
    //        float benarr =  (float) QuizController.benar/nilaiCounter;
    //        benar_progress.setProgress(benarr);
    //
    //        float salahh =  (float) QuizController.salah/nilaiCounter;
    //        salah_progress.setProgress(salahh);
        nilai_maksimum.setText("dari 100");

    //        markstext.setText(String.valueOf(QuizController.benar + " Scores dicetak"));
    }

    private void Tahsin(QuizTahsin quizTahsin){
        int nilaiCounter = quizTahsin.getCounter();
        int maks = nilaiCounter;
        int benar = QuizTahsin.benar;
        //        pesan.setText("HAHAHAH");
        if(benar <= 2){
            pesan.setText("NT bang");
        }else if(benar >= 3 && benar <= 6){
            pesan.setText("Tingkatin lagi bang, belajarnya");
        }else if(benar >= 7){
            pesan.setText("Yu semnagat yu tingkatin lagi, belajarnya");
        }else if(benar == QuizTahsin.counter){
            pesan.setText("Busett, GG bang!!!");
        }else{
            pesan.setText("APA YANG SLAAH WOII");
        }
        nilai.setLayoutY(200);
        //        benartext.setText(String.valueOf("benar : "+QuizController.benar));
        //        salahtext.setText(String.valueOf("salah: "+QuizController.salah));

        System.out.println(QuizTahsin.counter);
        marksbenar.setText(QuizTahsin.benar + "/" + nilaiCounter);
        markssalah.setText(QuizTahsin.salah + "/" + nilaiCounter);
        nilai.setText(String.valueOf(benar * 5));
        //        float benarr =  (float) QuizController.benar/nilaiCounter;
        //        benar_progress.setProgress(benarr);
        //
        //        float salahh =  (float) QuizController.salah/nilaiCounter;
        //        salah_progress.setProgress(salahh);
        nilai_maksimum.setText("dari 100");

        //        markstext.setText(String.valueOf(QuizController.benar + " Scores dicetak"));
    }

}
