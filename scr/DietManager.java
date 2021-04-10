import java.util.ArrayList;

public class DietManager extends Diet{
    public static void main(String[] args) {
        System.out.println("Hello world");

    }


    public boolean areCompatible(Person person, Diet diet){
        return false;
    }

    public HypercaloricDiet randomDiet(Person person, Food food){
        HypercaloricDiet hyperDiet = new HypercaloricDiet();
        hyperDiet.daysDuration = 63;
        hyperDiet.purpose = "Random diet";
        hyperDiet.isVegan = true;
        hyperDiet.maxWeightKg = 103;
        hyperDiet.minCaloriesPerDay = 3500;
        return null;
    }


    public void randomDiet() {
        Person p = new Person();
        ArrayList<Food> food = new ArrayList<>();
    }
}
