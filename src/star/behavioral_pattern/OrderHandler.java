package star.behavioral_pattern;

import star.creational_pattern.Order;

// Интерфейс OrderHandler определяет методы для обработки заказов.
public interface OrderHandler {
    void setNextHandler(OrderHandler nextHandler);
    void handleOrder(Order order);
}