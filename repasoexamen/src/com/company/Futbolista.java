package com.company;

public class Futbolista {
    //lo primero se hacen las vaariables y los getter setter constructor y to string
    private String nombre;
    private int goles;

    public Futbolista(String nombre, int goles) {
        this.nombre = nombre;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "nombre='" + nombre + '\'' +
                ", goles=" + goles +
                '}';
    }
}
