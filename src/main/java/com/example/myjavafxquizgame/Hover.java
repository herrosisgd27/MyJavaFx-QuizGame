package com.example.myjavafxquizgame;

import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class Hover {
    static DropShadow shadow = new DropShadow();
    //mmk
    public static void addHoverEffectQuiz(Button button1, Button button2, Button button3, Button button4, Circle bulat1, Circle bulat2, Circle bulat3, Circle bulat4, Text text1,Text text2,Text text3,Text text4) {



        button1.setOnMouseEntered(e -> {
            button1.setEffect(shadow);
            bulat1.setFill(Paint.valueOf("#ffffff"));
            text1.setFill(Paint.valueOf("#e74c3c"));
            button1.setStyle("-fx-background-color: #e74c3c; -fx-background-radius :  18px; -fx-border-radius :  18px; -fx-text-fill: #fffffff; -fx-alignment: left center; fx-text-overrun: ellipsis; -fx-wrap-text: true;");
        });
        button1.setOnMouseExited(e -> {
            button1.setEffect( shadow);
            bulat1.setFill(Paint.valueOf("#e74c3c"));
            text1.setFill(Paint.valueOf("#ffffff"));
            button1.setStyle("-fx-background-color:  #fffffff; -fx-background-radius:  18px; -fx-border-radius:  18px; -fx-text-fill: #333333; -fx-alignment: left center; -fx-text-overrun: ellipsis; -fx-wrap-text: true; ");
            button1.setStyle("-fx-text-overrun: ellipsis; -fx-wrap-text: true; -fx-alignment: left;");
        });

        button2.setOnMouseEntered(e -> {
            button2.setEffect(shadow);
            bulat2.setFill(Paint.valueOf("#ffffff"));
            text2.setFill(Paint.valueOf("#2ecc71"));
            button2.setStyle("-fx-background-color: #2ecc71; -fx-background-radius :  18px; -fx-border-radius :  18px; -fx-text-fill: #fffffff; -fx-alignment: left center; -fx-text-overrun: ellipsis; -fx-wrap-text: true; ");

        });
        button2.setOnMouseExited(e -> {
            button2.setEffect( shadow);
            bulat2.setFill(Paint.valueOf("#2ecc71"));
            text2.setFill(Paint.valueOf("#ffffff"));
            button2.setStyle("-fx-background-color:  #fffffff; -fx-background-radius:  18px; -fx-border-radius:  18px; -fx-text-fill: #333333; -fx-alignment: left center; -fx-text-overrun: ellipsis; -fx-wrap-text: true; ");

        });

        button3.setOnMouseEntered(e -> {
            button3.setEffect(shadow);
            bulat3.setFill(Paint.valueOf("#ffffff"));
            text3.setFill(Paint.valueOf("#f1c40f"));
            button3.setStyle("-fx-background-color: #f1c40f; -fx-background-radius :  18px; -fx-border-radius :  18px; -fx-text-fill: #fffffff; -fx-alignment: left center; fx-text-overrun: ellipsis; -fx-wrap-text: true;");
        });
        button3.setOnMouseExited(e -> {
            button3.setEffect( shadow);
            bulat3.setFill(Paint.valueOf("#f1c40f"));
            text3.setFill(Paint.valueOf("#ffffff"));
            button3.setStyle("-fx-background-color:  #fffffff; -fx-background-radius:  18px; -fx-border-radius:  18px; -fx-text-fill: #333333; -fx-alignment: left center; fx-text-overrun: ellipsis; -fx-wrap-text: true;");
        });

        button4.setOnMouseEntered(e -> {
            button4.setEffect(shadow);
            bulat4.setFill(Paint.valueOf("#ffffff"));
            text4.setFill(Paint.valueOf("#3498db"));
            button4.setStyle("-fx-background-color: #3498db; -fx-background-radius :  18px; -fx-border-radius :  18px; -fx-text-fill: #fffffff; -fx-alignment: left center; fx-text-overrun: ellipsis; -fx-wrap-text: true;");
        });
        button4.setOnMouseExited(e -> {
            button4.setEffect( shadow);
            bulat4.setFill(Paint.valueOf("#3498db"));
            text4.setFill(Paint.valueOf("#ffffff"));
            button4.setStyle("-fx-background-color:  #fffffff; -fx-background-radius:  18px; -fx-border-radius:  18px; -fx-text-fill: #333333; -fx-alignment: left center; fx-text-overrun: ellipsis; -fx-wrap-text: true;");
        });

    }




    public static void addHoverEffectKategori(Button button1, Button button2, Button button3, Button button4, Circle bulat1, Circle bulat2, Circle bulat3, Circle bulat4) {

        //button 1
        button1.setOnMouseEntered(e -> {
            button1.setEffect(shadow);
            bulat1.setFill(Paint.valueOf("#e74c3c"));
            button1.setStyle("-fx-text-fill: #fffffff; ");
            button1.setStyle("-fx-background-color: #fffffff; -fx-background-radius :  18px; -fx-border-radius :  18px; -fx-text-fill: #333333;");
        });
        button1.setOnMouseExited(e -> {
            button1.setEffect(shadow);
            bulat1.setFill(Paint.valueOf("#ffffff"));
            button1.setStyle("-fx-text-fill: #ffffff");
            button1.setStyle("-fx-background-color:  #e74c3c; -fx-background-radius:  18px; -fx-border-radius:  18px; -fx-text-fill: #fffffff;");
        });
        //button 2
        button2.setOnMouseEntered(e -> {
            button2.setEffect(shadow);
            bulat2.setFill(Paint.valueOf("#2ecc71"));
            button2.setStyle("-fx-text-fill: #fffffff;");
            button2.setStyle("-fx-background-color: #fffffff; -fx-background-radius :  18px; -fx-border-radius :  18px; -fx-text-fill: #333333;");
        });
        button2.setOnMouseExited(e -> {
            button2.setEffect(shadow);
            bulat2.setFill(Paint.valueOf("#ffffff"));
            button2.setStyle("-fx-text-fill: #ffffff");
            button2.setStyle("-fx-background-color:  #2ecc71; -fx-background-radius:  18px; -fx-border-radius:  18px; -fx-text-fill: #fffffff;");
        });
        //button 3
        button3.setOnMouseEntered(e -> {
            button3.setEffect(shadow);
            bulat3.setFill(Paint.valueOf("#f1c40f"));
            button3.setStyle("-fx-text-fill: #fffffff;");
            button3.setStyle("-fx-background-color: #fffffff; -fx-background-radius :  18px; -fx-border-radius :  18px; -fx-text-fill: #333333;");
        });
        button3.setOnMouseExited(e -> {
            button3.setEffect(shadow);
            bulat3.setFill(Paint.valueOf("#ffffff"));
            button3.setStyle("-fx-text-fill: #ffffff");
            button3.setStyle("-fx-background-color: #f1c40f; -fx-background-radius :  18px; -fx-border-radius :  18px; -fx-text-fill: #fffffff;");
        });
        //button 4
        button4.setOnMouseEntered(e -> {
            button4.setEffect(shadow);
            bulat4.setFill(Paint.valueOf("#3498db"));
            button4.setStyle("-fx-text-fill: #fffffff;");
            button4.setStyle("-fx-background-color: #fffffff; -fx-background-radius :  10px; -fx-border-radius :  10px; -fx-text-fill: #333333;");
        });
        button4.setOnMouseExited(e -> {
            button4.setEffect(shadow);
            bulat4.setFill(Paint.valueOf("#ffffff"));
            button4.setStyle("-fx-text-fill: #ffffff");
            button4.setStyle("-fx-background-color: #3498db; -fx-background-radius :  10px; -fx-border-radius :  10px; -fx-text-fill: #fffffff;");
        });
    }

    public void addHoverEffectResult(Button button1,Button button2){
        button1.setOnMouseEntered(e -> {
            button1.setEffect(shadow);
//            bulat1.setFill(Paint.valueOf("#ffffff"));
//            text1.setFill(Paint.valueOf("#e74c3c"));
            button1.setStyle("-fx-background-color: #fffffff; -fx-background-radius :  10px; -fx-border-radius :  10px; -fx-text-fill: #e74c3c; -fx-alignment: left center;");
        });
        button1.setOnMouseExited(e -> {
            button1.setEffect( shadow);
//            bulat1.setFill(Paint.valueOf("#e74c3c"));
//            text1.setFill(Paint.valueOf("#ffffff"));
            button1.setStyle("-fx-background-color:  #e74c3c; -fx-background-radius:  10px; -fx-border-radius:  10px; -fx-text-fill: #ffffff; -fx-alignment: left center;");
        });

        button2.setOnMouseEntered(e -> {
            button2.setEffect(shadow);
//            bulat2.setFill(Paint.valueOf("#ffffff"));
//            text2.setFill(Paint.valueOf("#2ecc71"));
            button2.setStyle("-fx-background-color: #ffffff; -fx-background-radius :  10px; -fx-border-radius :  10px; -fx-text-fill: #2ecc71; -fx-alignment: left center;");
        });
        button2.setOnMouseExited(e -> {
            button2.setEffect(shadow);
//            bulat2.setFill(Paint.valueOf("#ffffff"));
//            text2.setFill(Paint.valueOf("#2ecc71"));
            button2.setStyle("-fx-background-color: #2ecc71; -fx-background-radius :  10px; -fx-border-radius :  10px; -fx-text-fill: #fffffff; -fx-alignment: left center;");
        });
    }
}
