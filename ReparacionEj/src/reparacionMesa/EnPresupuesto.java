package reparacionMesa;

public class EnPresupuesto implements Estado{
    private Reparacion r;

    public EnPresupuesto(Reparacion r) {
        this.r = r;
    }

    @Override
    public void cambiarDireccion(String direccion) {

    }

    @Override
    public void darValorPresupuesto(double valor) {
        r.setPresupuesto(valor);
    }

    @Override
    public void pasarSigPaso() {
r.setEstado(new EnReparacion(r));
    }

    @Override
    public void agregarRepuesto() {
        System.out.println("En este estano no se puede ejecutar este metodo");
    }
}
