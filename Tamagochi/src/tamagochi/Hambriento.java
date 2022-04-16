package tamagochi;

public class Hambriento implements Estado{
    private Tamagochi t;

    public Hambriento(Tamagochi t){
        this.t = t;
        System.out.println("Hambriento");}
    @Override
    public void comer() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void beber() {
        System.out.println("sin cambios");

    }

    @Override
    public void recibirMimos() {
        System.out.println("sin cambios");
    }
}
