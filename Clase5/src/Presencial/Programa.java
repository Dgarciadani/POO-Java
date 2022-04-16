package Presencial;

public class Programa {
    public static void main(String[] args) {
        Cliente rodolfo= new Cliente(15428,"Rodolfo");
        Cliente ezequiel= new Cliente(548425,"Ezequiel");
        rodolfo.incrementarDeuda(550.80);
        System.out.println("Deuda de "+rodolfo.getNombre()+": "+rodolfo.getDeuda());
    }
}
