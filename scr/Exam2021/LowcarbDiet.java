package Exam2021;

public class LowcarbDiet extends Diet {

    float minWeightKg;

    /*Constructor that is prefilled without minwWeight method*/
    public LowcarbDiet() {
        daysDuration = 200;
        purpose = "weight lost";
        allowedFood = new Food[]{
                new Food("Chicken", 150, false, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Rice", 300, true, FoodType.Carb),
                new Food("Salmon", 100, false, FoodType.Protein),
                new Food("Bread", 80, true, FoodType.Carb),
                new Food("Cucumber", 20, true, FoodType.Protein),
                new Food("yoghurt", 58, false, FoodType.Fat),
                new Food("vegetarian pie", 340, false, FoodType.Recipe),
                new Food("soup", 220, false, FoodType.Recipe),
                new Food("Soy milk", 30, true, FoodType.Fat)
        };
        isVegan = false;
    }

    /*Constructor that need input of values, and runs method minWeight*/
    public LowcarbDiet(int daysD, String purpose, Food[] allowedFood, boolean isVegan, float checkWeight){
        this.daysDuration = daysD;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
        minWeight(checkWeight);
    }

    /*Checks the persons weight, returns a true or exception. Criteria 2.C and 4.A*/
    public boolean minWeight(float personWeight){
        this.minWeightKg = personWeight;
        if (personWeight > 50){
            return true;
        } else{
            throw new IllegalArgumentException("This person is too underweight to go on this diet.");
        }
    }

}
