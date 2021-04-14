package Exam2021;

public class HypercaloricDiet extends Diet {

    float maxWeighKg;
    float minCaloriesPerDay;

    public HypercaloricDiet() {
        Diet();
    }

    public HypercaloricDiet(float personsWeight){
        this.maxWeighKg = personsWeight;
        if (personsWeight > 150){
            return;
        } else {
            throw new IllegalArgumentException("This person is too overweight to go on this diet");
        }
    }



    @Override
    void Diet() {
        daysDuration = 200;
        purpose = "max calories(mostly for pro's)";
        allowedFood = new Food[]{
                new Food("Chicken", 150, false, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Rice", 300, true, FoodType.Carb),
                new Food("Salmon", 100, false, FoodType.Protein),
                new Food("Bread", 80, true, FoodType.Carb),
                new Food("Steak", 270, false, FoodType.Protein)
        };
        //skal vi ta bort denne, og hente isVegan fra allowed food?
        isVegan = true;


    }


}
