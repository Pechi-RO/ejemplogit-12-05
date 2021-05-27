package com.company;
import java.io.File;
import java.text.SimpleDateFormat;

public class clasefile {

    public static void main(String[] args) {
        File fichero = new File("claseFile.java");

        File directorio = new File(".");

        if (fichero.exists()) {
            System.out.println("el fichero " + fichero.getName() + " existe ");

            if (fichero.canWrite())
                 System.out.println("El fichero " + fichero.getName() + " puede escribirse");

            else
                System.out.println("El fichero ocupa " + fichero.getName() + " no puede escribirse ");



            System.out.println("La ruta absoluta del fichero es: "+fichero.getAbsolutePath());
            System.out.println("El fichero ocupa "+fichero.length()+" bytes");

            SimpleDateFormat modificado = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Ultima modificacion: "+modificado.format(fichero.lastModified()));
        }
        else
            System.out.println("El fichero "+fichero.getName()+" no existe");

        if (directorio.exists()){
            String Listado[]= directorio.list();
            System.out.println("El directorio actual está formado por: ");
            for (String elemento: Listado)
                System.out.println(elemento);
        }

        File carpeta = new File ("borrame");
        if (!carpeta.exists())
            if (carpeta.mkdir())
                System.out.println("Directorio borrame creado");
            else
                System.out.println("Directorio borrame no creado, no hay permisos suficientes");

        else
            System.out.println("Directorio borrame no creado, ya existe");

    }
}
