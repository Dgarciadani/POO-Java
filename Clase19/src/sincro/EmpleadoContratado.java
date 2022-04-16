package sincro;

public class EmpleadoContratado extends Empleado{
    private double importePorHora;
    private double retencionImpuesto;

    public double getImportePorHora() {
        return importePorHora;
    }

    public void setImportePorHora(double importePorHora) {
        this.importePorHora = importePorHora;
    }

    public double getRetencionImpuesto() {
        return retencionImpuesto;
    }

    public void setRetencionImpuesto(double retencionImpuesto) {
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public double calcularSueldo(int dias) {
        return importePorHora*8*dias-importePorHora*8*dias*retencionImpuesto;
    }
}
