public  abstract class Propiedad {
    private String calle;
    private Integer numero;

    public Propiedad(String calle, Integer numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public abstract double calcularImpuestos();

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
