public class ContratoHora extends Contrato implements Comparable{
    private Integer horasContratadas;
    private Double valorHora;

    public ContratoHora(Integer cantidadMeses, Integer fechaInicio, Boolean selladoMinisterio, Persona persona, Integer horasContratadas, Double valorHora) {
        super(cantidadMeses, fechaInicio, selladoMinisterio, persona);
        this.horasContratadas = horasContratadas;
        this.valorHora = valorHora;
    }


    @Override
    public int compareTo(Object o) {
        ContratoHora contratoHora = (ContratoHora)o;
        if(this.horasContratadas > contratoHora.horasContratadas){
            return 1;
        }
        if (this.horasContratadas < contratoHora.horasContratadas){
            return -1;
        }return 0;
    }
}

