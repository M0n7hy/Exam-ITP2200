package Exam2021;


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
        int res1 = random.nextInt(min1 - max1) + min1;

        int min2 = 2000;
        int max2 = 4000;
        int res2 = random.nextInt(min2 - max2) + min2;

        float min3 = person.weight;
        float max3 = person.weight + 20;
        int res3 = (int) (random.nextInt((int) (min3 - max3)) + min3);


        HypercaloricDiet randomDiet = new HypercaloricDiet();
        randomDiet.daysDuration = res1;
        randomDiet.purpose = "Random Diet";
        randomDiet.allowedFood = food;
        randomDiet.isVegan = false;
        randomDiet.maxWeighKg = res3;
        randomDiet.minCaloriesPerDay = res2;
    }



    public HypercaloricDiet randomDiet(Person person, Food[] food){

        return null;
    }

}
