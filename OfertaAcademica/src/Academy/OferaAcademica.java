package Academy;

public abstract class OferaAcademica {
    private String nombre;
    private String descripcion;

    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Nombre: "+ nombre+", Precio: "+ calcularPrecio();
    }
}
