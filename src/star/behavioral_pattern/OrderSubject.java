package star.behavioral_pattern;

import java.util.ArrayList;
import java.util.List;

// Класс OrderSubject представляет субъект, за которым наблюдают.
public class OrderSubject {
    private String status;                     // Текущий статус заказа
    private List<Observer> observers = new ArrayList<>();  // Список наблюдателей

    // Метод для установки статуса и уведомления наблюдателей
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    // Метод для добавления наблюдателя
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Метод для удаления наблюдателя
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // Метод для уведомления всех наблюдателей
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}