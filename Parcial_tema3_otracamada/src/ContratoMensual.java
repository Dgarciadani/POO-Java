public class ContratoMensual extends Contrato{
    private Double salarioMensual;
    private Integer horasTotales;
    private String cargo;

    public ContratoMensual(Integer cantidadMeses, Integer fechaInicio, Boolean selladoMinisterio, Persona persona, Double salarioMensual, Integer horasTotales, String cargo) {
        super(cantidadMeses, fechaInicio, selladoMinisterio, persona);
        this.salarioMensual = salarioMensual;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public Boolean esJefe(){
        if (cargo=="jefe"){
            return true;
        }return false;
    }
}
