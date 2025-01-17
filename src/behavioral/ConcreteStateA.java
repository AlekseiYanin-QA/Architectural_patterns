package behavioral;

// Конкретное состояние A
class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling request in State A. Switching to State B.");
        context.setState(new ConcreteStateB());
    }
}

