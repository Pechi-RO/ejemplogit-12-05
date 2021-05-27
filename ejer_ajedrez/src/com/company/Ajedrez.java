package com.company;

public class Ajedrez extends Juego{
    int elo_t, elo_a;



    public Ajedrez(String descripcion, Jugador jugon, int elo_a,int elo_t) {
        super(descripcion, jugon);
        this.elo_a=elo_a;
        this.elo_t=elo_t;
    }

    public int getElo_t() {
        return elo_t;
    }

    public void setElo_t(int elo_t) {
        this.elo_t = elo_t;
    }

    public int getElo_a() {
        return elo_a;
    }

    public void setElo_a(int elo_a) {
        this.elo_a = elo_a;
    }

    public double puntuacion() {
        int puntos;
        puntos=elo_t;
        return puntos ;
    }

    @Override
    public String toString() {
        return "Ajedrez{" +
                "elo_t=" + elo_t +
                ", elo_a=" + elo_a +
                ", descripcion='" + descripcion + '\'' +
                ", jugon=" + jugon +
                '}';
    }
}
