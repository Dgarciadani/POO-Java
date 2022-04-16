public class Departamento extends Proyecto implements Comparable{
    private Integer cantidadPisos;
    private Integer cantidadDxP;

    public Departamento(Integer numeroProyecto, String nombreProyecto, String ciudad, String status, Integer cantidadPisos, Integer cantidadDxP) {
        super(numeroProyecto, nombreProyecto, ciudad, status);
        this.cantidadPisos = cantidadPisos;
        this.cantidadDxP = cantidadDxP;
    }
    @Override
    public int compareTo(Object o) {
        Departamento departamento = (Departamento) o;
        if (cantidadDxP < departamento.cantidadDxP){
            return 1; //Mayor
        }
        if (cantidadDxP < departamento.cantidadDxP){
            return -1; // Menor
        }return 0; // Son Iguales
    }

    public Boolean esRascacielos(){
        if(cantidadPisos>15){
            return true;
        } return false;
    }

}
