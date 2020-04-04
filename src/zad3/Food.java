package zad3;

public class Food {
    private String name;
    private FoodType foodType;
    private double price;

    public Food(String name, FoodType foodType, double price) {
        this.name = name;
        this.foodType = foodType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
