package star.creational_pattern;

// Класс OrderBuilder используется для пошагового создания заказов.
public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        order = new Order();
    }

    // Методы для настройки заказа
    public OrderBuilder setMainDish(String mainDish) {
        order.setMainDish(mainDish);
        return this;
    }

    public OrderBuilder setSideDish(String sideDish) {
        order.setSideDish(sideDish);
        return this;
    }

    public OrderBuilder setDrink(String drink) {
        order.setDrink(drink);
        return this;
    }

    public OrderBuilder setDessert(String dessert) {
        order.setDessert(dessert);
        return this;
    }

    public OrderBuilder setType(String type) {
        order.setType(type);
        return this;
    }

    // Метод для завершения создания заказа
    public Order build() {
        return order;
    }
}
