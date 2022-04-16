package Practica;

public class EmpleadoRRHH extends Empleado{
     private int altasLogradas;

    @Override
    public void trabajar() {
        System.out.println("empleado de RRHH trabajando:"+ getNombre());
    }

    public EmpleadoRRHH(String nombre, String apellido, int dni, int altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }
}
