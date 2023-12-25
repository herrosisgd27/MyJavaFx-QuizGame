package com.example.myjavafxquizgame;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class ResultController {
    QuizController quiz = new QuizController();
    @FXML
    public Label pesan, marksbenar, markssalah, markstext, nilai_maksimum, nilai;

    public Text benartext, salahtext;
    @FXML
    public ProgressIndicator benar_progress, salah_progress;

    @FXML
    public Rectangle marks_benar,marks_salah, lanjut, keluar;

    int nilaiCounter = quiz.getCounter();
    int maks = 100;
    int bobot;
    @FXML
    private void initialize(){
        int benar = QuizController.benar;
//        pesan.setText("HAHAHAH");
        if(benar <= 2){
            pesan.setText("NT bang");
        }else if(benar >= 3 && benar <= 6){
            pesan.setText("Tingkatin lagi bang, belajarnya");
        }else if(benar >= 7){
            pesan.setText("Yu semangat yu tingkatin lagi, belajarnya");
        }else if(benar == quiz.counter){
            pesan.setText("Busett, GG bang!!!");
        }else{
            pesan.setText("APA YANG SALAH WOII");
        }
        nilai.setLayoutY(200);
//        benartext.setText(String.valueOf("benar : "+QuizController.benar));
//        salahtext.setText(String.valueOf("salah: "+QuizController.salah));

        System.out.println(quiz.counter);
        marksbenar.setText(QuizController.benar + "/" + nilaiCounter);
        markssalah.setText(QuizController.salah + "/" + nilaiCounter);
        nilai.setText(String.valueOf(benar * 2));
//        float benarr =  (float) QuizController.benar/nilaiCounter;
//        benar_progress.setProgress(benarr);
//
//        float salahh =  (float) QuizController.salah/nilaiCounter;
//        salah_progress.setProgress(salahh);
        nilai_maksimum.setText("dari " + maks);

//        markstext.setText(String.valueOf(QuizController.benar + " Scores dicetak"));





    }


}
