module com.example.galeria_zdjec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.galeria_zdjec to javafx.fxml;
    exports com.example.galeria_zdjec;
}