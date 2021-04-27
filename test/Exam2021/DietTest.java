package Exam2021;

import org.junit.Test;

import static org.junit.Assert.*;

public class DietTest {


    /********************************* Requirements 1 *********************************/

    /*Requirement 1.A pass, Unit testing*/
    @Test
    public void isVeganIsNotVeganPass(){
        FlexitarianDiet F1 = new FlexitarianDiet(2, "Loss weight", new Food[]{
                new Food("Almond", 90, true, FoodType.Fat),
                new Food("Milk", 80, false, FoodType.Fat),
                new Food("Oat milk", 44, true, FoodType.Fat),
                new Food("Seaweed", 20, true, FoodType.Protein),
                new Food("peanut", 140, true, FoodType.Fat)
        }, false, 400, new Food("Pig", 200, false, FoodType.Protein));

         assertTrue(F1.isVeganIsNotVegan() == true); /*If assertTrue(!F1.isVeganIsNotVegan()) the test will not pass, cause then we expect a return of false*/
    }

    /*Requirement 1.A Fail (Throw a exception), Unit testing*/
    @Test
    public void isVeganIsNotVeganFail(){
        HypercaloricDiet h1 = new HypercaloricDiet(80, true);

        try {
            assertTrue(h1.isVeganIsNotVegan());
        } catch (IllegalArgumentException ex) {
            assertEquals("This diet can not be considered vegan.", ex.getMessage());
            System.out.println("Requirement 1.a(fail): " + ex.getMessage() + '\n');
        }
    }

    /*Requirement 1.B pass, Unit testing*/
    @Test
    public void isVeganIsNotVeganTwoPass(){
        VeganDiet v1 = new VeganDiet(200, "Vegan", new Food[]{
                new Food("Tofu", 100, true, FoodType.Protein),
                new Food("Almond", 50, true, FoodType.Fat)
        },true ,88);

            assertTrue(v1.isVeganIsNotVegan() == true); /*This can be simplified by removing (== true), but its there to show that we are excepting a return of true*/
    }

    /*Requirement 1.B Fail (Throw a exception), Unit testing*/
    @Test
    public void isVeganIsNotVeganTwoFail(){
        VeganDiet v1 = new VeganDiet(200, "Vegan", new Food[]{new Food("Tofu", 100, true, FoodType.Protein), new Food("Almond", 50, true, FoodType.Fat)},false ,88);

        try {
            assertTrue(v1.isVeganIsNotVegan());
        } catch (IllegalArgumentException ex) {
            assertEquals("This is considered a vegan Diet!", ex.getMessage());
            System.out.println("Requirement 1.b(fail): " + ex.getMessage() + '\n');
        }
    }

    /*Requirement 1.C pass, Unit testing*/
    @Test
    public void isVeganPass(){
        VeganDiet v1 = new VeganDiet(200, "Vegan", new Food[]{
                new Food("Tofu", 150, true, FoodType.Protein),
                new Food("Almond", 200, true, FoodType.Recipe),
                new Food("Oat milk", 300, true, FoodType.Carb),
                new Food("Lentils", 120, true, FoodType.Protein)}, true, 60);

         assertTrue(v1.isVegan());
    }

    /*Requirement 1.C Fail (Throw a exception), Unit testing*/
    @Test
    public void isVeganFail(){
        VeganDiet v1 = new VeganDiet(200, "Vegan", new Food[]{
                new Food("Tofu", 150, true, FoodType.Protein),
                new Food("Beef", 200, false, FoodType.Recipe),
                new Food("Oat milk", 300, true, FoodType.Carb),
                new Food("Lentils", 120, true, FoodType.Protein)
        }, true, 60);

        try {
            if (!v1.isVegan()); {
                throw new IllegalArgumentException("There cant be any non-vegan food in a vegan diet.");
            }
        } catch (IllegalArgumentException ex) {
            assertEquals("There cant be any non-vegan food in a vegan diet.", ex.getMessage());
            System.out.println("Requirement 1.c(fail): " + ex.getMessage() + '\n');
        }
    }

    /*Requirement 1.D Pass, Unit testing*/
    @Test
    public void preferMeatInFlexPass(){
        FlexitarianDiet f1 = new FlexitarianDiet();

        assertTrue( f1.giveMeat(500, new Food("Ham", 200, false, FoodType.Protein)));
    }

