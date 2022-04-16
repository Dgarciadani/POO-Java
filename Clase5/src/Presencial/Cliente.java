package Presencial;

public class Cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    public Cliente (Integer numeroCliente, String nombre){
        this.numeroCliente=numeroCliente;
        this.nombre=nombre;
        deuda=0.0;
    }

    public void incrementarDeuda (Double valor){
        deuda+=valor;
    }

    public void pagarDeuda(){
        deuda=0.0;
    }
    public Integer getNumeroCliente(){
        return numeroCliente;
    }
    public String getNombre(){
        return nombre;
    }
    public Double getDeuda(){
        return deuda;
    }
    public void setNumeroCliente(Integer num){
        numeroCliente=num;
    }
    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }
}
