package mesaDeTrabajo;

public class Main {
    public static void main(String[] args) {
        UsuarioJuego Grego = new UsuarioJuego("Grego","bababa");
        UsuarioJuego Mati = new UsuarioJuego("Mati","bababa");
        Grego.aumentarPuntaje();
        Grego.getPuntaje();
        System.out.println(Grego.getPuntaje());
        Grego.bonus(2);
        System.out.println(Grego.getPuntaje());
    }
}
