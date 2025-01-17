package star;

import star.creational_pattern.Order;
import star.structural_pattern.OrderFacade;

// Основной класс приложения
public class StarApp {
    public static void main(String[] args) {
        // Создаем фасад для управления заказами
        OrderFacade orderFacade = new OrderFacade();

        // Создаем стандартный заказ
        Order standardOrder = orderFacade.createOrder("Pizza", "Salad", "Water", "Ice Cream");
        standardOrder.setType("Standard");

        // Создаем VIP-заказ
        Order vipOrder = orderFacade.createOrder("Steak", "Fries", "Wine", "Cheesecake");
        vipOrder.setType("VIP");

        // Обрабатываем заказы с помощью OrderProcessor
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(standardOrder);
        orderProcessor.processOrder(vipOrder);

        // Уведомляем о статусе заказов
        orderFacade.notifyStatus("In Progress");
        orderFacade.notifyStatus("Ready");
    }
}