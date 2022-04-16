package ByMe;

public class Simple extends Carga{
    private double pesoCarga;
    private boolean refrigerada;


    @Override
    public double calcularPeso() {
        if (refrigerada){
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

    public boolean isRefrigerada() {
        return refrigerada;
    }

    public void setRefrigerada(boolean refrigerada) {
        this.refrigerada = refrigerada;
    }
}
