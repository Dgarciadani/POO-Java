package ByMe;

public class Main {
    public static void main(String[] args) {
        Carga carga1 = CargaFactory.getInstance().crearCarga("Simple");
        carga1.setNombre("TV");
        carga1.setDescripcion("TV");
        ((Simple)carga1).setPesoCarga(3);
        ((Simple)carga1).setRefrigerada(false);
        //System.out.println(carga1.calcularPeso());


        Carga carga2 = CargaFactory.getInstance().crearCarga("Simple");
        carga2.setNombre("Medicamentos");
        carga2.setDescripcion("medi");
        ((Simple)carga2).setPesoCarga(2);
        ((Simple)carga2).setRefrigerada(true);
        //System.out.println(carga2.calcularPeso());

        Carga conte1 = CargaFactory.getInstance().crearCarga("Contenedor");
        conte1.setNombre("Contenedor");
        conte1.setDescripcion("Contenedor");
        ((Contenedor)conte1).setPesoContenedor(100);


        ((Contenedor)conte1).agregarCarga(carga1);
        ((Contenedor)conte1).agregarCarga(carga2);
        //System.out.println(conte1.calcularPeso());

        Barco barco = new Barco();
        barco.agregarCarga(carga1);
        barco.agregarCarga(carga2);
        barco.agregarCarga(conte1);
        System.out.println("Cargas Asignadas");
        barco.mostrarCarga();


    }
}
