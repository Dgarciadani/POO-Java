public class Cliente {
    private String nombre;
    private String apellido;
    private Integer dni;
    private Double saldoEnCuenta;
    private Double limite;

    public Cliente(String nombre, String apellido, Integer dni, Double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.limite = limite;
        saldoEnCuenta = 0.0;
    }
    public void comprar(Double importe) throws ClienteException {
        if(limite>=(importe+saldoEnCuenta)){
                saldoEnCuenta+=importe;
        }else{
            throw new ClienteException("Error. no se puede superar el limite establecido.");
        }
    }
    public void pagarDeuda(Double importe) throws ClienteException {
        if (importe<=saldoEnCuenta){
            saldoEnCuenta -= importe;
        }
        else{
            throw new ClienteException("Error. No puede pagar mas de lo que debe");
        }
    }
}
