package Exam2021;

public class FlexitarianDiet extends Diet {

    float maxMeatGramsPerWeek;
    Food preferredMeat;


    /*public FlexitarianDiet() {
        Diet();
    }
     */

    /*
    @Override
    void Diet() {
        daysDuration = 150;
        purpose = "Keep in shape";
        allowedFood = new Food[]{
                //1d.The preferred meat in a FlexitarianDiet MUST be non-vegan food of protein type.
                new Food("Rice", 130, true, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                //1d.The preferred meat in a FlexitarianDiet MUST be non-vegan food of protein type.
                new Food("Salmon", 100, false, FoodType.Protein),
                //1d.The preferred meat in a FlexitarianDiet MUST be non-vegan food of protein type.
                new Food("Cod", 82, false, FoodType.Protein),
                new Food("Bread", 80, true, FoodType.Carb),
                new Food("Potato", 76, true, FoodType.Carb),
                new Food("Tomato", 18, true, FoodType.Carb),
                new Food("Soup", 68, true, FoodType.Carb),
                new Food("Apple", 52, true, FoodType.Carb),
                new Food("Strawberry", 33, true, FoodType.Carb)

        };
        //isVegan = false;
    }
    */


    public FlexitarianDiet() {
        daysDuration = 150;
        purpose = "Keep in shape";
        allowedFood = new Food[]{
                //1d.The preferred meat in a FlexitarianDiet MUST be non-vegan food of protein type.
                new Food("Rice", 130, true, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                //1d.The preferred meat in a FlexitarianDiet MUST be non-vegan food of protein type.
                new Food("Salmon", 100, false, FoodType.Protein),
                //1d.The preferred meat in a FlexitarianDiet MUST be non-vegan food of protein type.
                new Food("Cod", 82, false, FoodType.Protein),
                new Food("Bread", 80, true, FoodType.Carb),
                new Food("Potato", 76, true, FoodType.Carb),
                new Food("Tomato", 18, true, FoodType.Carb),
                new Food("Soup", 68, true, FoodType.Carb),
                new Food("Apple", 52, true, FoodType.Carb),
                new Food("Strawberry", 33, true, FoodType.Carb)

        };
    }

    public FlexitarianDiet(String name,Food[] allowedFood){
        this.name = name;
        this.allowedFood = allowedFood;
    }
}
