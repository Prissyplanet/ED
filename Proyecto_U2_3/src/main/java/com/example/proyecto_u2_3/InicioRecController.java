package com.example.proyecto_u2_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;


public class InicioRecController {
    @FXML TextField txtUsuarioRec;
    @FXML PasswordField passRec;
    public static String contraseña;
    public void ingresar(ActionEvent event) throws IOException {
        String usuario=txtUsuarioRec.getText();
        contraseña=passRec.getText();
        String contraseñaRequerida=RegistroDoc.encriptar("celulares1".toCharArray(),0);
        System.out.println(contraseñaRequerida);
        String contraseñaIngresada=RegistroDoc.encriptar(contraseña.toCharArray(),0);
        System.out.println(contraseñaIngresada);
        InicioRec.contraseña=InicioRecController.contraseña;

        if(contraseñaRequerida.equals(contraseñaIngresada) && usuario.equals("Recepción")){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("Pacientes.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            HelloApplication.stage.setTitle("Próximas citas");
            HelloApplication.stage.setScene(scene);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Contraseña y/o usuario incorrectos");
            alert.show();
        }//else
    }//Ingresar
    public void psicologia(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        HelloApplication.stage.setTitle("Bienvenido");
        HelloApplication.stage.setScene(scene);
    }//PSICOLOGÍA
    public void registrarRecepcionista(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("Recepcionista.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        HelloApplication.stage.setTitle("Registro de recepción");
        HelloApplication.stage.setScene(scene);
    }
}//clase
