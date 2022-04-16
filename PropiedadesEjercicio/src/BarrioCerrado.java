import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad {
    private Integer factorMultiplicador;
    private List<Propiedad> propiedades;

    public BarrioCerrado(String calle, Integer numero) {
        super(calle, numero);
        this.factorMultiplicador = 2;
        propiedades = new ArrayList<>();
    }
    
    public void agregarPropiedad(Propiedad propiedad){
        propiedades.add(propiedad);}
    
    @Override
    public double calcularImpuestos() {
        double precioTotal = 0.0;
        //iter + tab me agrega solo un for y  me deja elegir la lista
        for (Propiedad propiedade : propiedades) {
            precioTotal += propiedade.calcularImpuestos();
            
        }
        return precioTotal * factorMultiplicador;
    }
}
