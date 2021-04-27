package Exam2021;


import java.util.Arrays;
import java.util.Random;

public class DietManager {

    /*This method is checking if the person is allergic to 50% or more of the food, and running the favoriteFood method to make sure this person i compatible.
    Criteria 2.B and  4.A*/
    public boolean areCompatible(Person person, Diet diet) {
        int count = 0;

        for (Food f : person.allergies) {
            for (Food food : diet.allowedFood) {
                if (f.name == food.name) {
                    count++;
                }
            }
        }
        int dividedAllFoodLen = diet.allowedFood.length / 2;
        if (count >= dividedAllFoodLen) {
            return false;
        } else if (!favoriteFood(person, diet)){
                return false;
        }
        return true;
    }

    /*Making sure The persons favorite food is not vegan and going on a vegan diet. Criteria 2.A and 4.A */
    public boolean favoriteFood(Person person, Diet diet) {
        if (person.favoriteFood.isVegan != true) {
            if (diet.isVegan == true) {
                return false;
            }
        }
        return true;
    }

    /*Something extra that was made, recommending a diet to the person*/
    public String recommendedDiet(Person person){
        String res = "";
        if (person.favoriteFood.isVegan && person.weight > 80){
            res = "I recommend you start on a vegan diet.";
        } else if (!person.favoriteFood.isVegan && person.weight < 50) {
            res = "I recommend you start on a HyperCaloricDiet";
        }else if (!person.favoriteFood.isVegan && person.weight > 80 ){
            res = "I recommend you start on a LowCarbDiet";
        }else {
            res = "I recommend you start on a FlexitarienDiet";
        }
        return res;
    }

    /*This method creates a random Hypercaloric diet with a pre-made person from the Person class and the attributes from the HypercaloricDiet class. Criteria 4.B*/
    public HypercaloricDiet randomDiet(Person person, Food[] food){
        HypercaloricDiet tmpRandomDiet = new HypercaloricDiet(80);

        //i.daysDuration: random number between 1 and 100.
        Random random = new Random();
        int min1 = 1;
        int max1 = 100;
        int res1 = random.nextInt(max1 - min1) + min1;
        tmpRandomDiet.daysDuration = res1;

        //ii.purpose: “Random diet”.
        tmpRandomDiet.purpose = "Random Diet";

        //iii.allowedFood: all the Food from the list that the person is not allergic to.
        tmpRandomDiet.allowedFood = new Food[]{
                new Food("Cod", 82, false, FoodType.Protein),
                new Food("Steak", 270, true, FoodType.Protein),
                new Food("Brown rice", 300, true, FoodType.Carb),
                new Food("Chicken", 239, false, FoodType.Protein),
                new Food("Pork", 242, false, FoodType.Protein),
                new Food("Beans", 347, true, FoodType.Protein),
                new Food("Egg", 155, false, FoodType.Protein),
                new Food("Potatoes", 76, true, FoodType.Carb),
                new Food("Whole grain pasta", 131, false, FoodType.Carb),
                new Food("Whole grain bread", 264, false, FoodType.Carb)
        };
        String foods = "";
        for (int i = 0; i < tmpRandomDiet.allowedFood.length; i++) {
            foods += "Name: " + tmpRandomDiet.allowedFood[i].name + ", "
                   + "Calories per 100g: " + tmpRandomDiet.allowedFood[i].caloriePer100g + ", "
                   + "isVegan: " + tmpRandomDiet.allowedFood[i].isVegan + ", "
                   + "Type: " + tmpRandomDiet.allowedFood[i].type + '\n';
        }

        //iv.isVegan: false if there is some non-vegan Food, true otherwise.
        Boolean isVegan = Boolean.valueOf("");
        for (int i = 0; i < tmpRandomDiet.allowedFood.length; i++) {
            isVegan = tmpRandomDiet.allowedFood[i].isVegan;
        }

        //v.maxWeightKg: random number between Person.weight and Person.weight + 20.
        float min3 = person.getWeight();
        float max3 = person.getWeight() + 20;
        float res3 = (int) (random.nextInt((int) (max3 - min3)) + min3);
        tmpRandomDiet.maxWeighKg = res3;

        //vi.minCaloriesPerDay: random number between 2000 and 4000.
        int min2 = 2000;
        int max2 = 4000;
        int res2 = random.nextInt(max2 - min2) + min2;
        tmpRandomDiet.minCaloriesPerDay = res2;

        /*Given a Person and a list of Food, create a random HypercaloricDiet with the following attributes:*/
        System.out.println("Diets duration: " + res1 + " days" + '\n');
        System.out.println("Diets purpose: " + tmpRandomDiet.purpose + '\n');
        System.out.println("Food list: \n" + foods);
        System.out.println("Diet is: " + isVegan + '\n');
        System.out.println("The max weight of the participant: " + res3 + "kg" + '\n');
        System.out.println("Minimum calories per day: " + res2 + " kcal" + '\n');

        return tmpRandomDiet;
    }
}
