package reparacionMesa;

public class Reparacion {
private String articulo;
private double presupuesto;
private String direccion;
public Estado estado;

public void cambiarDireccion(String direccion){

};
public void darValorPresupuesto(double valor){};

public void pasarSigPaso(){};
public void agregarRepuesto(){};

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
