package Exam2021;

public class LowcarbDiet extends Diet {


    float minWeightKg;  //se på det senere.

    public LowcarbDiet() {
        Diet();
    }


    public void LowcarbDiet(float personWeight){
        this.minWeightKg = personWeight;
        if (personWeight > 50){
            Diet();
        } else{
            throw new IllegalArgumentException("This person is too underweight to go on this diet.");
        }
    }

    @Override
    void Diet() {
        daysDuration = 200;
        purpose = "weight lost";
        allowedFood = new Food[]{
                new Food("Chicken", 150, false, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Rice", 300, true, FoodType.Carb),
                new Food("Salmon", 100, false, FoodType.Protein),
                new Food("Bread", 80, true, FoodType.Carb),
        };
        isVegan = false;
    }

}
