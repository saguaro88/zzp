package zad3;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Food> foodList = new ArrayList<>();

   public Order(){
   }

   public void addItem(Food food){
       foodList.add(food);
   }
   public void orderFood(){
        System.out.println("Order: ");
        for(Food food : foodList){
            System.out.println(food.getName() + " " + food.getPrice());
        }
   }
public double getPrice(){
       float totalPrice = 0;
    for(Food food : foodList){
        totalPrice += food.getPrice();
    }
    return totalPrice;
}
    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
