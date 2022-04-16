package CasoPizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizza> pizzasDisponibles = new ArrayList<Pizza>();

    public void mostrarPizzas() {
        for (Pizza pizzaDisponible : pizzasDisponibles) {
            System.out.println(pizzaDisponible.toString());
        }
    }

    public void agregarPizzas(Pizza pz) {
        pizzasDisponibles.add(pz);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pizza> getPizzasDisponibles() {
        return pizzasDisponibles;
    }

    public void setPizzasDisponibles(List<Pizza> pizzasDisponibles) {
        this.pizzasDisponibles = pizzasDisponibles;
    }
}
