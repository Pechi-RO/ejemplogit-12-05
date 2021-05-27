package com.company;

import java.util.Comparator;

public class Comparador_Futbolista implements Comparator<Futbolista> {

    //vamos a ordenar segun nombre ascendente
    //si el nombre de f1 > f2 => devuelve > 0
    //si el nombre de f1 < f2 => devuelve < 0
    //si son iguales devuelve == 0
    public int compare (Futbolista f1, Futbolista f2) {
        return ( f1.getNombre().compareTo(f2.getNombre()) );

    }

}
