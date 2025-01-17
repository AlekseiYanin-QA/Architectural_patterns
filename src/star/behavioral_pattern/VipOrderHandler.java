package star.behavioral_pattern;

import star.creational_pattern.Order;

// Класс VipOrderHandler обрабатывает VIP-заказы.
public class VipOrderHandler extends AbstractOrderHandler {
    @Override
    public void handleOrder(Order order) {
        if (order.getType().equals("VIP")) {
            System.out.println("VIP order handled: " + order);
        } else {
            super.handleOrder(order);
        }
    }
}