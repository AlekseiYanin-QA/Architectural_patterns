package star.structural_pattern;

import star.behavioral_pattern.CustomerObserver;
import star.behavioral_pattern.KitchenObserver;
import star.behavioral_pattern.OrderSubject;
import star.creational_pattern.Order;
import star.creational_pattern.OrderBuilder;

// Класс OrderFacade предоставляет простой интерфейс для работы с системой заказов.
public class OrderFacade {
    private OrderSubject orderSubject;

    public OrderFacade() {
        orderSubject = new OrderSubject();
        // Подписываем наблюдателей
        orderSubject.attach(new KitchenObserver());
        orderSubject.attach(new CustomerObserver());
    }

    // Метод для создания заказа
    public Order createOrder(String mainDish, String sideDish, String drink, String dessert) {
        Order order = new OrderBuilder()
                .setMainDish(mainDish)
                .setSideDish(sideDish)
                .setDrink(drink)
                .setDessert(dessert)
                .build();
        System.out.println("Order created: " + order);
        return order;
    }

    // Метод для уведомления о статусе заказа
    public void notifyStatus(String status) {
        orderSubject.setStatus(status);
    }
}