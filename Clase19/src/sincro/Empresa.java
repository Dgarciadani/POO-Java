package sincro;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String razonSocial){
        this.razonSocial=razonSocial;
        empleados= new ArrayList<>();

        //ejemplo de un empleado preexistente
        EmpleadoRelacionDependencia emp1=(EmpleadoRelacionDependencia) EmpleadoFactory.getInstance().crearEmpleado("EMP-INT");
        emp1.setNombre("Juan");
        emp1.setApellido("Rodriguez");
        emp1.setSueldoMensual(10000);

        empleados.add(emp1);
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public double calcularSueldoTotal(int dias){
        // calcular el costo de sueldos de todas las personas empleadas según x dias
        double total=0;
        for (Empleado emp:empleados) {
            total+=emp.calcularSueldo(dias);
        }
        return total;
    }
}
