public class Casa extends Propiedad {
    private double montoBase;

    public Casa(String calle, Integer numero, double montoBase) {
        super(calle, numero);
        this.montoBase = montoBase;
    }
    @Override
    public double calcularImpuestos() {
        return 0;
    }
}
