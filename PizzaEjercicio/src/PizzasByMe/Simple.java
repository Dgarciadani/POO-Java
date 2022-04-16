package PizzasByMe;

public class Simple extends Pizza {
    private double precioBase;
    private boolean esGrande;

    @Override
    public double calcularPrecio() {
        if(esGrande){
            return precioBase*2;
        }
        return precioBase;
    }
}
