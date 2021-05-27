
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main<opcion> {

    ArrayList<Alumno> lista = new ArrayList<Alumno>();
    Alumno estudiante = null;
    /* E: lista_alumnos => ArrayList de los alumnos
       S: nada, muestra y gestiona las siguientes opciones del menú,
                que llamarán a los siguientes métodos especificados entre paréntesis(....)

        1.- Añadir alumno (anadir_alumno() )
        2.- Listado alumnos (listado_alumnos () )
        3.- Buscar alumno por DNI (buscar_alumno_teclado() )
        4.- Ordenar por nombre los alumnos ( Collections.sort() )
        5.- Eliminar un alumno por DNI (borrar_alumno () )
        6.- Poner una nueva falta (falta_alumno)
        7.- Guardar la lista de alumnos en el fichero de objetos: alumnos.dat (escribir_fichero() )
        8.- Leer el fichero de objetos: alumnos.dat, en el ArrayList de alumnos (leer_fichero () )
        0.- Salir (Sale del menú y termina el programa)

        Introduce opción:

     */
    Scanner sn = new Scanner(System.in);
    boolean salir = false;
    int opcion; //Guardaremos la opcion del usuario

    do {


    {

        System.out.println("1. Opcion 1,anadir alumno");
        System.out.println("2. Opcion 2, listado alumno,");
        System.out.println("3. Opcion 3, buscar alumno por DNI");
        System.out.println("4. ordenar por nombre los alumnos");
        System.out.println("5. buscar alumno por DNI");
        System.out.println("6. eliminar alumno por DNI");
        System.out.println("7. Guardar la lista de alumnos en el fichero de objetos: alumnos.dat");
        System.out.println("8. Leer el fichero de objetos: alumnos.dat, en el ArrayList de alumnos");
        System.out.println("0. Salir");
        try {

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("anadir alumno");
                    anadir_alumno();
                    break;
                case 2:
                    System.out.println("listado alumnos");

                    break;
                case 3:
                    System.out.println("buscar alumno por DNI");
                    break;
                case 4:
                    System.out.println("ordenar por nombre los alumnos");
                    salir = true;
                    break;
                case 5:
                    System.out.println("buscar alumno por DNI");
                    salir = true;
                    break;
                case 6:
                    System.out.println("eliminar alumno por DNI");
                    salir = true;
                    break;
                case 7:
                    System.out.println("Guardar la lista de alumnos en el fichero de objetos: alumnos.dat");
                    salir = true;
                    break;
                case 8:
                    System.out.println("Leer el fichero de objetos: alumnos.dat, en el ArrayList de alumnos");
                    salir = true;
                    break;

                default:
                    System.out.println("Solo números entre 0 y 8");
            }
            }while (opcion != 0) ;

        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
            sn.next();

    public static void menu(ArrayList< Alumno > lista) {
       // ............ Completa el código ..................

    } // fin menu

    /* E: lista_alumnos => arraylist de los alumnos
          DNI => DNI a buscar
       S: -1 => si no encuentra el alumno en la lista con ese DNI
          posición donde está el DNI de ese alumno en la lista
          Las posiciones varian desde 0 (1ª posición) hasta el último: lista_alumnos.size()-1
    * */
    public static int buscar_alumno(ArrayList<Alumno> lista_alumnos, int DNI) {
        int pos = -1;
        
        // ............ Completa el código ..................
        
        return pos;
    } // fin buscar_alumno

    /* E: lista_alumnos => ArrayList de los alumnos
       S: nada, pide por teclado todos los datos de un objeto Alumno
          si el DNI no existe en el ArrayList añade el objeto Alumno leido en el ArrayList
          sino muestra un mensaje de error indicando que no se puede añadir por estar duplicado
       nota: haz uso del método buscar_alumno() para saber si el DNI está o no en la lista
     */
    public static void anadir_alumno(ArrayList< Alumno > lista) {
      //anadir alumno
           String nom = teclado.leer_cadena2("introduce el nombre");
           int dni = teclado.leer_entero("Introduce el DNI");
           int edd = teclado.leer_entero("Introduce la edad");
           System.out.println("Introduce el sexo, true si es hombre, false si es femenino");
           Scanner sx = new Scanner(System.in);
           boolean sex = sx.nextBoolean();
           int falt = teclado.leer_entero("Introduce las faltas");
                lista.add ( new Alumno(nom, dni, edd, sex, falt) );

    } // fin anadir_alumno

    /* E: lista_alumnos => ArrayList de los alumnos
       S: nada, si está vacio el ArrayList muestra mensaje de que está vacío
          sino muestra por pantalla el contenido del ArrayList
     */
    public static void listado_alumnos(ArrayList<Alumno> lista) {

                for (int i = 0; i < lista.size(); i++) {
                    //obtener el elemento (i) de la ArrayList
                    estudiante = lista.get(i);
                    System.out.println("Datos del alumno" + estudiante.toString());
                }
    } // fin listado_alumnos

    /* E: lista_alumnos => ArrayList de los alumnos
       S: nada, introduce por teclado el DNI del alumno a buscar
          y muestra por pantalla si el alumno está o no en el ArrayList
       nota: haz uso del método buscar_alumno() para saber si el DNI está o no en la lista
             y además puedes obtener en que posición está para mostrar por pantalla su información
             en caso de encontrarlo.
     */
    public static void buscar_alumno_teclado(ArrayList<Alumno> lista_alumnos) {
        // ............ Completa el código ..................

    } // fin buscar_alumno

    /* E: lista_alumnos => ArrayList de los alumnos
       S: nada, introduce por teclado el DNI del alumno a buscar
          y en caso de que el DNI esté en el ArrayList lo borra
       nota: haz uso del método buscar_alumno() para saber si el DNI está o no en la lista
             y además puedes obtener en que posición está para poder borrarlo
     */
    public static void borrar_alumno(ArrayList<Alumno> lista_alumnos) {

        // ............ Completa el código ..................
        
    } // fin borrar_alumno

    /* E: lista_alumnos => ArrayList de los alumnos
       S: nada, introduce por teclado el DNI del alumno a introducir la falta
          y en caso de que el DNI esté en el ArrayList incrementa en uno la falta
       nota: haz uso del método buscar_alumno() para saber si el DNI está o no en la lista
             y además puedes obtener en que posición está para poder incrementar su falta
       pista: haz uso del método set() en el ArrayList para poder modificar
              el alumno que le has puesto una falta más
     */
    public static void falta_alumno(ArrayList<Alumno> lista_alumnos) {

        // ............ Completa el código ..................

    } // fin falta_alumno

    /* E: lista_alumnos => ArrayList de los alumnos
          nomb => nombre del fichero de objetos Alumno a grabar
       S: nada, guarda el contenido del ArrayList en el fichero de objetos nomb
     */
    public static void escribir_fichero(ArrayList<Alumno> lista_alumnos, String nomb) {

        // ............ Completa el código ..................
        
    } // fin escribir_fichero

    /* E: lista_alumnos => ArrayList de los alumnos
          nomb => nombre del fichero de objetos Alumno a leer
       S: nada, si el fichero nomb existe borra el ArrayList ( usa el método clear() )
          y lee el contenido del fichero de objetos de tipo Alumno y lo guarda en el
          ArrayList lista_alumnos
     */
    public static void leer_fichero(ArrayList<Alumno> lista_alumnos, String nomb) {

        /// ............ Completa el código ..................
    } // fin leer_fichero


    public static void main(String[] args) {

        // Crear con new un nuevo ArrayList de la clase Alumno
        ArrayList<Alumno> lista_alumnos = ........... ; // completa el código 

        // Llamar al menu con el ArrayList creado antes
        menu(.......); // completa el código
    }
}
