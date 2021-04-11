package Exam2021;

import Exam2021.Diet;

public class FlexitarianDiet extends Diet {

    float maxMeatGramsPerWeek;
    Food preferredMeat;


    @Override
    void Diet() {
        daysDuration = 150;
        purpose = "";
        allowedFood = new Food[]{new Food("Rice", 130, true, FoodType.Protein), new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Salmon", 100, false, FoodType.Protein), new Food("Bread", 80, true, FoodType.Carb),
                new Food("Cod", 82, false, FoodType.Protein), new Food("Potato", 76, true, FoodType.Carb),
                new Food("")
        };
        isVegan = false;
    }
}
