package PizzasByMe;

public abstract class Pizza {
    private String nombre;
    private String descripcion;

    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "Nombre: "+ nombre+", precio: "+calcularPrecio();
    }
}
