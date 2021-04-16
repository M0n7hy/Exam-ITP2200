package Exam2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DietTest {





    /********************************* Requirements 1 *********************************/

    /*Requirement 1.A pass*/
    @Test
    public void isVeganIsNotVegan2(){
        FlexitarianDiet F1 = new FlexitarianDiet();
        F1.isVeganIsNotVegan();
    }

    /*Requirement 1.A Fail*/



    /*Requirement 1.B pass*/

    @Test
    public void isVeganIsNotVegan(){
        VeganDiet vegan = new VeganDiet(200, "Vegan", new Food[]{new Food("Tofu", 100, true, FoodType.Protein), new Food("Almond", 50, true, FoodType.Fat)},true ,88);
        vegan.isVeganIsNotVegan();

    }

    /*Requirement 1.B Fail*/


    @Test
    public void isVegan(){
        VeganDiet vegan = new VeganDiet(200, "Vegan", new Food[]{
                new Food("Tofu", 150, true, FoodType.Protein),
                new Food("Almond", 200, true, FoodType.Recipe),
                new Food("Oat milk", 300, true, FoodType.Carb),
                new Food("Lentils", 120, true, FoodType.Protein)}, true, 60);

        vegan.isVegan();

    }


    /*Requirement 1.E Fail (Throw a exception)*/
    @Test
    public void onlyTwoCarbFail(){
        LowcarbDiet L1 = new LowcarbDiet(200, "Lose weight",
                new Food[]
                        {new Food("Pasta", 150, true, FoodType.Carb),
                        new Food("Bread", 200, true, FoodType.Carb),
                        new Food("Rice", 300, true, FoodType.Carb)}, false, 80);

        L1.noMoreThenTwoCarb();
    }

    /*Requirement 1.E Pass*/

    @Test
    public void onlyTwoCarbPass(){
        LowcarbDiet L1 = new LowcarbDiet(70);
        L1.noMoreThenTwoCarb();
    }



    /**************************** Requirements 2 *******************************/

    @Test
    public void favoritFoodPass(){
        Person person = new Person(new Food("Seaweed", 306, true, FoodType.Carb),
                new Food[]{ new Food("Tofu", 150, true, FoodType.Protein),
                        new Food("Salad", 200, true, FoodType.Recipe),
                        new Food("Rice", 300, true, FoodType.Carb),
                        new Food("Lentils", 120, true, FoodType.Protein)}, 80.0f);
        VeganDiet v1 = new VeganDiet(80);
        DietManager d1 = new DietManager();
        d1.areCompatible(person, v1);
    }


    @Test
    public void favoritFoodFail(){
        Person person = new Person();
        HypercaloricDiet h1 = new HypercaloricDiet(80);
        DietManager d1 = new DietManager();

        d1.areCompatible(person, h1);
    }

    @Test
    public void lowWeightPass(){
        LowcarbDiet lowCarb = new LowcarbDiet(60);
        VeganDiet v1 = new VeganDiet(60);
    }

    @Test
    public void lowWeightFail(){
        LowcarbDiet lowCarb = new LowcarbDiet(40);
    }
    @Test
    public void lowWeightFail2(){
        VeganDiet v1 = new VeganDiet(40);
    }


    @Test
    public void overWeightPass(){
        HypercaloricDiet h1 = new HypercaloricDiet(149);
    }

    @Test
    public void overWeightFail(){
        HypercaloricDiet h1 = new HypercaloricDiet(160);
    }




    /**************** This is a passing test  ******************/

    @Test
    public void allergicToo50Pass(){
        Person person = new Person(
                new Food("Ice cream", 220, false, FoodType.Fat), new Food[]{new Food("Peanut", 90, true, FoodType.Carb), new Food("Cheese", 40, false, FoodType.Fat)}, 88.8f);
        FlexitarianDiet f1 = new FlexitarianDiet(90, "Eat less meat", new Food[]{new Food("Almonds", 90, true, FoodType.Carb),new Food("Milk", 40, false, FoodType.Fat) } , false );
        DietManager dietManager = new DietManager();

        boolean res = dietManager.areCompatible(person, f1);
        if (!res)
            throw new IllegalArgumentException("This diet is not compatible to this person.");
    }

    /******************* This test throws a exception ***************************/

    @Test
    public void allergicToo50fail(){
        Person person = new Person(
                new Food("Ice cream", 220, false, FoodType.Fat), new Food[]{new Food("Almonds", 90, true, FoodType.Carb), new Food("Milk", 40, false, FoodType.Fat)}, 88.8f);
        FlexitarianDiet f1 = new FlexitarianDiet(90, "Eat less meat", new Food[]{new Food("Almonds", 90, true, FoodType.Carb),new Food("Milk", 40, false, FoodType.Fat) } , false );
        DietManager dietManager = new DietManager();

        boolean res = dietManager.areCompatible(person, f1);
        if (!res)
            throw new IllegalArgumentException("This diet is not compatible to this person.");
    }



    /*********************** Requirements 3 ********************************/
    @Test
    public void durationTest(){
        LowcarbDiet low = new LowcarbDiet(70);
        low.dietDuration("Vegan Diet", new Date(2019,2,24),new Date(2020, 8, 29));

        HypercaloricDiet hyper = new HypercaloricDiet(70);
        hyper.dietDuration("Hypercaloric Diet", new Date(2020, 4, 10), new Date(2020, 10, 27));

        VeganDiet vegan = new VeganDiet(70);
        vegan.dietDuration("Vegan Diet", new Date(2012, 12, 10), new Date(2013, 6, 28));

        FlexitarianDiet flex = new FlexitarianDiet();
        flex.dietDuration("Flexitarian Diet", new Date(2021, 4, 14), new Date(2021, 9, 11));

        String resLow = low.writeDuraton();
        String resHyper = hyper.writeDuraton();
        String resVegan = vegan.writeDuraton();
        String resFlex = flex.writeDuraton();

        assertEquals("Vegan Diet lasts for 1 years, 6 months and 5 days.", resLow);
        assertEquals("Hypercaloric Diet lasts for 0 years, 6 months and 17 days.", resHyper);
        assertEquals("Vegan Diet lasts for 0 years, 6 months and 18 days.",resVegan);
        assertEquals("Flexitarian Diet lasts for 0 years, 4 months and 28 days.", resFlex);
    }

    @Test
    public void allowedFoodTest() {

        FlexitarianDiet flex = new FlexitarianDiet();
        flex.dietName("Flexitarian Diet");

        VeganDiet vegan = new VeganDiet(60);
        vegan.dietName("Vegan Diet");

        HypercaloricDiet hyper = new HypercaloricDiet(60);
        hyper.dietName("Hypercaloric Diet");

        LowcarbDiet lovC = new LowcarbDiet(60);
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




    /************************ Requirements 4 ***************************/



    @Test
    public void randomPersonRandomDiet(){
        Person person = new Person();
        HypercaloricDiet h1 = new HypercaloricDiet(80);
        DietManager dietManager = new DietManager();


        boolean res = dietManager.areCompatible(person, h1);
        if (!res)
            throw new IllegalArgumentException("This diet is not compatible to this person.");
    }

    /************************ Requirements 4b ***************************/

    //Må forandres på.
    @Test
    public void hypercaloricDiet() {
        Person person = new Person();
        HypercaloricDiet hyper = new HypercaloricDiet(60);
        DietManager manager = new DietManager();
        Food[] food;
        food = new Food[]{
                new Food("Rice", 130, true, FoodType.Carb),
                new Food("Salad", 200, true, FoodType.Recipe)
        };


        hyper.daysDuration = 60;
        hyper.purpose = "Test";

        hyper = manager.randomDiet(person, food);


        //isVegan: false if there is some non-vegan Food, true otherwise.
        //assertEquals(false, hyper.getIsVegan());

    }


    @Test
    public void test4B(){
        Person person = new Person();
        Food[] food = new Food[]{new Food()};
        DietManager newdiet = new DietManager();

        newdiet.randomDiet(person, food);

    }



    /**************************Tests********************************************/

    /*
    @Test
    public void test(){
     HypercaloricDiet hey = new HypercaloricDiet(80);
     hey.isVegan();
    }

    @Test
    public void reqb() {
        DietManager testmanager = new DietManager();

    }



     */



}





