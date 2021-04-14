package Exam2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DietTest {



/********************************* Requirements 1 *********************************/


    @Test
    public void isNotVegan(){
    VeganDiet vegan = new VeganDiet(200, "Vegan", new Food[]{new Food("Tofu", 150, true, FoodType.Protein), new Food("fish", 200, false, FoodType.Recipe),
            new Food("bacon", 300, false, FoodType.Carb), new Food("Lentils", 120, true, FoodType.Protein)}, true, 60);

    vegan.isVegan(vegan);

}


    /**************************** Requirements 2 *******************************/

    @Test
    public void underWeight(){
        LowcarbDiet lowCarb = new LowcarbDiet();
        lowCarb.LowcarbDiet(55);
    }

    @Test
    public void overWeight(){
        HypercaloricDiet h1 = new HypercaloricDiet(150);
        

    }

    @Test
    public void allergicToo50(){
        Person person = new Person(new Food("IceCream"), new Food[]{new Food("Almonds"), new Food("dairy")}, 88.8f);
        VeganDiet veganDiet = new VeganDiet(28, "Strength", new
                    Food[]{new Food("Almonds"), new Food("dairy")}, true, 66);
        DietManager dietManager = new DietManager();

        boolean res = dietManager.areCompatible(person, veganDiet);
        if (!res)
            throw new IllegalArgumentException("This diet is not compatible to this person.");
        }



    /*********************** Requirements 3 ********************************/

    @Test
    public void DietTest(){
        LowcarbDiet low = new LowcarbDiet();
        low.dietDuration("Vegan Diet", new Date(2019,2,24),new Date(2020, 8, 29));

        String res = low.writeDuraton();
        assertEquals("Vegan Diet lasts for 1 years, 6 months and 5 days.", res);
    }



    @Test
    public void Flexitest(){
        FlexitarianDiet flex = new FlexitarianDiet( "FlexitarianDiet" ,new Food[]{new Food("Fish"), new Food("Apple"), new Food("Salad"), new Food("Milk"), new Food("Rice")});

        String res = flex.writeAlowedFood();
        assertEquals("The following food is allowed in this FlexitarianDiet: Fish, Apple, Salad, Milk, Rice, ", res);

    }

    /************************ Requirements 4 ***************************/


    @Test
    public void randomPersonRandomDiet(){
        Person person = new Person();
        VeganDiet veganDiet = new VeganDiet();
        DietManager dietManager = new DietManager();


       boolean res = dietManager.areCompatible(person, veganDiet);
        if (!res)
        throw new IllegalArgumentException("This diet is not compatible to this person.");
    }







}



