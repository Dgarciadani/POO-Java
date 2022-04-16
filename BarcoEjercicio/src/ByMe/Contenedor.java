package ByMe;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga{
    private double pesoContenedor;
    private List<Carga> cargas = new ArrayList<>();


    public void agregarCarga(Carga ca){
        cargas.add(ca);
    }
    @Override
    public double calcularPeso() {
        double pesoTotal = 0.0;
        for (Carga carga : cargas) {
          pesoTotal +=  carga.calcularPeso();
        }
        return pesoTotal + pesoContenedor;
    }

    public double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }
}
