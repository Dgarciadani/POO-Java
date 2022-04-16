package mesas;

public class Cliente {
    private int numeroCliente;
    private String nombre;
    private String apellido;
    private int dni;
    private int cuit;

    public Cliente(int numeroCliente, String nombre, String apellido, int dni, int cuit) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
}
