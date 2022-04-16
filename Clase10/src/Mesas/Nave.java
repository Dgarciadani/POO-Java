package Mesas;

public class Nave extends Objeto{
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = 5;
    }

    /*public void setVida(int vida) {
        this.vida = vida;

    }*/

    @Override
    public void irA (int x, int y, char direccion){
        if(direccion != getDireccion()){
            girar(direccion);
        } else{
            super.irA(x, y, direccion);
        }
    }

    public void girar (char direccion){
        setDireccion(direccion); // Solo si hay otro escrito igual, uso el super
    }

    public void restaVida (int valor){
        this.vida -= valor;

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
