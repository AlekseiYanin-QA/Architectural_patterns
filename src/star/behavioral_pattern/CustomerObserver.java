package star.behavioral_pattern;

// Класс CustomerObserver представляет наблюдателя для клиента.
public class CustomerObserver implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Customer: Order status changed to " + status);
    }
}
