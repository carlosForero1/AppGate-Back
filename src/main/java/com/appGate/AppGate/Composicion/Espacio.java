package com.appGate.AppGate.Composicion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Espacio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private boolean verdadero ;

    private String apellido;



    public Espacio() {
    }

    public Espacio(int id, String nombre, boolean verdadero) {
        this.id = id;
        this.nombre = nombre;
        this.verdadero = verdadero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVerdadero() {
        return verdadero;
    }

    public void setVerdadero(boolean verdadero) {
        this.verdadero = verdadero;
    }

    @Override
    public String toString() {
        return "Espacio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", verdadero=" + verdadero +
                '}';
    }
}
