package Clase3;

import java.util.Scanner;

public class PiedraPapelTijeraLagartoSpock {
public static String Juego(String jugador1, String jugador2) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Eleccion de " + jugador1);
    System.out.println("1=Piedra/2=Papel/3=Tijeras/4=Lagarto/5=Spock");
    int eleccion1 = sc.nextInt();
    System.out.println("Eleccion de " + jugador2);
    System.out.println("1=Piedra/2=Papel/3=Tijeras/4=Lagarto/5=Spock");
    int eleccion2 = sc.nextInt();

    if (eleccion1 == eleccion2) {
        return "Empate 😕 ";
    } else if (
            (eleccion1 == 1 && eleccion2 == 3) ||
                    (eleccion1 == 3 && eleccion2 == 2) ||
                    (eleccion1 == 2 && eleccion2 == 1) ||
                    (eleccion1 == 1 && eleccion2 == 4) ||
                    (eleccion1 == 4 && eleccion2 == 5) ||
                    (eleccion1 == 5 && eleccion2 == 3) ||
                    (eleccion1 == 3 && eleccion2 == 4) ||
                    (eleccion1 == 5 && eleccion2 == 1) ||
                    (eleccion1 == 4 && eleccion2 == 2) ||
                    (eleccion1 == 2 && eleccion2 == 5)
    ) {
        return "Ganó " + jugador1 + " eligiendo " + eleccion1;
    } else if (eleccion1 > 5 || eleccion2 > 5) {
        return "No puede ser que no sepan hacer una simple elección muchachos";
    } else {
        return "Ganó " + jugador2 + " eligiendo " + eleccion2;
    }
};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Piedra, Papel, Tijera, Lagarto, Spock");
        System.out.println("Selecciones una opcion");
        System.out.println("1 = Jugar / 2= Salir");
        int seleccion = sc.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Ingrese el nombre del Player1:");
                String nombreGamer1 = sc.next();
                System.out.println("Ingrese el nombre del Player2:");
                String nombreGamer2 = sc.next();
                System.out.println(Juego(nombreGamer1, nombreGamer2));
                break;
        case 2:
            System.out.println("gil");
            break;
    }
    }
}
