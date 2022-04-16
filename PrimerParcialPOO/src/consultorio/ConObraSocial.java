package consultorio;

public class ConObraSocial  extends Paciente implements Comparable{
    private String nombreObraSocial;
    private Integer numeroAsociado;

    public ConObraSocial(Consulta consulta, Integer fechaNacimiento, String nombre, String apellido, Boolean primeraConsulta, String nombreObraSocial, Integer numeroAsociado) {
        super(consulta, fechaNacimiento, nombre, apellido, primeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    @Override
    public int compareTo(Object o) {
        ConObraSocial cOS = (ConObraSocial) o;
        if(this.numeroAsociado > cOS.numeroAsociado){
            return 1;
        }
        if (this.numeroAsociado < cOS.numeroAsociado){
            return -1;
        }return 0;
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public void setNombreObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }

    public Integer getNumeroAsociado() {
        return numeroAsociado;
    }

    public void setNumeroAsociado(Integer numeroAsociado) {
        this.numeroAsociado = numeroAsociado;
    }
}
