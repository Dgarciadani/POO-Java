package sincro;

public class Main {
    public static void main(String[] args) {
        Empresa mascotas= new Empresa("Mascotas");

        //agregar empleado contratado
        EmpleadoContratado empleado=(EmpleadoContratado) EmpleadoFactory.getInstance().crearEmpleado("EMP-EXT");
        empleado.setNombre("Pablo");
        empleado.setApellido("Rodriguez");
        empleado.setImportePorHora(600);
        empleado.setRetencionImpuesto(0.2);

        mascotas.getEmpleados().add(empleado);

        System.out.println("Total de sueldos a pagar: "+mascotas.calcularSueldoTotal(20));



    }
}
