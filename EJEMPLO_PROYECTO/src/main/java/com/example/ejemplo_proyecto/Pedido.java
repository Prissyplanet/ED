package com.example.ejemplo_proyecto;

import javafx.beans.property.SimpleStringProperty;

public class Pedido {
    private SimpleStringProperty cliente;
    private SimpleStringProperty producto;
    private SimpleStringProperty fecha;

    public Pedido(String cliente, String producto, String fecha) {
        this.cliente = new SimpleStringProperty(cliente);
        this.producto = new SimpleStringProperty(producto);
        this.fecha = new SimpleStringProperty(fecha);
    }

    public String getCliente() {
        return cliente.get();
    }

    public SimpleStringProperty clienteProperty() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente.set(cliente);
    }

    public String getProducto() {
        return producto.get();
    }

    public SimpleStringProperty productoProperty() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto.set(producto);
    }

    public String getFecha() {
        return fecha.get();
    }

    public SimpleStringProperty fechaProperty() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha.set(fecha);
    }
}
