package ByFelipe;

import java.util.ArrayList;
import java.util.List;

public class Barco {
    private double pesoBarco;
    private List<Carga> cargas = new ArrayList<>();


    public void agregarCargas(Carga carga){
        cargas.add(carga);
    }

}
