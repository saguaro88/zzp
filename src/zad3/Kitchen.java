package zad3;


public class Kitchen implements IObserver {

    @Override
    public void update(Order order) {
        System.out.println("Kitchen");
        for(Food food : order.getFoodList()){
            System.out.println(food.getName() +" " + food.getPrice());
        }
    }
}
