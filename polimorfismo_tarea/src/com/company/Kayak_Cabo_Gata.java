package com.company;

public class Kayak_Cabo_Gata extends Actividad{
    private boolean snorkel;
    private static int total_kayaks;


    public Kayak_Cabo_Gata(String descripcion, int num_adultos, int num_niños,
                           boolean principiantes, boolean snorkel) {
        super(descripcion, num_adultos, num_niños, principiantes);
        this.snorkel=snorkel;
        total_kayaks ++;
    }

    public boolean get_Snorkel() {
        return snorkel;
    }

    public void set_Snorkel(boolean snorkel) {
        this.snorkel = snorkel;
    }

    public static int get_Total_kayaks() {
        return total_kayaks;
    }

    public static void set_Total_kayaks(int total_kayaks) {
        Kayak_Cabo_Gata.total_kayaks = total_kayaks;
    }

    //ahora hay que poner el precio y continuar
    @Override
    public double precio() {
        return 0;
    }
}
