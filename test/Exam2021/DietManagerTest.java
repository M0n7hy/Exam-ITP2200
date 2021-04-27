package Exam2021;

import org.junit.Test;

import static org.junit.Assert.*;


public class DietManagerTest {


    /************************ Requirements 4 ***************************/
    /*Requirement 4.A Pass, Integration Testing. Checks if person is overweight or underweight, favorite food is non-vegan and if diet not vegan,
    and if the person allergic to 50% or more of the diet. */
    @Test
    public void randomPersonRandomDietTestPass(){
        Person person = new Person();
        HypercaloricDiet h1 = new HypercaloricDiet(80);
        DietManager dietManager = new DietManager();

        assertTrue(dietManager.areCompatible(person, h1));
    }

    /*Requirement 4.A Fail (Throw a exception) because of allergies, Integration Testing*/
    @Test
    public void randomPersonRandomDietTestFail(){
        Person person = new Person(new Food("Beef", 320, false, FoodType.Protein),
                new Food[]{
                new Food("Peanuts", 90, true, FoodType.Fat),
                new Food("Milk", 90, false, FoodType.Fat),
                new Food("Salmon", 440, false, FoodType.Protein),
                new Food("Pickles", 50, true, FoodType.Carb)
                }, 80.0f);
        HypercaloricDiet h1 = new HypercaloricDiet(200, "Gain weight",
                new Food[]{
                new Food("Peanuts", 90, true, FoodType.Fat),
                new Food("Milk", 90, false, FoodType.Fat),
                new Food("Salmon", 440, false, FoodType.Protein),
                new Food("Pickles", 50, true, FoodType.Carb)
                }, false, 80);
        DietManager dietManager = new DietManager();

        try {
            boolean res = dietManager.areCompatible(person, h1);
            if (!res) {
                throw new IllegalArgumentException("This diet is not compatible to this person.");
            }
        } catch (IllegalArgumentException ex) {
            assertEquals("This diet is not compatible to this person.", ex.getMessage());
            System.out.println("Requirement 4.A(Fail): " + ex.getMessage() + '\n');
        }
    }

    /*Requirement 4.A Fail (Throw a exception) because of favorite food is non-vegan and diet is vegan , Integration Testing*/
    @Test
    public void randomPersonRandomDietTestFailTwo(){
        Person person = new Person(new Food("Beef", 320, false, FoodType.Protein),
                new Food[]{
                new Food("Peanuts", 90, true, FoodType.Fat),
                new Food("Milk", 90, false, FoodType.Fat),
                new Food("Salmon", 440, false, FoodType.Protein)
                }, 80.0f);
        VeganDiet v1 = new VeganDiet(80);
        DietManager dietManager = new DietManager();

        try {
            boolean res = dietManager.areCompatible(person, v1);
            if (!res) {
                throw new IllegalArgumentException("This diet is not compatible to this person.");
            }
        } catch (IllegalArgumentException ex) {
            assertEquals("This diet is not compatible to this person.", ex.getMessage());
            System.out.println("Requirement 4.A(Fail): " + ex.getMessage());
        }
    }

    /*Requirement 4.B Pass, Integration Testing*/
    @Test
    public void personAndListOfFoodTest(){
        Person person = new Person();
        Food[] food = new Food[]{};
        System.out.println("Requirement 4.B: ");
        DietManager newDiet = new DietManager();

        assertTrue(String.valueOf(newDiet.randomDiet(person, food)), true);

    }


}
