package PizzasByMe;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizza> pizzas = new ArrayList<Pizza>();

    public void agregarPizzas(Pizza pz){
        pizzas.add(pz);
    }
    public void mostrarPizzas(){
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.toString());
        }
    }
}
