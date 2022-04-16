package PizzasByMe;

public class PizzaFactory {

    private static PizzaFactory instance;

    private PizzaFactory(){

    }
    public static PizzaFactory getInstance(){
        if(instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }
    public Pizza crearPizza(String pz){
        switch (pz){
            case "Simple":
                return new Simple();
            case "Combinada":
                return new Combinada();
            default:
                return null;
        }
    }
}
