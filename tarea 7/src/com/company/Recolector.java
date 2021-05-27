package com.company;

import javax.swing.*;
//ejercicio 1
public class Recolector extends Trabajador_Agricola {
    private boolean eventual;
    private double kilos_recogidos;
    private double preciokilo;
    private static double total_recolectores = 0;

    //Arriba estan creados los parametros y debajo de esta linea esta el constructor y el total de recolectores.
    public Recolector(String nom, int dni2, double sueldo, boolean eventual,
                      double kilos_recogidos, double preciokilo) {
        super(nom, dni2, sueldo);
        this.eventual = eventual;
        this.kilos_recogidos = kilos_recogidos;
        this.preciokilo = preciokilo;
        total_recolectores++;
    }

    //creacion get_Numrecolectores
    public static double get_Numrecolectores() {
        return total_recolectores;
    }

    //Reescribir el salario heredado

    @Override
    public double salario() {
        double salario_final;
        if (eventual = true) {
            salario_final = super.salario() + (kilos_recogidos * preciokilo);
        } else
            salario_final = super.salario() + (kilos_recogidos * preciokilo) + 100;

        return salario_final;
    }
    //redefinicion del toString
    @Override
    public String toString() {
       return (super.toString() + " Trabajador eventual: "+eventual+
                " Kilos recogidos: "+ kilos_recogidos + " Precio por kilo: "+ preciokilo);
    }

}