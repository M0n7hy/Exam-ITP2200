package Exam2021;

public class VeganDiet extends Diet {

    Float minWeightKg;

    /*Constructor that is prefilled without minWeightKg method*/
    public VeganDiet(){
            daysDuration = 200;
            purpose = "Not Eating meat.";
            allowedFood = new Food[]{
                    new Food("Tofu", 150, true, FoodType.Protein),
                    new Food("Salad", 200, true, FoodType.Recipe),
                    new Food("Rice", 300, true, FoodType.Carb),
                    new Food("Lentils", 120, true, FoodType.Protein),
                    new Food("Bread", 80, true, FoodType.Carb),
                    new Food("Almond",22, true, FoodType.Carb),
                    new Food("Oat milk", 44, true, FoodType.Fat),
                    new Food("Seaweed",20 ,true,FoodType.Protein),
                    new Food("Vegan burrito", 390, true, FoodType.Recipe),
                    new Food("peanut", 140, true, FoodType.Fat)
            };
            isVegan = true;
    }

    /*Constructor that is prefilled, but with method minWeightKg that needs input of values. */
    public VeganDiet(float checkWeight){
        daysDuration = 200;
        purpose = "Not Eating meat.";
        allowedFood = new Food[]{
                new Food("Tofu", 150, true, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Rice", 300, true, FoodType.Carb),
                new Food("Lentils", 120, true, FoodType.Protein),
                new Food("Bread", 80, true, FoodType.Carb),
                new Food("Almond",22, true, FoodType.Carb),
                new Food("Oat milk", 44, true, FoodType.Fat),
                new Food("Seaweed",20 ,true,FoodType.Protein),
                new Food("Vegan burrito", 390, true, FoodType.Recipe),
                new Food("peanut", 140, true, FoodType.Fat)
        };
        isVegan = true;
        minWeightKg(checkWeight);
    }

    /*Constructor that needs input of values, and runs method minWeightKg*/
    public VeganDiet(int daysD, String purpose, Food[] allowedFood, boolean isVegan, float checkWeight){
        this.daysDuration = daysD;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
        minWeightKg(checkWeight);
    }

    /*Checks the persons weight, returns a true or exception. Criteria 2.C and 4.A*/
    public boolean minWeightKg(float personsWeight){
        this.minWeightKg = personsWeight;
        if (personsWeight > 50){
            return true;
        } else {
            throw new IllegalArgumentException("This person is too underweight to go on this diet");
        }
    }

}
