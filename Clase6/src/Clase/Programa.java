package Clase;

public class Programa {
    public static void main(String[] args) {
        Impresora impre1= new Impresora("impreMax","Cable Ethernet","22/06/21");
        Impresora impre2=new Impresora("impre2","wifi");
        impre1.setHojasDisponibles(30);
        impre1.imprimir("hoy es lindo dia");
        System.out.println(impre1.getHojasDisponibles());
        impre1.setHojasDisponibles(2);


    }
}
