package MesaTrabajo;

public class Programa {
    public static void main(String[] args) {
        Perro caniche = new Perro(true,"caniche","manolito",30.0,true,1920);
        System.out.println(caniche.obtenerEdad());
    }
}
