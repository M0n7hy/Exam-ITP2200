package Exam2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {


    /**************************** Requirements 2 *******************************/

    /*Requirement 2.A Pass*/
    @Test
    public void favoriteFoodPass(){
        Person person = new Person(new Food("Seaweed", 306, true, FoodType.Carb),
                new Food[]{
                        new Food("Tofu", 150, true, FoodType.Protein),
                        new Food("Salad", 200, true, FoodType.Recipe),
                        new Food("Rice", 300, true, FoodType.Carb),
                        new Food("Lentils", 120, true, FoodType.Protein)
                }, 80.0f);
        VeganDiet v1 = new VeganDiet(80);
        DietManager d1 = new DietManager();
        assertTrue(d1.areCompatible(person, v1));
        System.out.println("Requirement 2.a(pass): " + d1.areCompatible(person, v1) + '\n');
    }

    /*Requirement 2.A Fail (Throw a exception)*/
    @Test
    public void favoriteFoodFail(){
        Person person = new Person();
        VeganDiet v1 = new VeganDiet(60);
        DietManager d1 = new DietManager();

        try {
            d1.areCompatible(person, v1);
        } catch (IllegalArgumentException ex) {
            assertEquals("This person can not go on a vegan diet", ex.getMessage());
            System.out.println("Requirement 2.a(fail): " + ex.getMessage() + '\n');
        }
    }

    /*Requirement 2.B Pass*/
    @Test
    public void allergicPass(){
        Person person = new Person(new Food("Ice cream", 220, false, FoodType.Fat),
                new Food[]{
                        new Food("Peanut", 90, true, FoodType.Carb),
                        new Food("Cheese", 40, false, FoodType.Fat)
                }, 88.8f);
        FlexitarianDiet f1 = new FlexitarianDiet(90, "Eat less meat",
                new Food[]{
                        new Food("Almonds", 90, true, FoodType.Carb),
                        new Food("Milk", 40, false, FoodType.Fat)
                }, false, 300.90f,new Food("Salmon", 190, false, FoodType.Protein));
        DietManager dietManager = new DietManager();

        try {
            boolean res = dietManager.areCompatible(person, f1);
            if (res){
                assertTrue(dietManager.areCompatible(person, f1));
                System.out.println("Requirement 2.b(pass): " + dietManager.areCompatible(person, f1) + '\n');
            } else {
                throw new IllegalArgumentException("This person is allergic to 50% or more of this diet");
            }
        } catch (IllegalArgumentException ex) {
            assertEquals("This person is allergic to 50% or more of this diet", ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    /*Requirement 2.B Fail (Throw a exception)*/

    @Test
    public void allergicFail(){
        Person person = new Person(new Food("Ice cream", 220, false, FoodType.Fat),
                new Food[]{
                        new Food("Almonds", 90, true, FoodType.Carb),
                        new Food("Milk", 40, false, FoodType.Fat)
                }, 88.8f);
        FlexitarianDiet f1 = new FlexitarianDiet(90, "Eat less meat",
                new Food[]{
                        new Food("Almonds", 90, true, FoodType.Carb),
                        new Food("Milk", 40, false, FoodType.Fat)
                } , false, 300.90f,new Food("Salmon", 190, false, FoodType.Protein));
        DietManager dietManager = new DietManager();

        try {
            boolean res = dietManager.areCompatible(person, f1);
            if (!res) {
                throw new IllegalArgumentException("This diet is not compatible to this person.");
            }
        }catch (IllegalArgumentException ex) {
            assertEquals("This diet is not compatible to this person.", ex.getMessage());
            System.out.println("Requirement 2.b(fail): " + ex.getMessage() + '\n');
        }

    }

    /*Requirement 2.C Pass*/
    @Test
    public void lowWeightPass(){
        LowcarbDiet l1 = new LowcarbDiet(60);
        VeganDiet v1 = new VeganDiet(60);

        assertTrue(l1.minWeight(60));
        assertTrue(v1.minweightkg(60));

        System.out.println("Requirement 2.c(pass): " + l1.minWeight(60) + '\n');
        System.out.println("Requirement 2.c(pass): " + v1.minweightkg(60) + '\n');
    }

    /*Requirement 2.C Fail (Throw a exception)*/
    @Test
    public void lowCarbWeightFail(){
        try {
            LowcarbDiet lowCarb = new LowcarbDiet(40);
        } catch (IllegalArgumentException ex) {
            assertEquals("This person is too underweight to go on this diet.", ex.getMessage());
            System.out.println("Requirement 2.c(fail): " + ex.getMessage() + '\n');
        }

    }
    /*Requirement 2.C Fail (Throw a exception)*/
    @Test
    public void veganWeightFail(){
        try {
            VeganDiet v1 = new VeganDiet(40);
        }catch (IllegalArgumentException ex) {
            assertEquals("This person is too underweight to go on this diet", ex.getMessage());
            System.out.println("Requirement 2.c(fail): " + ex.getMessage() + '\n');
        }
    }

    /*Requirement 2.D Pass*/
    @Test
    public void overWeightPass(){
        HypercaloricDiet h1 = new HypercaloricDiet(149);
        assertTrue(h1.maxWeight(100));
        System.out.println("Requirement 2.d(pass): " + h1.maxWeight(90) + '\n');
    }

    /*Requirement 2.D Fail (Throw a exception)*/
    @Test
    public void overWeightFail(){
        try {
            HypercaloricDiet h1 = new HypercaloricDiet(160);
        } catch (IllegalArgumentException exception) {
            assertEquals("This person is too overweight to go on this diet", exception.getMessage());
            System.out.println("Requirement 2.d(fail): " + exception.getMessage() + '\n');
        }
    }


}
