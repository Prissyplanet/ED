package com.example.proyectotda;

import Automovil.Caracteristicas;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
@FXML TextField modelo;
@FXML TextField color;
@FXML TextField cilindros;
@FXML TextField txtnumero;
@FXML Label lblmodelo;
@FXML Label lblcolr;
@FXML Label lblcilindros;

    Caracteristicas arreglo[];
    int cont=0;

@FXML protected void initialize(){
    arreglo=new Caracteristicas[4];
}

@FXML private void eventoIngresar(){
    String m = modelo.getText();
    String c = color.getText();
    String clndrs = cilindros.getText();

    if(m.equals("")||c.equals("")||clndrs.equals("")){
        Alert alerta=new Alert(Alert.AlertType.ERROR);
        alerta.setContentText("Favor de llenar los campos");
        alerta.show();
    }else{
        int cil = Integer.parseInt(clndrs);
        Caracteristicas car=new Caracteristicas(c,m,cil);
        arreglo[cont]=car; cont++;

        modelo.setText("");
        color.setText("");
        cilindros.setText("");


    }



}

@FXML private void eventoSacar(){

    int x=Integer.parseInt(txtnumero.getText());
    Caracteristicas sacar= arreglo[x];
    lblmodelo.setText(sacar.getModelo());
    lblcolr.setText(sacar.getColor());
    String c=Integer.toString(sacar.getCilindros());
    lblcilindros.setText(c);


}

}