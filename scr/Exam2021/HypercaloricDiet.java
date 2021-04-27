package Exam2021;

import java.util.Arrays;

public class HypercaloricDiet extends Diet {

    float maxWeighKg;
    float minCaloriesPerDay;

    /*Constructor that is prefilled, without maxWeight method*/
    public HypercaloricDiet() {
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
    }

    /*Constructor that is prefilled, with maxWeight method that need input of values */
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

    /*Constructor that is prefilled, with maxWeight method that needs input of values, and input of isVegan values. */
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

    /*Constructor that needs input off values, and  runs the maxWeight method*/
    public HypercaloricDiet(int daysD, String purpose, Food[] allowedFood, boolean isVegan, float checkWeight) {
        this.daysDuration = daysD;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
        maxWeight(checkWeight);
    }
    /*Checks the persons weight, returns a true or exception. Criteria 2.D and 4.A*/
    public boolean maxWeight(float personsWeight){
        this.maxWeighKg = personsWeight;
        if (personsWeight < 150){
            return true;
        } else {
            throw new IllegalArgumentException("This person is too overweight to go on this diet");
        }
    }
}
