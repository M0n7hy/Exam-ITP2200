package Exam2021;


import java.util.Arrays;
import java.util.Random;

public class DietManager {


    public boolean areCompatible(Person person, Diet diet){

        int count = 0;

        for (Food f: person.allergies) {
            for (Food food: diet.allowedFood) {
                if (f.name == food.name){
                    count++;
                }
            }

        }
        int dividedAllFoodLen = diet.allowedFood.length/2;
        if (count >= dividedAllFoodLen){
            return false;
        }else {
            return true;
        }



    }

    public void HypercaloricDiet(Person person, Food[] food) {

        Random random = new Random();
        int min1 = 1;
        int max1 = 100;
        int res1 = random.nextInt(max1 - min1) + min1;

        int min2 = 2000;
        int max2 = 4000;
        int res2 = random.nextInt(max2 - min2) + min2;

        float min3 = person.getWeight();
        float max3 = person.getWeight() + 20;
        float res3 = (int) (random.nextInt((int) (max3 - min3)) + min3);


        HypercaloricDiet randomDiet = new HypercaloricDiet(80);
        randomDiet.daysDuration = res1;
        randomDiet.purpose = "Random Diet";
        randomDiet.allowedFood = food;
        randomDiet.isVegan = false;
        randomDiet.maxWeighKg = res3;
        randomDiet.minCaloriesPerDay = res2;

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }



    public HypercaloricDiet randomDiet(Person person, Food[] food){
        //daysDuration: random number between 1 and 100.
        Random random = new Random();
        int min1 = 1;
        int max1 = 100;
        int res1 = random.nextInt(max1 - min1) + min1;

        //minCaloriesPerDay: random number between 2000 and 4000.
        int min2 = 2000;
        int max2 = 4000;
        int res2 = random.nextInt(max2 - min2) + min2;

        //maxWeightKg: random number between Person.weight and Person.weight + 20.
        float min3 = person.getWeight();
        float max3 = person.getWeight() + 20;
        float res3 = (int) (random.nextInt((int) (max3 - min3)) + min3);






        HypercaloricDiet tmpRandomDiet = new HypercaloricDiet(80);

        tmpRandomDiet.allowedFood = new Food[]{
                new Food("Cod", 82, false, FoodType.Protein),
                new Food("Steak", 270, false, FoodType.Protein),

        };
        //daysDuration: random number between 1 and 100.
        tmpRandomDiet.daysDuration = res1;
        tmpRandomDiet.purpose = "Random Diet";
        tmpRandomDiet.allowedFood = food;/*sikkert ikke riktig*/

        //maxWeightKg: random number between Person.weight and Person.weight + 20.
        tmpRandomDiet.maxWeighKg = res3;
        //minCaloriesPerDay: random number between 2000 and 4000.
        tmpRandomDiet.minCaloriesPerDay = res2;


        System.out.println(res1);
        System.out.println(tmpRandomDiet.purpose);
        System.out.println(Arrays.toString(tmpRandomDiet.allowedFood));
        System.out.println(res3);
        System.out.println(res2);

        return tmpRandomDiet;
    }
}
