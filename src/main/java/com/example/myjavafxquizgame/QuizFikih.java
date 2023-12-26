package com.example.myjavafxquizgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Random;


public class QuizFikih extends Hover {
    String[][] options = Fikih.option;
    String[] questions = Fikih.question;
    String[] answers = Fikih.answer;
    Random random = new Random();
    int index = 0;
//    Fikih fikih = new Fikih();

//    String[][] option = fikih.option;
//    String[] question  = fikih.question;
//    String[] answers = fikih.answer;
    @FXML
    private Text nomor,text1,text2,text3,text4;
    @FXML
    public Label arab,pertanyaan;
    @FXML
    public Circle bulat1,bulat2,bulat3,bulat4;
    @FXML
    public Button opt1,opt2,opt3,opt4;

    static int counter = 1;
    static int benar = 0;
    static int salah = 0;
    boolean ulang = true;



    @FXML
    private void initialize(){
        addHoverEffectQuiz(opt1,opt2,opt3,opt4,bulat1,bulat2,bulat3,bulat4,text1,text2,text3,text4);
        if(counter==20){
            counter = 1;
        }
        soal();
    }

    private void soal() {
        if(counter == 11){
            opt1.setFont(new Font("Arial Rounded MT Bold",12));
            opt3.setFont(new Font("Arial Rounded MT Bold",12));
        }else{
            opt1.setFont(new Font("Arial Rounded MT Bold",15));
            opt3.setFont(new Font("Arial Rounded MT Bold",15));
        }
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

    private void nextQuestion(ActionEvent actionEvent){
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

        if(cekJawaban(opt1.getText())){
            benar += 1;
        }else{
            salah +=1;
        }

        nextQuestion(actionEvent);
    }


    @FXML
    private void opt2clik(ActionEvent actionEvent) {

        if(cekJawaban(opt2.getText())){
            benar += 1;
        }else{
            salah +=1;
        }

        nextQuestion(actionEvent);
    }

    @FXML
    private void opt3clik(ActionEvent actionEvent) {

        if(cekJawaban(opt3.getText())){
            benar += 1;
        }else{
            salah +=1;
        }

        nextQuestion(actionEvent);
    }

    @FXML
    private void opt4clik(ActionEvent actionEvent) {
        if(cekJawaban(opt4.getText())){
            benar += 1;
        }else{
            salah +=1;
        }

        nextQuestion(actionEvent);
    }

//        if ( counter == 4){
//
//            try {
//                Stage thisstage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
//                thisstage.close();
//
//                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
//                Scene scene = new Scene(fxmlLoader.load());
//                Stage stage = new Stage();
//                stage.setScene(scene);
//                stage.initStyle(StageStyle.TRANSPARENT);
//                scene.setFill(Color.TRANSPARENT);
//
//                stage.show();
//
//
//            } catch (Exception e){
//                e.printStackTrace();
//            }
//
//        }else{
//            counter++;
//            soal();
//        }
//    }

//    private void tombolDefault(){
//        opt1.setPrefWidth(211);
//        opt1.setLayoutX(76);
//
//        opt2.setPrefWidth(211);
//        opt2.setLayoutX(385);
//
//        opt3.setPrefWidth(211);
//        opt3.setLayoutX(76);
//
//        opt4.setPrefWidth(211);
//        opt4.setLayoutX(385);
//
//    }
//
//    private void ubahUkuranTombol() {
//        // Mengubah ukuran tombol
//        opt1.setPrefWidth(296);
//        opt1.setPrefHeight(104);
//        opt2.setPrefWidth(296);
//        opt2.setPrefHeight(104);
//        opt3.setPrefWidth(296);
//        opt3.setPrefHeight(104);
//        opt4.setPrefWidth(296);
//        opt4.setPrefHeight(104);
//
//        opt1.setLayoutX(47);
//        opt1.setLayoutY(172);
//        opt2.setLayoutX(343);
//        opt2.setLayoutY(172);
//        opt3.setLayoutX(47);
//        opt3.setLayoutY(275);
//        opt4.setLayoutX(343);
//        opt4.setLayoutY(275);
//
//    }
//
//    private void setButtonEllipsis(Button button, String text) {
//        button.setText(text);
//        button.setGraphic(createTextFlow(text)); // Menampilkan elipsis di tengah jika teks terlalu panjang
//    }
//
//    private TextFlow createTextFlow(String text) {
//        TextFlow textFlow = new TextFlow();
//        Text textNode = new Text(text);
//        textFlow.getChildren().add(textNode); // Menambahkan teks ke TextFlow
//
//        // Setel wrappingWidth ke maksimum agar teks dapat ditampilkan dengan baik
//        textNode.wrappingWidthProperty().setValue(Double.MAX_VALUE);
//
//        return textFlow;
//    }
}
