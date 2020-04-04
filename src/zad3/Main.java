package zad3;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        Kitchen kitchen = new Kitchen();
        kiosk.register(kitchen);
        Order order = new Order();
        Food burger1 = new Food("BurgerPyszny", FoodType.BURGER, 10.99);
        Food burger2 = new Food("BurgerNiePyszny", FoodType.BURGER, 10);
        Food burger3 = new Food("BurgerSredni", FoodType.BURGER, 17.50);
        Food drink1 = new Food("CocaCola", FoodType.DRINK, 2.50);
        Food fries = new Food("Frytasy", FoodType.FRIES, 80);

        order.addItem(burger1);
        order.addItem(burger2);
        order.addItem(burger3);
        order.addItem(drink1);
        order.addItem(fries);
        Order order2 = new Order();
        order2.addItem(fries);
        order2.addItem(drink1);
        kiosk.setSaleStrategy(new TenPercentDiscountStrategy());
        kiosk.makeOrder(new OrderCommand(order));
        kiosk.setSaleStrategy(new AboveThirtyPromotion());
        kiosk.makeOrder(new OrderCommand(order2));
    }
}
