package Exam2021;

public class FlexitarianDiet extends Diet {

    float maxMeatGramsPerWeek;
    Food preferredMeat;

        public void giveMeatAndGrams(float grams, Food meat){
            this.maxMeatGramsPerWeek = grams;
            this.preferredMeat = meat;

            if (meat.isVegan == false && meat.type == FoodType.Protein){
                return;
            }else{
                throw new IllegalArgumentException("Must be non-Vegan food");
            }

        }


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
        giveMeatAndGrams(150.90f, new Food("Chicken", 400, false, FoodType.Protein));
    }

    public FlexitarianDiet(int daysD, String purpose, Food[] allowedFood, boolean isVegan, float maxMeatGramsPerWeek, Food preferredMeat){
        this.daysDuration = daysD;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
        giveMeatAndGrams(maxMeatGramsPerWeek, preferredMeat);
    }

}
