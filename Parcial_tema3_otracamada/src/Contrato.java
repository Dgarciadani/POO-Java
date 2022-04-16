public abstract class Contrato {
    private Integer cantidadMeses;
    private Integer fechaInicio;
    private Boolean selladoMinisterio;
    private Persona persona;

    public Contrato(Integer cantidadMeses, Integer fechaInicio, Boolean selladoMinisterio, Persona persona) {
        this.cantidadMeses = cantidadMeses;
        this.fechaInicio = fechaInicio;
        this.selladoMinisterio = selladoMinisterio;
        this.persona = persona;
    }

    public Boolean incorporarTrabajo(){
        if(selladoMinisterio){
            return true;
        }return false;
    }
}
