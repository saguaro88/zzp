package zad1;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(PizzaSize.MEDIUM, PizzaSauce.CREAM)
                .addTopping(Topping.CHEESE)
                .addTopping(Topping.HAM)
                .addTopping(Topping.MUSHROOMS)
                .setSaucePosition(SaucePosition.INSIDE)
                .build();
    }
}
