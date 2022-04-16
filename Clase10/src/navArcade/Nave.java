package navArcade;

public class Nave extends Objeto{
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad=velocidad;
        this.vida=5;

    }
    public void girar(char direccion){
        setDireccion(direccion);
    }
    public void restaVida(int valor){
        this.vida-=valor;
    }

    @Override
    public void irA(int x, int y, char direccion){
        if (direccion!=getDireccion()){
            girar(direccion);
        }else{
            super.irA(x,y, direccion);
        }
    }
    @Override
    public String toString() {
        return  '\n'+
                "Nave:" + '\n' +
                "Velocidad=" + velocidad + '\n'+
                "vida=" + vida + '\n' +
                "direccion=" +getDireccion()
                ;
    }

}
