package com.example.proyecto_u2_3;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Pacientes {
    private SimpleStringProperty nombre;
    private SimpleStringProperty apellido;
    private SimpleStringProperty motivo;

    public Pacientes(String nombre, String apellido, String motivo){
        this.nombre=new SimpleStringProperty(nombre);
        this.apellido=new SimpleStringProperty(apellido);
        this.motivo=new SimpleStringProperty(motivo);
    }

    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellido() {
        return apellido.get();
    }

    public SimpleStringProperty apellidoProperty() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido.set(apellido);
    }

    public String getMotivo() {
        return motivo.get();
    }

    public SimpleStringProperty motivoProperty() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo.set(motivo);
    }

}
