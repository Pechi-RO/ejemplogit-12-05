package com.company;

public class Damas extends Juego{
    int puntos_equipo, puntos_ind;

    public Damas(String descripcion, Jugador jugon, int puntos_equipo, int puntos_ind) {
        super(descripcion, jugon);
        this.puntos_equipo=puntos_equipo;
        this.puntos_ind=puntos_ind;
    }

    public int getPuntos_equipo() {
        return puntos_equipo;
    }

    public void setPuntos_equipo(int puntos_equipo) {
        this.puntos_equipo = puntos_equipo;
    }

    public int getPuntos_ind() {
        return puntos_ind;
    }

    public void setPuntos_ind(int puntos_ind) {
        this.puntos_ind = puntos_ind;
    }

    public double puntuacion() {
        double puntos;
        puntos=(puntos_equipo*0.4)+(puntos_ind*0.6);
        return puntos;
    }

    @Override
    public String toString() {
        return "Damas{" +
                "puntos_equipo=" + puntos_equipo +
                ", puntos_ind=" + puntos_ind +
                ", descripcion='" + descripcion + '\'' +
                ", jugon=" + jugon +
                '}';
    }
}
