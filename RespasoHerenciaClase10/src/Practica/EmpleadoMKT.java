package Practica;

public class EmpleadoMKT extends Empleado{
    private String area;

    @Override
    public void trabajar() {
        System.out.println("Empleado de MKT:"+getNombre()+" Trabajando en el area de:"+area);
    }
    public void trabajar(int horasExtras){
        System.out.println("Empleado de MKT:"+getNombre()+" Trabajando en el area de:"+area+ "con: "+ horasExtras);
    }

    public EmpleadoMKT(String nombre, String apellido, int dni, String area) {
        super(nombre, apellido, dni);
        this.area = area;
    }
}
