package consultorio;

public abstract class Paciente {
    private Consulta consulta;
    private Integer fechaNacimiento;
    private String nombre;
    private String apellido;
    private Boolean primeraConsulta;

    public Paciente(Consulta consulta, Integer fechaNacimiento, String nombre, String apellido, Boolean primeraConsulta) {
        this.consulta = consulta;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primeraConsulta = primeraConsulta;
    }
     public Boolean necesitaEvaluacion(){
        if (this.primeraConsulta){
            return true;
        }return false;
     }

    public Consulta getConsulta() {
        return consulta;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Boolean getPrimeraConsulta() {
        return primeraConsulta;
    }
}
