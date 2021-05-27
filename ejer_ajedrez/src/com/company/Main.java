package com.company;

public class Main {

    public static void mostrar(Juego v[]){



    }
    public static void mostrar_puntuacion(Juego arrayjuegos[]){
        return arrayjuegos[];
        for (int i; i <=arrayjuegos[].length;i ++);
        System.out.println(arrayjuegos[i]);
    }
    public static void shell_asc(Juego v[]){

    }
    public static void media_ajedrez(Juego[] v){

    }
    public static void mostrar_puntos_damas (Juego v[]){

    }

    public static void main(String[] args) {

        //Iniciamos vector de la clase Jugador y reservamos 4 posiciones

        Jugador NombreJug [] = new Jugador[4];

        //Creamos el vector de objetos de la clase Juego y reservamos 8 posiciones
        Juego arrayjuegos [] = new Juego[8];

        //Rellenamos datos en cada posición
        //Comenzamos con los objetos de la clase jugador

        NombreJug[0]= new Jugador("Pablo","Perez ",754247);
        NombreJug[1]= new Jugador("Maria","Soria",435623);
        NombreJug [2]= new Jugador("Estefania","Morales",9823137);
        NombreJug [3]= new Jugador("Jesus","Martinez",493279);

        //Creamos los objetos de la clase Damas y Ajedrez (4 de cada) e incluimos los 4 jugadores
        //anteriores

        arrayjuegos[0] = new Damas("Damas",NombreJug[0],54,5);
        arrayjuegos[1]= new Damas ("Damas",NombreJug[3],78,12 );
        arrayjuegos[2] = new Ajedrez("Ajedrez",NombreJug[2],40,56 );
        arrayjuegos[3] = new Damas ("Damas", NombreJug[1],72,24 );
        arrayjuegos[4]= new Damas ("Damas", NombreJug[3],38,9 );
        arrayjuegos[5] = new Ajedrez("Ajedrez", NombreJug[0],61,27 );
        arrayjuegos[6] = new Ajedrez("Ajedrez",NombreJug[3],89,65 );
        arrayjuegos[7] = new Ajedrez("Ajedrez", NombreJug[2],51,64 );

    }
}

