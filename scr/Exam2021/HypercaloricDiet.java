package Exam2021;

public class HypercaloricDiet extends Diet {

    float maxWeighKg;
    float minCaloriesPerDay;


    @Override
    void Diet() {

        daysDuration = 200;
        purpose = "weight lost";
        allowedFood = new Food[]{new Food("Chicken", 150, false, FoodType.Protein), new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Rice", 300, true, FoodType.Carb), new Food("Salmon", 100, false, FoodType.Protein), new Food("Bread", 80, true, FoodType.Carb)
        };
        isVegan = false;

    }
}