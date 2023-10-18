package src.food;

public abstract class Food {
    private String foodName;
    public Food(String foodName){
        this.foodName=foodName;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
