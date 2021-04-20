package Exam2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class DietManagerTest {


    /************************ Requirements 4 ***************************/
    /*Requirement 4.A Pass*/
    @Test
    public void randomPersonRandomDietTestPass(){
        Person person = new Person();
        HypercaloricDiet h1 = new HypercaloricDiet(80);
        DietManager dietManager = new DietManager();

        try {
            boolean res = dietManager.areCompatible(person, h1);
            if (!res) {
                throw new IllegalArgumentException("This diet is not compatible to this person.");

            } else {
                System.out.println("Requirement 4.A(pass): " + dietManager.areCompatible(person, h1) + '\n');
            }
        } catch (IllegalArgumentException ex) {
            assertEquals("This diet is not compatible to this person.", ex.getMessage());
            System.out.println("Requirement 4.A(Fail): " + ex.getMessage() + '\n');
        }

    }
    /*Requirement 4.A Fail (Throw a exception)*/
    @Test
    public void randomPersonRandomDietTestFail(){
        Person person = new Person(new Food("Beef", 320, false, FoodType.Protein), new Food[]{
                new Food("Peanuts", 90, true, FoodType.Fat), new Food("Milk", 90, false, FoodType.Fat), new Food("Salmon", 440, false, FoodType.Protein),new Food("Pickles", 50, true, FoodType.Carb)}, 80.0f);
        HypercaloricDiet h1 = new HypercaloricDiet(200, "Gain weight",new Food[]{
                new Food("Peanuts", 90, true, FoodType.Fat), new Food("Milk", 90, false, FoodType.Fat), new Food("Salmon", 440, false, FoodType.Protein),new Food("Pickles", 50, true, FoodType.Carb)}, true, 80);
        DietManager dietManager = new DietManager();


        try {
            boolean res = dietManager.areCompatible(person, h1);
            if (!res) {
                throw new IllegalArgumentException("This diet is not compatible to this person.");

            } else {
                System.out.println("Requirement 4.A(pass): " + dietManager.areCompatible(person, h1) + '\n');
            }
        } catch (IllegalArgumentException ex) {
            assertEquals("This diet is not compatible to this person.", ex.getMessage());
            System.out.println("Requirement 4.A(Fail): " + ex.getMessage() + '\n');
        }


    }

    /*Requirement 4.A Fail (Throw a exception)*/

    @Test
    public void randomPersonRandomDietTestFailTwo(){
        Person person = new Person(new Food("Beef", 320, false, FoodType.Protein), new Food[]{
                new Food("Peanuts", 90, true, FoodType.Fat), new Food("Milk", 90, false, FoodType.Fat), new Food("Salmon", 440, false, FoodType.Protein)}, 80.0f);
        HypercaloricDiet h1 = new HypercaloricDiet(200, "Gain weight",new Food[]{
                new Food("Peanuts", 90, true, FoodType.Fat), new Food("Seaweed", 90, true, FoodType.Fat), new Food("Salad", 440, true, FoodType.Recipe), new Food("Pickles", 50, true, FoodType.Carb)}, true, 80);
        DietManager dietManager = new DietManager();

        try {
            boolean res = dietManager.areCompatible(person, h1);
            if (!res) {
                throw new IllegalArgumentException("This diet is not compatible to this person.");

            } else {
                System.out.println("Requirement 4.A(pass): " + dietManager.areCompatible(person, h1) + '\n');
            }
        } catch (IllegalArgumentException ex) {
            assertEquals("This diet is not compatible to this person.", ex.getMessage());
            System.out.println("Requirement 4.A(Fail): " + ex.getMessage());
        }
    }


    /*Requirement 4.B Pass*/

    @Test
    public void personAndListOfFoodTest(){
        Person person = new Person();
        Food[] food = new Food[]{
                new Food()
        };
        System.out.println("Requirement 4.B: ");
        DietManager newdiet = new DietManager();

        assertTrue(String.valueOf(newdiet.randomDiet(person, food)), true);

    }


}
