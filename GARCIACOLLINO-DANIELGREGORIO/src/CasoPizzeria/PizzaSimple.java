package CasoPizzeria;

public class PizzaSimple extends Pizza {
    private double precioBase;
    private boolean esGrande;

    @Override
    public double calcularPrecio() {
        if (esGrande) {
            return precioBase * 2;
        }
        return precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isEsGrande() {
        return esGrande;
    }

    public void setEsGrande(boolean esGrande) {
        this.esGrande = esGrande;
    }


}
