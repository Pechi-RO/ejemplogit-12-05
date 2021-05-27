package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //se crea el array
        ArrayList<Futbolista> lista = new ArrayList<Futbolista>();

        //visualizar los elementos d ela lista
        System.out.println("Numero de elementos de la lista = " + lista.size());


        //creamos varios futbolistas
        Futbolista f1 = new Futbolista("Ronaldo", 50);
        Futbolista f2 = new Futbolista("Messi", 35);
        Futbolista f3 = new Futbolista("Xavi", 40);
        Futbolista f4 = new Futbolista("Suarez", 30);
        Futbolista f5 = new Futbolista("raul", 20);

        //Añadir elementos a la lista
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        lista.add(f5);


        //Recorrer los elementos de la lista, obtenerlos e imprimirlos
        Futbolista futbolero = null;
        for (int i = 0; i < lista.size(); i++) {
            //obtener el elemento (i) de la ArrayList
            futbolero = lista.get(i);
            System.out.println("Datos del jugador" + futbolero.toString());
        }

        //Quitar elementos de la lista con remove
        lista.remove(0); //Asi se elimina el primer elemento de la lista si existe, adios a Ronaldo, el f1

        //eliminar una posicion dada por teclado
        int pos = 0;
        do {
            System.out.println("Primer elemento de la lista = 0 y el ultimo: " + (lista.size() - 1));
            pos = teclado.leer_entero("Introduce el nº de elemento a eliminar");


        } while (pos < 0 && pos >= lista.size());

        //este seria el elemento a eliminar, y pos es el valor introducido por teclado
        lista.remove(pos);


        System.out.println("Los elementos de la lista una vez borrado el elemento dado:");

        for (int i = 0; i < lista.size(); i++) {
            //obtener el elemento (i) de la ArrayList
            futbolero = lista.get(i);
            System.out.println("Datos del jugador" + futbolero.toString());
        }



        //Calcular con metodo que jugador ha marcado mas goles,caera en el examen,ejercicio de maximos y minimos

        //Set caerá en el examen

        //incrementar en 2 los goles del segundo jugador,
        //esto solo modifica el objeto,para cambiar la lista, mas adelante
        futbolero.setGoles(f3.getGoles() + 2);


         //esto hace que el elemento 1 de la lista se cambie para que sea igual a f3,
        lista.set(1, f3);


        //tambien se puede hacer asi
        //futbolero = lista.get(1);
        //futbolero.setGoles(futbolero.getGoles() +2);

        //Ordenar con el comparador
        Collections.sort (lista, new Comparador_Futbolista() );

        //lo mostramos otra vez por pantalla
        System.out.println("Lista de los jugadores ordenados por nombre:");

        for (int i = 0; i < lista.size(); i++) {
            //obtener el elemento (i) de la ArrayList
            futbolero = lista.get(i);
            System.out.println("Datos del jugador" + futbolero.toString());
        }

        }
    }
