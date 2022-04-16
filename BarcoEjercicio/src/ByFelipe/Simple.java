package ByFelipe;

public class Simple extends Carga {
    private double pesoCarga;
    private boolean refrigeracion;


    @Override
    public double calcularPeso() {
       if (refrigeracion){
           return pesoCarga*1.1;
       }
       return pesoCarga;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    @Override
    public String toString() {
        return "nombre: "+ getNombre() + " / " + getPesoCarga();
    }
}
