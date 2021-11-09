package com.example.proyecto_u2_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RegistroDocController {
    @FXML TextField txtNombre;
    @FXML TextField txtApellido;
    @FXML TextField txtNumero;
    @FXML TextField txtUsuario;
    @FXML TextField txtContraseña;
    @FXML TextField txtContraseñaConfirmada;

    public void registrarCuenta(ActionEvent event) throws IOException {

        if (txtContraseña.getText().equals("mentalista1") && txtContraseña.getText().equals(txtContraseñaConfirmada.getText()) && txtUsuario.getText().equals("Doctor")){
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Todo correcto, bienvenido al equipo, doctor/a "+txtNombre.getText());
            alert.show();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            HelloApplication.stage.setTitle("Bienvenido");
            HelloApplication.stage.setScene(scene);

        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Las contraseñas no coinciden o el usuario y contraseña no son los requeridos");
            alert.show();
        }//ELSE
    }//REGISTRAR
    public void recepcionista(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("InicioRec.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        HelloApplication.stage.setTitle("Inicio de sesión de recepción");
        HelloApplication.stage.setScene(scene);
    }//RECEPCIÓN
    public void psicologia(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        HelloApplication.stage.setTitle("Bienvenido");
        HelloApplication.stage.setScene(scene);
    }//FUNCIÓN PSICOLOGÍA
}//CLASE
