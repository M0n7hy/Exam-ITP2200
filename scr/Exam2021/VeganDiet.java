package Exam2021;

import Exam2021.Diet;

public class VeganDiet extends Diet {

    Float minWeightKg;

    public void minweightkg(float personsWeight){
            this.minWeightKg = personsWeight;
            if (personsWeight > 50){
               Diet();
            } else {
                throw new IllegalArgumentException("This person is too underweight to go on this diet");
            }
    }


    @Override
    void Diet() {
        daysDuration = 200;
        purpose = "weight lost";
        allowedFood = new Food[]{
                new Food("Tofu", 150, true, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Rice", 300, true, FoodType.Carb),
                new Food("Lentils", 120, true, FoodType.Protein),
                new Food("Bread", 80, true, FoodType.Carb),
                new Food("Nuts",22, true, FoodType.Carb)
        };
        isVegan = true;
    }

    public VeganDiet(){
            daysDuration = 200;
            purpose = "weight lost";
            allowedFood = new Food[]{
                    new Food("Tofu", 150, true, FoodType.Protein),
                    new Food("Salad", 200, true, FoodType.Recipe),
                    new Food("Rice", 300, true, FoodType.Carb),
                    new Food("Lentils", 120, true, FoodType.Protein),
                    new Food("Bread", 80, true, FoodType.Carb),
                    new Food("Nuts",22, true, FoodType.Carb)
            };
            isVegan = true;
    }



}
