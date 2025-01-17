package star.behavioral_pattern;

// Класс KitchenObserver представляет наблюдателя для кухни.
public class KitchenObserver implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Kitchen: Order status changed to " + status);
    }
}
