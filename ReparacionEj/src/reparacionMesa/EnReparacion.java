package reparacionMesa;

public class EnReparacion implements Estado{
    public Reparacion r;

    public EnReparacion(Reparacion r) {
        this.r = r;
    }

    @Override
    public void cambiarDireccion(String direccion) {

    }

    @Override
    public void darValorPresupuesto(double valor) {

    }

    @Override
    public void pasarSigPaso() {

    }

    @Override
    public void agregarRepuesto() {

    }
}
