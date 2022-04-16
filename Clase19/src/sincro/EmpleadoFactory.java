package sincro;

public class EmpleadoFactory {

    private static EmpleadoFactory instance;

    private EmpleadoFactory(){

    }
    public static EmpleadoFactory getInstance(){
        if (instance==null){
            instance=new EmpleadoFactory();
        }
        return instance;
    }
    public Empleado crearEmpleado (String tipo){
        Empleado emp=null;
        switch (tipo){
            case "EMP-INT":
                emp= new EmpleadoRelacionDependencia();
                break;
            case "EMP-EXT":
                emp= new EmpleadoContratado();
                break;
        }
        return emp;
    }
}
