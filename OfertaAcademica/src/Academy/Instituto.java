package Academy;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OferaAcademica> ofertasDisponibles;


    public Instituto(String nombre) {
        this.nombre = nombre;
        ofertasDisponibles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<OferaAcademica> getOfertasDisponibles() {
        return ofertasDisponibles;
    }

    public void setOfertasDisponibles(List<OferaAcademica> ofertasDisponibles) {
        this.ofertasDisponibles = ofertasDisponibles;

    }
    public void agregarOfertaAcademica(OferaAcademica oa){
        ofertasDisponibles.add(oa);
    }

    public void generarInforme(){
        for (OferaAcademica ofertasDisponible : ofertasDisponibles) {
            System.out.println(ofertasDisponible.toString());
        }
    }
}
