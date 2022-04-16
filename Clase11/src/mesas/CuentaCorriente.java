package mesas;

public class CuentaCorriente extends Cuenta{
    private double giroDisponible;

    @Override
    public void extraer(double monto) {
        if (getSaldo()>=monto && monto<(getSaldo()+giroDisponible)){
            System.out.println("Su saldo es de"+(getSaldo()-monto));
            setSaldo(getSaldo()-monto);
        }else if((getSaldo()+giroDisponible)>=monto){
            System.out.println("Su operacion consumió de su giro Disponible");
            this.giroDisponible= giroDisponible+(getSaldo()-monto);
        }
        else{
            System.out.println("No es posible hacer la extraccion");
        }
    }

}
