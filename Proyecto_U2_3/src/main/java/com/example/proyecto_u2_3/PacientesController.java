package com.example.proyecto_u2_3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class PacientesController {
    @FXML TableView tablaPacientes;
    @FXML TextField txtNombre;
    @FXML TextField txtApellido;
    @FXML TextField txtMotivo;
    @FXML Button btnIngresar;
    @FXML Button btnAtender;
    @FXML Button btnEliminar;

    ObservableList<Pacientes> filas= FXCollections.observableArrayList();
    Queue<Pacientes> colaPacientes=new LinkedList<>();
    TableColumn colNombre=new TableColumn("Nombre");
    TableColumn colApellido=new TableColumn("Apellido");
    TableColumn colMotivo=new TableColumn("Motivo");

    @FXML protected void initialize() throws IOException {
        if(InicioRec.contraseña.equals(InicioRecController.contraseña)){
            btnIngresar.setDisable(false);
            btnAtender.setDisable(true);
            btnEliminar.setDisable(false);
        }else{
            btnIngresar.setDisable(true);
            btnAtender.setDisable(false);
            btnEliminar.setDisable(true);
        }
        colNombre.setMinWidth(170);
        colApellido.setMinWidth(170);
        colMotivo.setMinWidth(170);
        colNombre.setCellValueFactory(new PropertyValueFactory<Pacientes, String>("Nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<Pacientes, String>("Apellido"));
        colMotivo.setCellValueFactory(new PropertyValueFactory<Pacientes, String>("Motivo"));

        tablaPacientes.setItems(filas);
        tablaPacientes.getColumns().addAll(colNombre,colApellido,colMotivo);

    }//INICIO
    public void insertarPaciente(ActionEvent event)throws IOException{
        if(!txtNombre.getText().equals("") && !txtApellido.getText().equals("") && !txtMotivo.getText().equals("")){
            Pacientes nuevoPaciente=new Pacientes(txtNombre.getText(),txtApellido.getText(),txtMotivo.getText());
            filas.add(nuevoPaciente);
            colaPacientes.add(nuevoPaciente);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No se ha insertado ningún paciente");
            alert.show();
        }//ELSE
    }//INSERTAR
    public void atenderPaciente()throws IOException{
        Pacientes enConsulta= colaPacientes.poll();
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("En consulta el paciente: "+ enConsulta.getNombre()+" "+enConsulta.getApellido());
        alert.show();
        filas.remove(0);
    }//ATENDER
    public void eliminarPaciente()throws IOException{
        if(!filas.isEmpty()) {
            Pacientes cancelar = colaPacientes.poll();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Se eliminó la cita del paciente: " + cancelar.getNombre() + " " + cancelar.getApellido());
            alert.show();
            filas.remove(0);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No hay ninguna cita para cancelar");
            alert.show();
        }
    }//ELIMINAR
    public void salir() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        HelloApplication.stage.setTitle("Bienvenido");
        HelloApplication.stage.setScene(scene);
    }
}//CLASE
