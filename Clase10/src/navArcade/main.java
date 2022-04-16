package navArcade;

public class main {
    public static void main(String[] args) {
        Nave nav1= new Nave(20,20,'s',10);
        nav1.restaVida(2);
        nav1.irA(2,4,'n');
        System.out.println(nav1);
    }
}
