package Exam2021;


public class DietManager  {

    public boolean areCompatible(Person person, Diet diet){

        int count = 0;

        for (Food f: person.allergies) {
            for (Food food: diet.allowedFood) {
                    if (f.name.equals(food.name)){
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

    public HypercaloricDiet randomDiet(Person person, Food food){

        return null;
    }



}
