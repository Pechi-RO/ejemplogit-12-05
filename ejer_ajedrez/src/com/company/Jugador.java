package com.company;

public class Jugador {
    private String nombre, apellidos;
    private long DNI;

    public Jugador(String nombre, String apellidos,long DNI){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.DNI=DNI;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI=" + DNI +
                '}';
    }
}
