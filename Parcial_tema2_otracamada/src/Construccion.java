public class Construccion {
    private String direccion;
    private Integer fechaInicio;
    private Integer fehcaPrevista;
    private Integer fechaFinalizacion;

    public Construccion(String direccion, Integer fechaInicio, Integer fehcaPrevista, Integer fechaFinalizacion) {
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fehcaPrevista = fehcaPrevista;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer getFechaInicio() {
        return fechaInicio;
    }

    public Integer getFehcaPrevista() {
        return fehcaPrevista;
    }

    public Integer getFechaFinalizacion() {
        return fechaFinalizacion;
    }
}
