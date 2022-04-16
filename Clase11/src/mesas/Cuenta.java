package mesas;

public abstract class Cuenta {
    private int numeroCliente;
    private double saldo;

    public void depositar(double monto){
        this.saldo+=monto;
    }
    public  abstract void extraer(double monto);

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
