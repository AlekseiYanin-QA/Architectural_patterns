package star.behavioral_pattern;

import star.creational_pattern.Order;

// Абстрактный класс AbstractOrderHandler реализует базовую логику цепочки.
public abstract class AbstractOrderHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleOrder(Order order) {
        if (nextHandler != null) {
            nextHandler.handleOrder(order);
        }
    }
}