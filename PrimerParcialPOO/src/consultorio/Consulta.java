package consultorio;

public class Consulta {
    private Integer fechaConsulta;
    private String especialidad;
    private Integer horaConsulta;
    private Integer minutoConsulta;

    public Consulta(Integer fechaConsulta, String especialidad, Integer horaConsulta, Integer minutoConsulta) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.horaConsulta = horaConsulta;
        this.minutoConsulta = minutoConsulta;
    }

    public Integer getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Integer fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(Integer horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public Integer getMinutoConsulta() {
        return minutoConsulta;
    }

    public void setMinutoConsulta(Integer minutoConsulta) {
        this.minutoConsulta = minutoConsulta;
    }
}
