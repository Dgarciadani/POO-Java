package PizzasByMe;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Pizza {
    private List<Pizza> sabores = new ArrayList<Pizza>();

    @Override
    public double calcularPrecio() {
        double precioTotal = 0.0;
        for (Pizza sabor : sabores) {
            precioTotal+=sabor.calcularPrecio();
        }
        return precioTotal/sabores.toArray().length;
    }
    public void agregarPizza(Pizza pz){
        sabores.add(pz);
    }
}
