package zad1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final PizzaSauce pizzaSauce;
    private final PizzaSize pizzaSize;
    private final List<Topping> toppings;
    private final SaucePosition saucePosition;

    public static class Builder{
        private final PizzaSauce pizzaSauce;
        private final PizzaSize pizzaSize;
        private List<Topping> toppings = new ArrayList<>();
        private SaucePosition saucePosition;

        public Builder(PizzaSize pizzaSize, PizzaSauce pizzaSauce){
            this.pizzaSize = pizzaSize;
            this.pizzaSauce = pizzaSauce;
        }
        public Builder addTopping(Topping topping){
            toppings.add(topping);
            return this;
        }
        public Builder setSaucePosition(SaucePosition saucePosition){
            this.saucePosition = saucePosition;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
    private Pizza(Builder builder){
        this.pizzaSauce = builder.pizzaSauce;
        this.pizzaSize = builder.pizzaSize;
        this.toppings = builder.toppings;
        this.saucePosition = builder.saucePosition;
    }
}
