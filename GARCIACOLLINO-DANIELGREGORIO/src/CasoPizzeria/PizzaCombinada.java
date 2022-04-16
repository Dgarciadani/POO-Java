package CasoPizzeria;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza {
    private List<Pizza> pizzas = new ArrayList<Pizza>();

    public void agregarPizza(Pizza pz) {
        pizzas.add(pz);
    }

    @Override
    public double calcularPrecio() {
        double precioSumaPizzas = 0.0;
        for (Pizza pizza : pizzas) {
            precioSumaPizzas += pizza.calcularPrecio();
        }
        return precioSumaPizzas / pizzas.size();
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
