module com.example.kodirovka {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodirovka to javafx.fxml;
    exports com.example.kodirovka;
}