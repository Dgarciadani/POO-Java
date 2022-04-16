package mesas;

public class CajaAhorro extends Cuenta{
    private double tasaInteres;

    @Override
    public void extraer(double monto) {
        if (getSaldo()<=monto){
        setSaldo(getSaldo()-monto);
    }else{
            System.out.println("El monto supera el saldo disponible");
        }
    }
    public void cobrarIntereses(){
        setSaldo(1+(tasaInteres/100)*getSaldo());
    }
}
