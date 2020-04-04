package zad3;

import java.util.Optional;

public class TenPercentDiscountStrategy implements IStrategy {
    int burgerCounter = 0;
    int friesCounter = 0;
    int drinkCounter = 0;

    @Override
    public void promotion(Order order) {
        for(Food food : order.getFoodList()){
            if(food.getFoodType().equals(FoodType.BURGER)) burgerCounter++;
            if(food.getFoodType().equals(FoodType.FRIES)) friesCounter++;
            if(food.getFoodType().equals(FoodType.DRINK)) drinkCounter++;
        }
      if(burgerCounter > 2){
          Food minPrice = order.getFoodList().get(0);
          for(Food food : order.getFoodList()){
                if(food.getFoodType().equals(FoodType.BURGER)){
                    if(food.getPrice() < minPrice.getPrice()){
                        minPrice = food;
                    }
                }
          }
          for(Food food : order.getFoodList()){
              if(food.equals(minPrice)){
                  food.setPrice(food.getPrice()*0.9);
              }
          }
      }
        if(friesCounter > 2){
            Food minPrice = order.getFoodList().get(0);
            for(Food food : order.getFoodList()){
                if(food.getFoodType().equals(FoodType.FRIES)){
                    if(food.getPrice() < minPrice.getPrice()){
                        minPrice = food;
                    }
                }
            }
            for(Food food : order.getFoodList()){
                if(food.equals(minPrice)){
                    food.setPrice(food.getPrice()*0.9);
                }
            }
        }
        if(drinkCounter > 2){
            Food minPrice = order.getFoodList().get(0);
            for(Food food : order.getFoodList()){
                if(food.getFoodType().equals(FoodType.DRINK)){
                    if(food.getPrice() < minPrice.getPrice()){
                        minPrice = food;
                    }
                }
            }
            for(Food food : order.getFoodList()){
                if(food.equals(minPrice)){
                    food.setPrice(food.getPrice()*0.9);
                }
            }
        }

    }
}
