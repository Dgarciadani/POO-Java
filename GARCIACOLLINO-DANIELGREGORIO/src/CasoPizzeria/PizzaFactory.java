package CasoPizzeria;

public class PizzaFactory {
    private static PizzaFactory instance;

    private PizzaFactory() {
    }

    public static PizzaFactory getInstance() {
        if (instance == null) {
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String tipoPizza) {
        switch (tipoPizza) {
            case "PizzaSimple":
                return new PizzaSimple();
            case "PizzaCombinada":
                return new PizzaCombinada();
            default:
                return null;
        }
    }

}
