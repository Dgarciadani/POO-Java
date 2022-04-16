package RepasoClase;

public class Parcial {
    private int unidad;
    private int nroDeReintento;

    public boolean sePuedeRecuperar(){
        if (unidad<=3){
            return nroDeReintento<=2;
        }else{
            return nroDeReintento<=1;
        }
    }
}
