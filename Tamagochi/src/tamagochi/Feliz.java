package tamagochi;

import com.sun.security.jgss.GSSUtil;

public class Feliz implements Estado{
    private Tamagochi t;


public Feliz(Tamagochi t){
    this.t = t;
    System.out.println("Feliz");
}
    @Override
    public void comer() {
        System.out.println("sin cambios");
    }

    @Override
    public void beber() {
        System.out.println("Beep. Beep. Beep. Beep. Beep");
    }

    @Override
    public void recibirMimos() {
        System.out.println("Sin cambios");
    }
}
