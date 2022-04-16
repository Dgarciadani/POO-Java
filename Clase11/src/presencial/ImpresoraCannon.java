package presencial;

public class ImpresoraCannon extends Impresora{
    @Override
    public String imprimir() {
        return "Imprimiendo tus hojas con calidad Cannon";
    }
    @Override
    public boolean necesitaTinta(){
        return getPorcentajeTinta()<20;
    }
    public void soloCannon(){
        System.out.println("Solo Cannon");
    }
}
