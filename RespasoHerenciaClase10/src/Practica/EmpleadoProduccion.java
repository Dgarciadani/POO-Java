package Practica;

public class EmpleadoProduccion extends Empleado{
    private int tiempoExperiencia;

    @Override
    public void trabajar() {
        System.out.println("Empleado de produccion trabajando");
    }

    public EmpleadoProduccion(String nombre, String apellido, int dni, int tiempoExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }
}
