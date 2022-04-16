package Academy;

public class Curso extends OferaAcademica{
    private double cargaHorariaMensual;
    private double duracionMeses;
    private double valorHora;

    @Override
    public double calcularPrecio() {
        return cargaHorariaMensual*duracionMeses*valorHora;
    }

    public double getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(double cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public double getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(double duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
