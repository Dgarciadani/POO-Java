package tamagochi;

public class Sediento implements Estado{
    private Tamagochi t;

    public Sediento(Tamagochi t){
        this.t = t;
        System.out.println("Sediento");}

    @Override
    public void comer() {
        System.out.println("sin cambios");

    }

    @Override
    public void beber() {
        t.setEstado(new Feliz(t));

    }

    @Override
    public void recibirMimos() {
        System.out.println("sin cambios");

    }
}
