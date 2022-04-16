package CasoPizzeria;

public class Test {
    public static void main(String[] args) {
        //PIZZA MUZZA
        Pizza pizza1 = PizzaFactory.getInstance().crearPizza("PizzaSimple");
        pizza1.setNombre("Pizza Muzzarella");
        pizza1.setDescripcion("Muza Chica");
        ((PizzaSimple) pizza1).setPrecioBase(700);
        ((PizzaSimple) pizza1).setEsGrande(false);

        //PIZZA ESPECIAL
        Pizza pizza2 = PizzaFactory.getInstance().crearPizza("PizzaSimple");
        pizza2.setNombre("Pizza Especial");
        pizza2.setDescripcion("Especial Chica");
        ((PizzaSimple) pizza2).setPrecioBase(850);
        ((PizzaSimple) pizza2).setEsGrande(false);

        //PIZZA ANANA
        Pizza pizza3 = PizzaFactory.getInstance().crearPizza("PizzaSimple");
        pizza3.setNombre("Pizza Anana");
        pizza3.setDescripcion("Anana Chica");
        ((PizzaSimple) pizza3).setPrecioBase(950);
        ((PizzaSimple) pizza3).setEsGrande(false);

        //PIZZA COMBINADA LOCA
        Pizza pizzaC4 = PizzaFactory.getInstance().crearPizza("PizzaCombinada");
        pizzaC4.setNombre("Pizza Combinada Loca");
        pizzaC4.setDescripcion("Combinada Reloca");
        ((PizzaCombinada) pizzaC4).agregarPizza(pizza2);
        ((PizzaCombinada) pizzaC4).agregarPizza(pizza3);

        //PIZZERIA
        Pizzeria PizzaLoca = new Pizzeria();
        PizzaLoca.setNombre("Pizza Loca");
        PizzaLoca.agregarPizzas(pizza1);
        PizzaLoca.agregarPizzas(pizza2);
        PizzaLoca.agregarPizzas(pizza3);
        PizzaLoca.agregarPizzas(pizzaC4);
        PizzaLoca.mostrarPizzas();


    }
}
