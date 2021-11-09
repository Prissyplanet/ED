module com.example.recursivo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recursivo to javafx.fxml;
    exports com.example.recursivo;
}