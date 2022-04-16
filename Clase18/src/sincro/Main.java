package sincro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Plantel seleccion = new Plantel("ARGENTINA");
        seleccion.addJugador(new Jugador("Pumpido",1, "ARQUERO"));
        seleccion.addJugador(new Jugador("Batista",2, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("Balbo",3, "DELANTERO"));
        seleccion.addJugador(new Jugador("Basualdo",4, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("Bauza",5, "DEFENSOR"));
        seleccion.addJugador(new Jugador("Calderon",6, "DELANTERO"));
        seleccion.addJugador(new Jugador("Burruchaga",7, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("Caniggia",8, "DELANTERO"));
        seleccion.addJugador(new Jugador("Dezotti",9, "DELANTERO"));
        seleccion.addJugador(new Jugador("Maradona",10, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("Fabri",11, "DEFENSOR"));
        seleccion.addJugador(new Jugador("Goycochea",12, "ARQUERO"));
        seleccion.addJugador(new Jugador("Lorenzo",13, "DEFENSOR"));
        seleccion.addJugador(new Jugador("Giusti",14, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("Monzon",15, "DEFENSOR"));
        seleccion.addJugador(new Jugador("Olarticoechea",16, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("Sensini",17, "DEFENSOR"));
        seleccion.addJugador(new Jugador("Serrizuela",18, "DEFENSOR"));
        seleccion.addJugador(new Jugador("Ruggeri",19, "DEFENSOR"));
        seleccion.addJugador(new Jugador("Simon",20, "DEFENSOR"));
        seleccion.addJugador(new Jugador("Troglio",21, "MEDIOCAMPISTA"));
        seleccion.addJugador(new Jugador("Cancelarich",22, "ARQUERO"));
        seleccion.addJugador(new Jugador("Comizzo",23, "ARQUERO"));

        ArrayList<Jugador> jugadoresEnReserva = seleccion.obtenerReserva();


    }

}
