package com.example.proyecto_u2_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    @FXML TextField txtUsuarioDoc;
    @FXML PasswordField passDoc;

    public void registrarCuenta(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("RegistroDoc.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        HelloApplication.stage.setTitle("Registro");
        HelloApplication.stage.setScene(scene);
    }
    public void registrarRecepcionista(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("Recepcionista.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        HelloApplication.stage.setTitle("Registro de recepción");
        HelloApplication.stage.setScene(scene);
    }
    public void ingresarRecepcionista(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("InicioRec.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        HelloApplication.stage.setTitle("Inicio de sesión de recepción");
        HelloApplication.stage.setScene(scene);
    }


    public void ingresar(ActionEvent event) throws IOException {
        String usuario=txtUsuarioDoc.getText();
        String contraseña=passDoc.getText();
        String contraseñaRequerida=RegistroDoc.encriptar("mentalista1".toCharArray(),0);
        System.out.println(contraseñaRequerida);
        String contraseñaIngresada=RegistroDoc.encriptar(contraseña.toCharArray(),0);
        System.out.println(contraseñaIngresada);
        InicioRec.contraseña="NO";

        if(contraseñaRequerida.equals(contraseñaIngresada) && usuario.equals("Doctor")){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("Pacientes.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            HelloApplication.stage.setTitle("Próximas citas");
            HelloApplication.stage.setScene(scene);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Contraseña y/o usuario incorrectos");
            alert.show();
        }

    }//Botón de sesión

}