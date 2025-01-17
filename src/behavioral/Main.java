package behavioral;

// Main класс для тестирования
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());

        context.request(); // Переход в State B
        context.request(); // Переход в State A
        context.request(); // Переход в State B
    }
}