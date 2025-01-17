package creational;

// Main класс для тестирования
public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        PizzaBuilder margheritaBuilder = new MargheritaPizzaBuilder();
        director.setPizzaBuilder(margheritaBuilder);
        director.constructPizza();
        Pizza margheritaPizza = director.getPizza();
        System.out.println(margheritaPizza);

        PizzaBuilder pepperoniBuilder = new PepperoniPizzaBuilder();
        director.setPizzaBuilder(pepperoniBuilder);
        director.constructPizza();
        Pizza pepperoniPizza = director.getPizza();
        System.out.println(pepperoniPizza);
    }
}