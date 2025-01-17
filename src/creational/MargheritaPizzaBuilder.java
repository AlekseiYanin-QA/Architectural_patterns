package creational;

// Конкретный строитель для Margherita
class MargheritaPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("thin crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("mozzarella and basil");
    }
}