    /*Requirement 1.D Fail (Throw a exception), Unit testing*/
    @Test
    public void preferMeatInFlexFail() {
        FlexitarianDiet f1 = new FlexitarianDiet();

        try {
        f1.giveMeat(500, new Food("Tofu", 200, true, FoodType.Protein));
        } catch (IllegalArgumentException ex) {
            assertEquals("The preferred meat must be non-vegan FlexitarianDiet.", ex.getMessage());
            System.out.println("Requirement 1.d(fail): " + ex.getMessage() + '\n');
        }
    }

    /*Requirement 1.E Pass, Unit testing*/
    @Test
    public void onlyTwoCarbPass(){
        LowcarbDiet L1 = new LowcarbDiet();
        L1.noMoreThenTwoCarb();

        assertTrue((L1.noMoreThenTwoCarb()));
    }

    /*Requirement 1.E Fail (Throw a exception), Unit testing*/
    @Test
    public void onlyTwoCarbFail(){
        LowcarbDiet L1 = new LowcarbDiet(200, "Lose weight",
                new Food[]{
                        new Food("Pasta", 150, true, FoodType.Carb),
                        new Food("Bread", 200, true, FoodType.Carb),
                        new Food("Rice", 300, true, FoodType.Carb)
                }, false, 80);

        try {
            L1.noMoreThenTwoCarb();
        } catch (IllegalArgumentException ex) {
            assertEquals("There can't be more then 2 Carb types in LowCarbDiet.", ex.getMessage());
            System.out.println("Requirement 1.e(fail): " + ex.getMessage() + '\n');
        }
    }


    /*********************** Requirements 3 ********************************/

    /*Requirement 3.A Pass, Unit testing*/
    @Test
    public void durationTest(){
        LowcarbDiet low = new LowcarbDiet();
        low.dietDuration("Vegan Diet", new Date(2019,2,24),new Date(2020, 8, 29));

        HypercaloricDiet hyper = new HypercaloricDiet();
        hyper.dietDuration("Hypercaloric Diet", new Date(2020, 4, 10), new Date(2020, 10, 27));

        VeganDiet vegan = new VeganDiet();
        vegan.dietDuration("Vegan Diet", new Date(2012, 12, 10), new Date(2013, 6, 28));

        FlexitarianDiet flex = new FlexitarianDiet();
        flex.dietDuration("Flexitarian Diet", new Date(2021, 4, 14), new Date(2021, 9, 11));

        String resLow = low.writeDuration();
        String resHyper = hyper.writeDuration();
        String resVegan = vegan.writeDuration();
        String resFlex = flex.writeDuration();

        assertEquals("Vegan Diet lasts for 1 years, 6 months and 5 days.", resLow);
        assertEquals("Hypercaloric Diet lasts for 0 years, 6 months and 17 days.", resHyper);
        assertEquals("Vegan Diet lasts for 0 years, 6 months and 18 days.",resVegan);
        assertEquals("Flexitarian Diet lasts for 0 years, 4 months and 28 days.", resFlex);

    }

    /*Requirement 3.B Pass, Unit testing*/
    @Test
    public void allowedFoodTest() {

        FlexitarianDiet flex = new FlexitarianDiet();
        flex.dietName("Flexitarian Diet");

        VeganDiet vegan = new VeganDiet();
        vegan.dietName("Vegan Diet");

        HypercaloricDiet hyper = new HypercaloricDiet();
        hyper.dietName("Hypercaloric Diet");

        LowcarbDiet lovC = new LowcarbDiet();
        lovC.dietName("Lowcarb Diet");

        String resFlex = flex.writeAllowedFood();
        String resVegan = vegan.writeAllowedFood();
        String resHyper = hyper.writeAllowedFood();
        String resLowCarb = lovC.writeAllowedFood();

        assertEquals("The following food is allowed in the Flexitarian Diet: Rice, Salad, Salmon, Cod, Bread, Potato, Tomato, Soup, Apple, Strawberry,", resFlex);
        assertEquals("The following food is allowed in the Vegan Diet: Tofu, Salad, Rice, Lentils, Bread, Almond, Oat milk, Seaweed, Vegan burrito, peanut," ,resVegan);
        assertEquals("The following food is allowed in the Hypercaloric Diet: Chicken, Salad, Rice, Salmon, Bread, Steak, Lasagne, Cheese, Milk, Taco,", resHyper);
        assertEquals("The following food is allowed in the Lowcarb Diet: Chicken, Salad, Rice, Salmon, Bread, Cucumber, yoghurt, vegetarian pie, soup, Soy milk,", resLowCarb);

    }
}





