package com.example.proyecto_u2_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RecepcionistaController {
    @FXML TextField txtNombre;
    @FXML TextField txtApellido;
    @FXML TextField txtUsuario;
    @FXML TextField txtContraseña;

    public void registrarRecepcion(ActionEvent event) throws IOException {

        if (txtUsuario.getText().equals("Recepción") && txtContraseña.getText().equals("celulares1")){
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Todo correcto, bienvenido/a al equipo, "+txtNombre.getText());
            alert.show();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("InicioRec.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            HelloApplication.stage.setTitle("Inicio de sesión de Recepción");
            HelloApplication.stage.setScene(scene);

        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("El usuario o la contraseña no son los requeridos");
            alert.show();
        }//ELSE
    }//FUNCIÓN REGISTRAR
    public void psicologia(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        HelloApplication.stage.setTitle("Bienvenido");
        HelloApplication.stage.setScene(scene);
    }//FUNCIÓN PSICOLOGÍA
    public void ingresarRecepcionista(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("InicioRec.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        HelloApplication.stage.setTitle("Inicio de sesión de recepción");
        HelloApplication.stage.setScene(scene);
    }
}//CLASE
