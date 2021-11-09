package com.example.ejemplo_proyecto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.LinkedList;
import java.util.Queue;

public class PedidosController {
    @FXML Label lblUsuario;
    @FXML TableView  tableView;
    @FXML TextField txtNombre;
    @FXML TextField txtProducto;
    @FXML TextField txtFecha;


    TableColumn colNombre=new TableColumn("Cliente");
    TableColumn colProductos=new TableColumn("Producto");
    TableColumn colFecha=new TableColumn("Fecha");
    Queue<Pedido> colaPedido=new LinkedList<>();
    ObservableList<Pedido> filas= FXCollections.observableArrayList( new Pedido("Arthur","Montura","No sé"));

    @FXML protected void initialize() {
        lblUsuario.setText(HelloApplication.usuario);
        colNombre.setMinWidth(200);
        colProductos.setMinWidth(400);
        colNombre.setCellValueFactory(new PropertyValueFactory<Pedido, String>("cliente"));
        colProductos.setCellValueFactory(new PropertyValueFactory<Pedido, String>("producto"));
        colFecha.setCellValueFactory(new PropertyValueFactory<Pedido, String>("fecha"));

        tableView.setItems(filas);
        tableView.getColumns().addAll(colNombre,colProductos,colFecha);

    }
    public void insertarPedido(ActionEvent event){
        if(!txtNombre.getText().equals("") && !txtProducto.getText().equals("") && !txtFecha.getText().equals("")){
            Pedido pedido=new Pedido(txtNombre.getText(),txtProducto.getText(),txtFecha.getText());
            filas.add(pedido);
            colaPedido.add(pedido);
        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Insertas algo, ¿o qué?");
            alert.show();
        }
    }//Función
    public void entregarPedido(){
        Pedido entregado= colaPedido.poll();
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Emtregado el pedido: \n cliente:"+
                entregado.getCliente()+"\n Productos: "+
                entregado.getProducto());
        alert.show();
        filas.remove(0);
    }//función
}
