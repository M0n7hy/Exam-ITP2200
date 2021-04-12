package Exam2021;


import java.util.ArrayList;
import java.util.Arrays;

public class DietManager  {

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
        return false;
    }

    public HypercaloricDiet randomDiet(Person person, Food food){

        return null;
    }





}
