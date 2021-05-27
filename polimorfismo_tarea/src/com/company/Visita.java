package com.company;

public abstract class Visita extends Producto_Turistico{

    private boolean guiada;
    private static int total_visitas= 0;

    public Visita(String descripcion, int num_adultos, int num_niños, boolean guiada) {
        super(descripcion, num_adultos, num_niños);
        this.guiada = guiada;
        total_visitas ++;
    }

    public boolean get_guiada(){
        return guiada;
    }

    public void set_guiada(boolean guiada){
        this.guiada = guiada;
    }

    public static int get_Total_visitas() {
        return total_visitas;
    }

    public static void set_Total_visitas(int total_visitas) {
        Visita.total_visitas = total_visitas;
    }

    abstract public double precio();

    @Override
    public String toString(){
        return (super.toString()+ "Visita guiada: "+guiada);
    }



}
