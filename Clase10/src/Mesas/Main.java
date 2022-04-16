package Mesas;

public class Main {
    public static void main(String[] args) {
        Nave nav1 = new Nave(10,10,'s',20);
        nav1.restaVida(2);
        nav1.irA(2,4,'n');
        System.out.println(nav1);

    }
}
