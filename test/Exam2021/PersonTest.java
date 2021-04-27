package Exam2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {


    /**************************** Requirements 2 *******************************/

    /*Requirement 2.A Pass, Integration Testing */
    @Test
    public void favoriteFoodPass(){
        Person person = new Person(new Food("Seaweed", 306, true, FoodType.Carb),
                new Food[]{
                        new Food("Tofu", 150, true, FoodType.Protein),
                        new Food("Salad", 200, true, FoodType.Recipe),
                        new Food("Rice", 300, true, FoodType.Carb),
                        new Food("Lentils", 120, true, FoodType.Protein)
                }, 80.0f);

        VeganDiet v1 = new VeganDiet();
        DietManager d1 = new DietManager();

        assertTrue(d1.favoriteFood(person, v1));
    }

    /*Requirement 2.A Fail, (Throw a exception), Integration Testing */
    @Test
    public void favoriteFoodFail(){
        Person person = new Person();
        VeganDiet v1 = new VeganDiet();
        DietManager d1 = new DietManager();

        boolean res = d1.favoriteFood(person, v1);

        try {
            if (!res) {
                throw new IllegalArgumentException("This person favorite food is not vegan, and can not go on a vegan diet.");
            }
        } catch (IllegalArgumentException ex){
            assertEquals("This person favorite food is not vegan, and can not go on a vegan diet.", ex.getMessage());
            System.out.println("Requirement 2.a(fail): " + ex.getMessage() + '\n');
        }

    }

    /*Requirement 2.B Pass, Integration Testing*/
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

        assertTrue(dietManager.areCompatible(person, f1));
    }

    /*Requirement 2.B Fail (Throw a exception), Integration Testing*/
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

    /*Requirement 2.C Pass, Unit testing*/
    @Test
    public void lowWeightPass(){
        LowcarbDiet l1 = new LowcarbDiet();
        VeganDiet v1 = new VeganDiet();

        assertTrue(l1.minWeight(60));
        assertTrue(v1.minWeightKg(60));
    }

    /*Requirement 2.C Fail (Throw a exception), Unit testing*/
    @Test
    public void lowCarbWeightFail(){
        LowcarbDiet lowCarb = new LowcarbDiet();

        try {
            lowCarb.minWeight(40);
        } catch (IllegalArgumentException ex) {
            assertEquals("This person is too underweight to go on this diet.", ex.getMessage());
            System.out.println("Requirement 2.c(fail): " + ex.getMessage() + '\n');
        }
    }

    /*Requirement 2.C Fail (Throw a exception), Unit testing*/
    @Test
    public void veganWeightFail(){
        VeganDiet v1 = new VeganDiet();

        try {
            v1.minWeightKg(40);
        } catch (IllegalArgumentException ex) {
            assertEquals("This person is too underweight to go on this diet", ex.getMessage());
            System.out.println("Requirement 2.c(fail): " + ex.getMessage() + '\n');
        }
    }

    /*Requirement 2.D Pass, Unit testing*/
    @Test
    public void overWeightPass(){
        HypercaloricDiet h1 = new HypercaloricDiet();
        assertTrue(h1.maxWeight(100));
    }

    /*Requirement 2.D Fail (Throw a exception), Unit testing*/
    @Test
    public void overWeightFail(){
            HypercaloricDiet h1 = new HypercaloricDiet();

        try {
           h1.maxWeight(160);
        } catch (IllegalArgumentException exception) {
            assertEquals("This person is too overweight to go on this diet", exception.getMessage());
            System.out.println("Requirement 2.d(fail): " + exception.getMessage() + '\n');
        }
    }


}
