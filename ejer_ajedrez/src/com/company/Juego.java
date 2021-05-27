package com.company;

public abstract class Juego {
    String descripcion;
    Jugador jugon;

    public Juego (String descripcion, Jugador jugon){
        this.descripcion=descripcion;
        this.jugon=jugon;

    }

    @Override
    public String toString() {
        return "Juego{" +
                "descripcion='" + descripcion + '\'' +
                ", jugon=" + jugon +
                '}';
    }

    public abstract double puntuacion();

}
