package com.example.myjavafxquizgame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class ResultController {
    QuizFikih quizFikih = new QuizFikih();
    QuizAqidah quizAqidah = new QuizAqidah();
    QuizSKI quizSKI = new QuizSKI();
    @FXML
    public Label pesan, marksbenar, markssalah, markstext, nilai_maksimum, nilai;

    public Text benartext, salahtext;
    @FXML
    public ProgressIndicator benar_progress, salah_progress;

    @FXML
    public Rectangle marks_benar,marks_salah, lanjut,keluar;


    int bobot;
    @FXML
    private void initialize(){
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
    }else if(benar == quizFikih.counter){
        pesan.setText("Busett, GG bang!!!");
    }else{
        pesan.setText("APA YANG SLAAH WOII");
    }
    nilai.setLayoutY(200);
//        benartext.setText(String.valueOf("benar : "+QuizController.benar));
//        salahtext.setText(String.valueOf("salah: "+QuizController.salah));

    System.out.println(quizFikih.counter);
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
    }else if(benar == quizAqidah.counter){
        pesan.setText("Busett, GG bang!!!");
    }else{
        pesan.setText("APA YANG SLAAH WOII");
    }
    nilai.setLayoutY(200);
//        benartext.setText(String.valueOf("benar : "+QuizController.benar));
//        salahtext.setText(String.valueOf("salah: "+QuizController.salah));

    System.out.println(quizAqidah.counter);
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
    int benar = quizSKI.benar;
//        pesan.setText("HAHAHAH");
    if(benar <= 2){
        pesan.setText("NT bang");
    }else if(benar >= 3 && benar <= 6){
        pesan.setText("Tingkatin lagi bang, belajarnya");
    }else if(benar >= 7){
        pesan.setText("Yu semnagat yu tingkatin lagi, belajarnya");
    }else if(benar == quizSKI.counter){
        pesan.setText("Busett, GG bang!!!");
    }else{
        pesan.setText("APA YANG SLAAH WOII");
    }
    nilai.setLayoutY(200);
//        benartext.setText(String.valueOf("benar : "+QuizController.benar));
//        salahtext.setText(String.valueOf("salah: "+QuizController.salah));

    System.out.println(quizSKI.counter);
    marksbenar.setText(quizSKI.benar + "/" + nilaiCounter);
    markssalah.setText(quizSKI.salah + "/" + nilaiCounter);
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
