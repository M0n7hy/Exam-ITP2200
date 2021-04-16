package Exam2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DietTest {





    /********************************* Requirements 1 *********************************/
    @Test
    public void isVeganIsNotVegan(){
        VeganDiet vegan = new VeganDiet(200, "Vegan", new Food[]{new Food("Salmon", 100, false, FoodType.Protein), new Food("Almond", 50, true, FoodType.Fat)},true ,88);
        vegan.isVeganIsNotVegan();

    }

    @Test
    public void isVegan(){
        VeganDiet vegan = new VeganDiet(200, "Vegan", new Food[]{
                new Food("Tofu", 150, true, FoodType.Protein),
                new Food("fish", 200, false, FoodType.Recipe),
                new Food("bacon", 300, false, FoodType.Carb),
                new Food("Lentils", 120, true, FoodType.Protein)}, true, 60);

        vegan.isVegan();

    }


    /**************************** Requirements 2 *******************************/

    @Test
    public void maxTwoCarb(){
        LowcarbDiet lowCarb = new LowcarbDiet(60);
    }


    @Test
    public void underWeight(){
        LowcarbDiet lowCarb = new LowcarbDiet(55);
    }

    @Test
    public void overWeight(){
        HypercaloricDiet h1 = new HypercaloricDiet(150);
    }


    @Test
    public void allergicToo50(){
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
        assertEquals("The following food is allowed in the Vegan Diet: Tofu, Salad, Rice, Lentils, Bread, Nuts," ,resVegan);
        assertEquals("The following food is allowed in the Hypercaloric Diet: Chicken, Salad, Rice, Salmon, Bread, Steak,", resHyper);
        assertEquals("The following food is allowed in the Lowcarb Diet: Chicken, Salad, Rice, Salmon, Bread,", resLowCarb);

    }


    @Test
    public void flexitestAllowdFood(){
        FlexitarianDiet flex = new FlexitarianDiet( "FlexitarianDiet" ,new Food[]{new Food("Fish", 190, false, FoodType.Protein),
                new Food("Apple", 80, true, FoodType.Protein),
                new Food("Salad", 200, true, FoodType.Recipe),
                new Food("Milk", 70, false, FoodType.Fat),
                new Food("Rice", 220, false,FoodType.Carb)});

        String res = flex.writeAllowedFood();
        assertEquals("The following food is allowed in the FlexitarianDiet: Fish, Apple, Salad, Milk, Rice,", res);

    }

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

    /************************ Requirements 4 ***************************/


    @Test
    public void randomPersonRandomDiet(){
        Person person = new Person();
        VeganDiet veganDiet = new VeganDiet(80);
        DietManager dietManager = new DietManager();


        boolean res = dietManager.areCompatible(person, veganDiet);
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
    @Test
    public void test(){
     HypercaloricDiet hey = new HypercaloricDiet(80);
     hey.isVegan();
    }

    @Test
    public void reqb() {
        DietManager testmanager = new DietManager();

    }





}





