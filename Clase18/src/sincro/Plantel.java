package sincro;

import java.util.ArrayList;
import java.util.List;

public class Plantel {
    private String nombre;
    private List<Jugador> jugadores;
    public Plantel(String nombre){
        this.nombre=nombre;
        jugadores = new ArrayList<Jugador>();
    }
    public void addJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    public int cantJugadores(String posicion) throws Exception {
        int contador = 0;
        if(posicion.equals("ARQUERO")||posicion.equals("MEDIOCAMPISTA")||posicion.equals("DELANTERO")||posicion.equals("DEFENSOR")){
            for (Jugador jug:jugadores){
                if(jug.getPosicion().equals(posicion)){
                    contador ++;
                }
            }
        }
        else{
            throw new Exception("la posicion ingresada no es valida. Error");
        }
        return contador;

}
public ArrayList<Jugador> obtenerReserva(){
        ArrayList<Jugador> reserva = new ArrayList<>();
        for (int i=jugadores.size()-1;i>= jugadores.size()-5;i--){
            reserva.add(jugadores.get(i));
        }
        return reserva;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
