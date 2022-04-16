package Clase;

public class Impresora {
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private int hojasDisponibles;

    public  Impresora (String modelo, String tipoConexion, String fechaFabricacion){
        this.modelo=modelo;
        this.tipoConexion=tipoConexion;
        this.fechaFabricacion=fechaFabricacion;
        hojasDisponibles=0;
    }
    public  Impresora (String modelo, String tipoConexion){
        this.modelo=modelo;
        this.tipoConexion=tipoConexion;
        fechaFabricacion="Desconocido";
        hojasDisponibles=0;
    }
    private boolean tienePapel(){
        return hojasDisponibles>0;
    }
    public void imprimir(String texto){
        if (tienePapel()){
            System.out.println("La impresora "+modelo+" esta imprimiendo: "+ texto);
            hojasDisponibles--;
        }else{
            System.out.println("No hay papel, Cargue papel y vuelva a intentarlo");
        }
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles += hojasDisponibles;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }
}
