package creational;

// Конкретный строитель для Pepperoni
class PepperoniPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("thick crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("spicy tomato");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni and cheese");
    }
}
