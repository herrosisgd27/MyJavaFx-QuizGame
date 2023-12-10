package com.example.myjavafxquizgame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class ResultController {
    QuizController quiz = new QuizController();
    @FXML
    public Label remark, marks, markstext, benartext, salahtext;
    @FXML
    public ProgressIndicator benar_progress, salah_progress;

    int nilaiCounter = quiz.getCounter();

    @FXML
    private void initialize(){
        benartext.setText(String.valueOf("Jawaban benar : "+QuizController.benar));
        salahtext.setText(String.valueOf("Jawaban salah : "+QuizController.salah));
        System.out.println(quiz.counter);
        marks.setText(QuizController.benar + "/" + nilaiCounter);

        float benarr =  (float) QuizController.benar/nilaiCounter;
        benar_progress.setProgress(benarr);

        float salahh =  (float) QuizController.salah/nilaiCounter;
        salah_progress.setProgress(salahh);

        markstext.setText(String.valueOf(QuizController.benar + " Scores dicetak"));

        int benar = QuizController.benar;

        if(benar <= 1){
            remark.setText("NT bang");
        }else if(benar == 2){
            remark.setText("Tingkatin lagi bang, belajarnya");
        }else if(benar == 3){
            remark.setText("Yu semnagat yu tingkatin lagi, belajarnya");
        }else if(benar == quiz.counter){
            remark.setText("Busett, GG bang!!!");
        }

    }


}
