module com.example.myjavafxquizgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.myjavafxquizgame to javafx.fxml;
    exports com.example.myjavafxquizgame;
}