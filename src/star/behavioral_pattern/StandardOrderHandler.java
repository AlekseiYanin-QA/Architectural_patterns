package star.behavioral_pattern;

import star.creational_pattern.Order;

// Класс StandardOrderHandler обрабатывает стандартные заказы.
public class StandardOrderHandler extends AbstractOrderHandler {
    @Override
    public void handleOrder(Order order) {
        if (order.getType().equals("Standard")) {
            System.out.println("Standard order handled: " + order);
        } else {
            super.handleOrder(order);
        }
    }
}
