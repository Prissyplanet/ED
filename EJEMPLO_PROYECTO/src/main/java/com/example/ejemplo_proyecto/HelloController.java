package com.example.ejemplo_proyecto;

import Datos.Encriptar;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtPass;

    public void iniciarSesion(ActionEvent event) throws IOException {
        String usuario=txtUsuario.getText();
        String contraseña=txtPass.getText();
        Encriptar encriptar=new Encriptar();
        String bd=encriptar.encriptar("elBicho123".toCharArray(),0);
        System.out.println(bd);
        String pu=encriptar.encriptar(contraseña.toCharArray(),0);
        System.out.println(pu);

        if(bd.equals(pu) && usuario.equals("admin")){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("Pedidos.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 500);
            HelloApplication.stage.setTitle("Panadería");
            HelloApplication.usuario=usuario;
            HelloApplication.stage.setScene(scene);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("WHO ARE YOU, MF?!");
            alert.show();
        }

    }//Botón de sesión


}