package com.company;
//Ejercicio 2
public class Recolector_Aceituna extends Trabajador_Agricola {
    private boolean eventual;
    private double kilos_recogidos;
    private double preciokilo;
    private static double total_recAceituna = 0;
    //constructor

    public Recolector_Aceituna(String nom, int dni2, double sueldo, boolean eventual,
                               double kilos_recogidos, double preciokilo) {
        super(nom, dni2, sueldo);
        this.eventual = eventual;
        this.kilos_recogidos = kilos_recogidos;
        this.preciokilo = preciokilo;
        total_recAceituna ++;
    }

    public double getNum_recolectores_aceituna(){
        return total_recAceituna;
    }
    //Este override es el mismo que el de recolector pero siempre cobrando 150 más
    @Override
    public double salario(){
        double salario_final;
        if (eventual = true) {
            salario_final = (super.salario() + (kilos_recogidos * preciokilo))+150;
        } else
            salario_final = (super.salario() + (kilos_recogidos * preciokilo) + 100)+150;

        return salario_final;
    }




}
