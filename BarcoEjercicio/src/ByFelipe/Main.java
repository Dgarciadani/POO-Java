package ByFelipe;

public class Main {
    public static void main(String[] args) {
        Barco barco = new Barco();
        Carga carga1 = CargaFactory.getInstance().crearCarga("Simple");
        Carga carga2 = CargaFactory.getInstance().crearCarga("Simple");

        carga1.setNombre("TV");
        carga1.setDescripcion("aaaa");
        ((Simple)carga1).setPesoCarga(3.0);
        ((Simple)carga1).setRefrigeracion(false);

        carga2.setNombre("CajaMedicamentos");
        carga2.setDescripcion("bbb");
        ((Simple)carga2).setPesoCarga(2.0);
        ((Simple)carga2).setRefrigeracion(true);

        Carga conte1 = CargaFactory.getInstance().crearCarga("Contenedor");
        conte1.setNombre("ConteMas");
        conte1.setDescripcion("bal baal als");
        ((Contenedor)conte1).setPesoContenedor(100.00);
        ((Contenedor)conte1).agregarCargas(carga1);
        ((Contenedor)conte1).agregarCargas(carga2);


        barco.agregarCargas(conte1);

    }
}
