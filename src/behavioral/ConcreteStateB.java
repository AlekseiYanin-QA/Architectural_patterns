package behavioral;

// Конкретное состояние B
class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling request in State B. Switching to State A.");
        context.setState(new ConcreteStateA());
    }
}