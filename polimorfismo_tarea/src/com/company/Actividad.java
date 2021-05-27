package com.company;

public abstract class  Actividad extends Producto_Turistico{

    private boolean principiantes;
    private static int total_actividades = 0;

    public Actividad(String descripcion, int num_adultos, int num_niños, boolean principiantes) {
        super(descripcion, num_adultos, num_niños);
        this.principiantes = principiantes;
        total_actividades ++;
    }

    public boolean get_principiantes(){
        return principiantes;
    }

    public void set_principiantes(boolean principiantes){
        this.principiantes = principiantes;
    }


    public static int get_Total_actividades() {
        return total_actividades;
    }

    public static void set_Total_actividades(int total_actividades) {
        Actividad.total_actividades = total_actividades;
    }

    abstract public double precio();

    @Override
    public String toString(){
        return (super.toString()+"Principiantes: "+principiantes);
    }


}
