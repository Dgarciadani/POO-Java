package consultorio;

public class Particular extends Paciente{
    private Double valorConsulta;
    private Integer dni;

    public Particular(Consulta consulta, Integer fechaNacimiento, String nombre, String apellido, Boolean primeraConsulta, Double valorConsulta, Integer dni) {
        super(consulta, fechaNacimiento, nombre, apellido, primeraConsulta);
        this.valorConsulta = valorConsulta;
        this.dni = dni;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}
