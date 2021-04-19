package Exam2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class DietManagerTest {


    /************************ Requirements 4 ***************************/

    @Test
    public void randomPersonRandomDietTest(){
        Person person = new Person();
        HypercaloricDiet h1 = new HypercaloricDiet(80);
        DietManager dietManager = new DietManager();


        boolean res = dietManager.areCompatible(person, h1);
        if (!res) {
            throw new IllegalArgumentException("This diet is not compatible to this person.");
        }
        assertEquals(true, res);
        System.out.println("Requirement 4.a: " + res + '\n');

    }

    @Test
    public void personAndListOfFoodTest(){
        Person person = new Person();
        Food[] food = new Food[]{
                new Food()
        };
        System.out.println("Requirement 4.a: ");
        DietManager newdiet = new DietManager();

        assertTrue(String.valueOf(newdiet.randomDiet(person, food)), true);

    }


}
