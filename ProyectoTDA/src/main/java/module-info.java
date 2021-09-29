module com.example.proyectotda {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectotda to javafx.fxml;
    exports com.example.proyectotda;
}