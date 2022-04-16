package sincro;

public class Jugador {
    private String posicion;
    private String apellido;
    private int nroPosicion;

    public Jugador(String apellido, int nroPosicion,String posicion ) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.nroPosicion = nroPosicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroPosicion() {
        return nroPosicion;
    }

    public void setNroPosicion(int nroPosicion) {
        this.nroPosicion = nroPosicion;
    }
}
