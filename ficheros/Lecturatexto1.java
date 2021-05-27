package com.company;
import java.io.*;
public class Lecturatexto1 {

    public static void main (String[] args){
        FileReader entrada=null;

        StringBuffer str =new StringBuffer();

        try {
            entrada = new FileReader("Lecturatexto1.java");
        int c;

        while ((c=entrada.read()) !=-1)
            str.append((char)c);

        System.out.println(str);
        System.out.println("-----------------------------------------");


        }catch (FileNotFoundException ex){
        System.out.println("\n Error, el fichero no existe!!!");

        }catch (IOException ex) {
            System.out.println("\n Error de E/S. "+ex);
        }finally {
            if(entrada!=null) {
                try{
                    entrada.close();
                }catch (IOException ex) {
                System.out.println("el bloque finally siempre se ejecuta");
                }

                }

            }

        }


    }

