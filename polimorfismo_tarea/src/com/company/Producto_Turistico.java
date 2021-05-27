package com.company;

public class Producto_Turistico implements Estadisticas{
        private String descripcion;
        private int num_adultos;
        private int num_niños;

        private static int total_productos_turisticos=0;

        public Producto_Turistico(String descripcion, int num_adultos, int num_niños){
            this.descripcion = descripcion;
            this.num_adultos = num_adultos;
            this.num_niños = num_niños;

            total_productos_turisticos ++;

            }

    public String get_descripcion() {
        return descripcion;
    }

    public void set_descripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int get_num_adultos() {
        return num_adultos;
    }

    public void set_descripcion(int num_adultos) {
        this.num_adultos = num_adultos;
    }


    public int get_num_niños() {
        return num_niños;
    }

    public void set_num_niños(int num_niños) {
        this.num_niños = num_niños;
    }

    public static int get_Total_productos_turisticos() {
        return total_productos_turisticos;
    }

    public static void set_Total_productos_turisticos(int total_productos_turisticos) {
        Producto_Turistico.total_productos_turisticos = total_productos_turisticos;
    }

    @Override
    public double precio() {
        return 0;
    }

    @Override
    public String toString(){
            return ("Descripcion: "+descripcion+"Numero de adultos: "+num_adultos+
                    "Numero de niños: "+num_niños);

    }



}
