package Exam2021;

public class VeganDiet extends Diet {

    Float minWeightKg;

    public void minweightkg(float personsWeight){
            this.minWeightKg = personsWeight;
            if (personsWeight > 50){
              return;
            } else {
                throw new IllegalArgumentException("This person is too underweight to go on this diet");
            }
    }



    public VeganDiet(float checkWeight){
            daysDuration = 200;
            purpose = "Not Eating meat.";
            allowedFood = new Food[]{
                    new Food("Tofu", 150, true, FoodType.Protein),
                    new Food("Salad", 200, true, FoodType.Recipe),
                    new Food("Rice", 300, true, FoodType.Carb),
                    new Food("Lentils", 120, true, FoodType.Protein),
                    new Food("Bread", 80, true, FoodType.Carb),
                    new Food("Nuts",22, true, FoodType.Carb)
            };
            isVegan = true;
            minweightkg(checkWeight);
    }

    public VeganDiet(int daysD, String purpose, Food[] allowedFood, boolean isVegan, float checkWeight){
        this.daysDuration = daysD;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
        minweightkg(checkWeight);
    }


}
