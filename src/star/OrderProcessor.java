package star;

import star.behavioral_pattern.OrderHandler;
import star.behavioral_pattern.StandardOrderHandler;
import star.behavioral_pattern.VipOrderHandler;
import star.creational_pattern.Order;

// Класс OrderProcessor обрабатывает заказы с использованием Chain of Responsibility.
public class OrderProcessor {
    private OrderHandler handlerChain;

    public OrderProcessor() {
        // Настройка цепочки обработчиков
        OrderHandler standardHandler = new StandardOrderHandler();
        OrderHandler vipHandler = new VipOrderHandler();

        standardHandler.setNextHandler(vipHandler);
        handlerChain = standardHandler;
    }

    // Метод для обработки заказа
    public void processOrder(Order order) {
        System.out.println("Processing order: " + order);
        handlerChain.handleOrder(order);
    }
}