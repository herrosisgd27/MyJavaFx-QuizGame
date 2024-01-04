package com.example.myjavafxquizgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Random;


public class QuizTahsin extends Hover {
    String[][] options = Tahsin.option;
    String[] questions = Tahsin.question;
    String[] answers = Tahsin.answer;
    Random random = new Random();
    int index;

    @FXML
    private Text nomor, text1, text2, text3, text4;

    @FXML
    public Label pertanyaan;


    @FXML
    public Circle bulat1, bulat2, bulat3, bulat4;
    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 1;
    static int benar = 0;
    static int salah = 0;
    boolean ulang = true;


    @FXML
    private void initialize() {
        addHoverEffectQuiz(opt1, opt2, opt3, opt4, bulat1, bulat2, bulat3, bulat4, text1, text2, text3, text4);



        if (counter == 20) {
            counter = 1;
            benar = 0;
            salah = 0;
        }
        soal();
    }

    private void soal() {
//        if(counter == 11){
//            opt1.setFont(new Font("Arial Rounded MT Bold",12));
//            opt3.setFont(new Font("Arial Rounded MT Bold",12));
//        }else{
//            opt1.setFont(new Font("Arial Rounded MT Bold",15));
//            opt3.setFont(new Font("Arial Rounded MT Bold",15));
//        }
        if (counter <= 20) {
            index = random.nextInt(50);
            nomor.setText(String.valueOf(counter));
            pertanyaan.setText(questions[index]);



            opt1.setText(options[index][0]);
            opt2.setText(options[index][1]);
            opt3.setText(options[index][2]);
            opt4.setText(options[index][3]);
        }
        System.out.println(questions[index]);
        System.out.println(answers[index]);
        System.out.println(index);
//        }
        System.out.println("ini benar : " + benar);
        System.out.println("ini salah : " + salah);
        System.out.println(counter);
    }

    boolean cekJawaban(String jawaban) {
        return jawaban.equals(answers[index]);
    }

    public int getCounter() {
        return counter;
    }

    private void nextQuestion(ActionEvent actionEvent) {
        if (counter < 20) { // Cek apakah masih ada pertanyaan berikutnya
            counter++;
            soal(); // Tampilkan pertanyaan berikutnya
        } else {
            // Lakukan logika untuk menampilkan hasil atau melakukan sesuatu setelah selesai menjawab pertanyaan terakhir
            try {
//                counter++;
                Stage thisstage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void opt1clik(ActionEvent actionEvent) {

        if (cekJawaban(opt1.getText())) {
            benar += 1;
        } else {
            salah += 1;
        }

        nextQuestion(actionEvent);
    }


    @FXML
    private void opt2clik(ActionEvent actionEvent) {

        if (cekJawaban(opt2.getText())) {
            benar += 1;
        } else {
            salah += 1;
        }

        nextQuestion(actionEvent);
    }

    @FXML
    private void opt3clik(ActionEvent actionEvent) {

        if (cekJawaban(opt3.getText())) {
            benar += 1;
        } else {
            salah += 1;
        }

        nextQuestion(actionEvent);
    }

    @FXML
    private void opt4clik(ActionEvent actionEvent) {
        if (cekJawaban(opt4.getText())) {
            benar += 1;
        } else {
            salah += 1;
        }

        nextQuestion(actionEvent);
    }
}
