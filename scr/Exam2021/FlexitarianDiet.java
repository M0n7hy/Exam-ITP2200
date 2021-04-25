package Exam2021;

public class FlexitarianDiet extends Diet {

    float maxMeatGramsPerWeek;
    Food preferredMeat;


    /*This method makes sure the preferred meat is non-Vegan. Criteria 1.D*/
    public boolean giveMeatAndGrams(float grams, Food meat){
            this.maxMeatGramsPerWeek = grams;
            this.preferredMeat = meat;

            if (meat.isVegan == false && meat.type == FoodType.Protein){
                return true;
            }else{
                throw new IllegalArgumentException("The preferred meat must be non-vegan FlexitarianDiet.");
            }

        }

    /*Constructor*/
    public FlexitarianDiet() {
        daysDuration = 150;
        purpose = "Eat less meat";
        this.allowedFood = new Food[]{
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
        this.isVegan = false;
    }

    /*Constructor*/
    public FlexitarianDiet( float maxMeatGramsPerWeek, Food preferredMeat) {
        daysDuration = 150;
        purpose = "Eat less meat";
        this.allowedFood = new Food[]{
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
        this.isVegan = false;
        giveMeatAndGrams(maxMeatGramsPerWeek, preferredMeat);
    }

    /*Constructor*/
    public FlexitarianDiet(int daysD, String purpose, Food[] allowedFood, boolean isVegan, float maxMeatGramsPerWeek, Food preferredMeat){
        this.daysDuration = daysD;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
        giveMeatAndGrams(maxMeatGramsPerWeek, preferredMeat);
    }

}
