package com.example.myjavafxquizgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class QuizController {
    @FXML
    public Label arab,pertanyaan;

    @FXML
    public Button opt1,opt2,opt3,opt4;

    static int counter = 1;
    static int benar = 0;
    static int salah = 0;
    boolean ulang = true;

    @FXML
    private void initialize(){

        hoverButton();

        soal();

    }

    private void hoverButton(){
        opt1.setOnMouseEntered(e ->{
            opt1.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #5C8374;");
        });
        opt2.setOnMouseEntered(e ->{
            opt2.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #5C8374;");
        });
        opt3.setOnMouseEntered(e ->{
            opt3.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #5C8374;");
        });
        opt4.setOnMouseEntered(e ->{
            opt4.setStyle("-fx-background-color: #163e3e; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #5C8374;");
        });

        opt1.setOnMouseExited(e ->{
            opt1.setStyle("-fx-background-color: #5C8374; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #333333;");
        });
        opt2.setOnMouseExited(e ->{
            opt2.setStyle("-fx-background-color: #5C8374; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #333333;");
        });
        opt3.setOnMouseExited(e ->{
            opt3.setStyle("-fx-background-color: #5C8374; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #333333;");
        });
        opt4.setOnMouseExited(e ->{
            opt4.setStyle("-fx-background-color: #5C8374; -fx-background-radius : 32px; -fx-border-radius : 32px; -fx-text-fill: #333333;");
        });
    }

    private void soal() {
//        while(counter >= 10){

        System.out.println("ini benar : "+benar);
        System.out.println("ini salah : " + salah);
        System.out.println(counter);
        if (counter == 1){
            ubahUkuranTombol();
            arab.setText("بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّحِيْمِ ");
            pertanyaan.setText(counter+". apa arti dari arab di atas");
            opt1.setText("Dengan nama Allah Yang Maha Pengasih\nlagi Maha Penyayang");
            opt2.setText("Allah maha mengetahui");
            opt3.setText("Allah maha mendengar");
            opt4.setText("Tiada tuhan selain Allah");

        }else if(counter == 2){
            tombolDefault();
            arab.setText("");
            pertanyaan.setText(counter+". Arti fana adalah ");
            opt1.setText("selalu");
            opt2.setText("sementara");
            opt3.setText("kekal");
            opt4.setText("tidak ada akhir");
        }else if(counter == 3){
            arab.setText("");
            pertanyaan.setText(counter+". perilaku manusia yang baik berarti");
            opt1.setText("Moralitas tercela");
            opt2.setText("karakter terpuji");
            opt3.setText("Ibadah");
            opt4.setText("Moralitas");
        }else if(counter == 4){
            ubahUkuranTombol();
            arab.setText("آ أَعْبُدُ مَا تَعْبُدُونَ  ");
            pertanyaan.setText(counter+". perhatikan surat al-kafirun ayat 2 di atas.sikap yang sesuai dengan ayat diatas adalah");
            opt1.setText("Seorang muslim tidak akan kerjasama\ndengan pemeluk agama lain");
            opt2.setText("Seorang muslim dilarang mengunjungi\ntempat ibadah agama lain");
            opt3.setText("Ajaran yang paling benar adalah Islam");
            opt4.setText("Seorang muslim tidak akan menyembah\n Tuhan selain Allah");
        }
//        counter++;
//        }

    }

    public int getCounter() {
        return counter;
    }

    @FXML
    private void opt1clik(ActionEvent actionEvent) {

        if(cekJawaban(opt1.getText())){
            benar += 1;
        }else{
            salah +=1;
        }

        if ( counter == 4){

            try {

                Stage thisstage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();


            } catch (Exception e){
                e.printStackTrace();
            }

        }else{
            counter++;
            soal();
        }



    }

    boolean cekJawaban(String jawaban) {

        if(counter == 1 ){
            return jawaban.equals("Dengan nama Allah Yang Maha Pengasih\nlagi Maha Penyayang");
        }else if(counter == 2){
            return jawaban.equals("sementara");
        }else if(counter == 3){
            return jawaban.equals("karakter terpuji");
        }else if(counter == 4){
            return jawaban.equals("Seorang muslim tidak akan menyembah\n Tuhan selain Allah");
        }

        return false;
    }

    @FXML
    private void opt2clik(ActionEvent actionEvent) {

        if(cekJawaban(opt2.getText())){
            benar += 1;
        }else{
            salah +=1;
        }

        if ( counter == 4){

            try {
                Stage thisstage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();


            } catch (Exception e){
                e.printStackTrace();
            }

        }else{
            counter++;
            soal();
        }
    }

    private void tombolDefault(){
        opt1.setPrefWidth(211);
        opt1.setLayoutX(76);

        opt2.setPrefWidth(211);
        opt2.setLayoutX(385);

        opt3.setPrefWidth(211);
        opt3.setLayoutX(76);

        opt4.setPrefWidth(211);
        opt4.setLayoutX(385);

    }

    private void ubahUkuranTombol() {
        // Mengubah ukuran tombol
        opt1.setPrefWidth(300);
        opt2.setPrefWidth(300);
        opt3.setPrefWidth(300);
        opt4.setPrefWidth(300);
        opt1.setLayoutX(45);
        opt2.setLayoutX(350);
        opt3.setLayoutX(45);
        opt4.setLayoutX(350);

    }

    @FXML
    private void opt3clik(ActionEvent actionEvent) {

        if(cekJawaban(opt3.getText())){
            benar += 1;
        }else{
            salah +=1;
        }

        if ( counter == 4){

            try {
                Stage thisstage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();


            } catch (Exception e){
                e.printStackTrace();
            }

        }else{
            counter++;
            soal();
        }
    }

    @FXML
    private void opt4clik(ActionEvent actionEvent) {
        if(cekJawaban(opt4.getText())){
            benar += 1;
        }else{
            salah +=1;
        }

        if ( counter == 4){

            try {
                Stage thisstage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
                thisstage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();


            } catch (Exception e){
                e.printStackTrace();
            }

        }else{
            counter++;
            soal();
        }
    }
}
