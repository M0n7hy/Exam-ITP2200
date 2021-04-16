package Exam2021;

public class FlexitarianDiet extends Diet {

    float maxMeatGramsPerWeek;
    Food preferredMeat;



    public FlexitarianDiet() {
        daysDuration = 150;
        purpose = "Eat less meat";
        allowedFood = new Food[]{
                new Food("Rice", 130, true, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Salmon", 100, false, FoodType.Protein),
                new Food("Cod", 82, false, FoodType.Protein),
                new Food("Bread", 80, true, FoodType.Carb),
                new Food("Potato", 76, true, FoodType.Carb),
                new Food("Tomato", 18, true, FoodType.Carb),
                new Food("Soup", 68, true, FoodType.Recipe),
                new Food("Apple", 52, true, FoodType.Carb),
                new Food("Strawberry", 33, true, FoodType.Carb)

        };
        isVegan = false;
    }

    public FlexitarianDiet(int daysD, String purpose, Food[] allowedFood, boolean isVegan){
        this.daysDuration = daysD;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
    }

}
