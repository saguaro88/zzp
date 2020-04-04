package zad3;

public class AboveThirtyPromotion implements IStrategy {
    @Override
    public void promotion(Order order) {
        if(order.getPrice() > 30){
            for(Food food : order.getFoodList()){
                if(food.getFoodType().equals(FoodType.DRINK)){
                    food.setPrice(0.01);
                    break;
                }
            }
        }
    }
}
