package com.example.recursivo;

import Algoritmos.Buscar;
import Algoritmos.Encriptar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class HelloController {
    @FXML TextField txtSearch, txtEncript;
    @FXML Label lblResult, lblResultEnc;
    public void buscar(ActionEvent event){
        Buscar buscar=new Buscar();
        String ca= txtSearch.getText().toLowerCase(Locale.ROOT);
        char c=ca.charAt(0);
        char[] arreglo="abcdefghijklmnñopqrstuvwxyz".toCharArray();
        int pos=buscar.busqueda(c,arreglo,0);
        if(pos==-1){
            lblResult.setText("Caracter no encontrado");
        }else{
            lblResult.setText("Encontrado en la posición: "+(pos+1));
        }
    }//boton
    public void encriptar(ActionEvent event){
        Encriptar encriptar=new Encriptar();
        char[] palabra=txtEncript.getText().toCharArray();
        String result=encriptar.encriptar(palabra,0);
        lblResultEnc.setText(result);
    }
}