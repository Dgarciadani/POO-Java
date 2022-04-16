public  abstract class Proyecto {
    private Integer numeroProyecto;
    private String nombreProyecto;
    private String ciudad;
    private String status;
    private Construccion construccion;

    public Proyecto(Integer numeroProyecto, String nombreProyecto, String ciudad, String status) {
        this.numeroProyecto = numeroProyecto;
        this.nombreProyecto = nombreProyecto;
        this.ciudad = ciudad;
        status = status;
    }

    public Boolean finalizoEnFecha(){
        if(construccion.getFehcaPrevista().equals(construccion.getFechaFinalizacion()) && this.status == "Finalizado")
        {
            return true;
        }
            return false;

    }
}
