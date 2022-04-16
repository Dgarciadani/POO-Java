import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private List<Propiedad> propiedades;
    public Municipio(){
        propiedades = new ArrayList<>();

    }
    public void agregarPropiedad(Propiedad propiedad){
        propiedades.add(PropiedadFactory.getInstance().crearPropiedad(propiedad));
    }
}
