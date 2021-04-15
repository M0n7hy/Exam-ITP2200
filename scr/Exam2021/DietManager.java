package Exam2021;


import java.util.Random;

public class DietManager {

    public boolean areCompatible(Person person, Diet diet){
        return false;
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


        HypercaloricDiet randomDiet = new HypercaloricDiet();
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


        HypercaloricDiet randomDiet = new HypercaloricDiet();
        randomDiet.daysDuration = res1;
        randomDiet.purpose = "Random Diet";
        randomDiet.allowedFood = food;
        randomDiet.isVegan = false;
        randomDiet.maxWeighKg = res3;
        randomDiet.minCaloriesPerDay = res2;

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        return null;
    }
}
