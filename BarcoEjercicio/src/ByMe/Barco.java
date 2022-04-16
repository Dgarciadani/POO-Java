package ByMe;

import java.util.ArrayList;
import java.util.List;

public class Barco {
    private List <Carga> cargas = new ArrayList<>();


    public void mostrarCarga(){
        for (Carga carga : cargas) {
            System.out.println(carga.toString());
        }

    }
    public void agregarCarga(Carga ca){
        cargas.add(ca);
    }
}
