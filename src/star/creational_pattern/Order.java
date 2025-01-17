package star.creational_pattern;

// Класс Order представляет заказ в ресторане.
public class Order {
    private String mainDish;   // Основное блюдо
    private String sideDish;   // Гарнир
    private String drink;      // Напиток
    private String dessert;    // Десерт
    private String type;       // Тип заказа (Standard или VIP)

    // Сеттеры для полей
    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Геттер для типа заказа
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Order: " + mainDish + ", " + sideDish + ", " + drink + ", " + dessert + " (Type: " + type + ")";
    }
}
