package com.company;

public class Visita_Alcazaba extends Visita{

    private static int total_visitas_Alcazaba;


    public Visita_Alcazaba(String descripcion, int num_adultos, int num_niños,
                           boolean guiada) {
        super(descripcion, num_adultos, num_niños, guiada);
        total_visitas_Alcazaba ++;
    }

    public int get_Total_visitas_Alcazaba() {
        return total_visitas_Alcazaba;
    }

    public void set_Total_visitas_Alcazaba(int total_visitas_Alcazaba) {
        this.total_visitas_Alcazaba = total_visitas_Alcazaba;
    }

    @Override
    public double precio() {
        double total=0;
        if (get_guiada()==true){
            total=(get_num_adultos()*10) + (get_num_niños()*5) + 30;
        }
        else
            total=(get_num_adultos()*10) + (get_num_niños()*5);
        return total;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
