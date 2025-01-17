package star.behavioral_pattern;

// Интерфейс Observer определяет метод update, который будет вызываться при изменении состояния.
public interface Observer {
    void update(String status);
}
