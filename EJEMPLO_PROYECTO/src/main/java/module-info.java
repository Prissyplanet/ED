module com.example.ejemplo_proyecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplo_proyecto to javafx.fxml;
    exports com.example.ejemplo_proyecto;
}