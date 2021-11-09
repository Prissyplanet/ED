module com.example.proyecto_u2_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyecto_u2_3 to javafx.fxml;
    exports com.example.proyecto_u2_3;
}