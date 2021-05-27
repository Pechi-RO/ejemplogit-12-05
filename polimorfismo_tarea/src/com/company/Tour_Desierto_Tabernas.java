package com.company;

public class Tour_Desierto_Tabernas extends Visita{
    private boolean todoTerreno_4X4;
    private static int total_numero_tours;

    public Tour_Desierto_Tabernas(String descripcion, int num_adultos, int num_niños,
                                  boolean guiada,boolean todoTerreno_4X4) {
        super(descripcion, num_adultos, num_niños, guiada);
        this.todoTerreno_4X4=todoTerreno_4X4;
        total_numero_tours ++;
    }

    public boolean get_TodoTerreno_4X4() {
        return todoTerreno_4X4;
    }

    public void set_TodoTerreno_4X4(boolean todoTerreno_4X4) {
        this.todoTerreno_4X4 = todoTerreno_4X4;
    }

    public static int get_Total_numero_tours() {
        return total_numero_tours;
    }

    public static void set_Total_numero_tours(int total_numero_tours) {
        Tour_Desierto_Tabernas.total_numero_tours = total_numero_tours;
    }

    @Override
    public double precio() {
        double total=0;
        if (get_guiada()==true){
            total= (get_num_adultos()+get_num_niños())*30 +(5*(get_num_adultos()+get_num_niños()));
        }
        if (get_TodoTerreno_4X4()==true){
            total=(get_num_adultos()+get_num_niños())*30 +50;
        }
        else
            total= (get_num_adultos()+get_num_niños())*30;

        return total;
    }

    @Override
    public String toString(){
        return (super.toString()+"Todo Terreno 4X4: "+todoTerreno_4X4);
    }
}
