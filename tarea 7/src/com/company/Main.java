package com.company;

public class Main {

    public static void main(String[] args) {

        Trabajador_Agricola ta1 = new Trabajador_Agricola ("Johhny Lawrence", 123321123, 4000);
        Recolector r1 = new Recolector("Daniel Larruso", 123321123, 3000,
                true,200, 0.80);
        Recolector r2 = new Recolector("Miguel Díaz",123321454,
                1500, false, 400, 1.1);
        Recolector_Aceituna ra1 = new Recolector_Aceituna("Ilai Moskovitz", 6547890,2300,
                true, 300, 1.2);
        Recolector_Aceituna ra2 = new Recolector_Aceituna("Dimitri", 123,
                2500,false, 250, 1.4);

        System.out.println(ta1.toString());
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(ra1.toString());
        System.out.println(ra2.toString());





    }
}
