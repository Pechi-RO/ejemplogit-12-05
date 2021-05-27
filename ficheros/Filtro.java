package com.company;

import java.io.*;

public class Filtro implements FilenameFilter {
    String extension;

    Filtro (String extension){
        this.extension=extension;
    }
    @Override
    public boolean accept (File dir, String name){
        return name.endsWith(extension);
    }

    public static void main(String[] args) {

        File fichero = new File ("Filtro.java");

        if(fichero.exists()) {
            System.out.println("Nombre del archivo " + fichero.getName());
            System.out.println("Camino             " + fichero.getPath());
            System.out.println("Camino absoluto    " + fichero.getAbsolutePath());
            System.out.println("Se puede escribir  " + fichero.canWrite());
            System.out.println("Se puede leer      " + fichero.canRead());
            System.out.println("Tamaño             " + fichero.length());

            System.out.println("***** Lista de los archivos de este directorio *****");
            fichero = new File(".");

            String[] listaArchivos = fichero.list();

            for (int i = 0; i < listaArchivos.length; i++)
                System.out.println(listaArchivos[i]);

            System.out.println("***** Lista archivos con filtro *****");
            listaArchivos = fichero.list(new Filtro(".java"));

            for (int i = 0; i < listaArchivos.length; i++)
                System.out.println(listaArchivos[i]);

        }
        try     {
            System.in.read();
        }catch (Exception e) {   }

        }


    }



