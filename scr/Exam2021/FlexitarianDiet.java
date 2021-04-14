package Exam2021;

import Exam2021.Diet;

public class FlexitarianDiet extends Diet {

    float maxMeatGrandsPerWeek;
    Food preferredMeat;


    @Override
    void Diet() {
        daysDuration = 200;
        purpose = "Eating less Meat";
        allowedFood = new Food[]{new Food("mac and cheese", 350, false, FoodType.Recipe), };
        isVegan = false;

    }

    public FlexitarianDiet(int dayD, String purpose, Food[] allowedFood, boolean isVegan){
        this.daysDuration = dayD;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
    }

    public FlexitarianDiet(String name,Food[] allowedFood){
        this.name = name;
        this.allowedFood = allowedFood;
    }


}
