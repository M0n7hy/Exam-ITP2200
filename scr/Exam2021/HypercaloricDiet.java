package Exam2021;

import java.util.Arrays;

public class HypercaloricDiet extends Diet {

    float maxWeighKg;
    float minCaloriesPerDay;



    public void maxWeight(float personsWeight){
        this.maxWeighKg = personsWeight;
        if (personsWeight < 150){
            return;
        } else {
            throw new IllegalArgumentException("This person is too overweight to go on this diet");
        }
    }



    public HypercaloricDiet(float checkWeight) {
        daysDuration = 388;
        purpose = "max calories(mostly for pro's)";
        allowedFood = new Food[]{
                new Food("Chicken", 239, false, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Rice", 300, true, FoodType.Carb),
                new Food("Salmon", 100, false, FoodType.Protein),
                new Food("Bread", 80, true, FoodType.Carb),
                new Food("Steak", 270, false, FoodType.Protein),
                new Food("Lasagne", 403, false, FoodType.Recipe),
                new Food("Cheese", 120, false, FoodType.Fat),
                new Food("Milk", 54, false, FoodType.Fat),
                new Food("Taco", 390, false, FoodType.Recipe)
        };
        isVegan = false;
        maxWeight(checkWeight);
    }



    public HypercaloricDiet(float checkWeight, boolean isVegan) {
        daysDuration = 388;
        purpose = "max calories(mostly for pro's)";
        allowedFood = new Food[]{
                new Food("Chicken", 239, false, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Rice", 300, true, FoodType.Carb),
                new Food("Salmon", 100, false, FoodType.Protein),
                new Food("Bread", 80, true, FoodType.Carb),
                new Food("Steak", 270, false, FoodType.Protein),
                new Food("Lasagne", 403, false, FoodType.Recipe),
                new Food("Cheese", 120, false, FoodType.Fat),
                new Food("Milk", 54, false, FoodType.Fat),
                new Food("Taco", 390, false, FoodType.Recipe)
        };
        this.isVegan = isVegan;
        maxWeight(checkWeight);
    }

    public HypercaloricDiet(int daysD, String purpose, Food[] allowedFood, boolean isVegan) {
        this.daysDuration = daysD;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
    }
}
