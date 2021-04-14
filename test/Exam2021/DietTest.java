package Exam2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DietTest {


    @Test
    public void LowcarbTest(){
        LowcarbDiet lowCarb = new LowcarbDiet();
        lowCarb.LowcarbDiet(55);
        //lowCarb.LowcarbDiet(47); /*Test for exception*/

        VeganDiet vegan = new VeganDiet();
        vegan.minweightkg(65);
        //vegan.minweightkg(35); /*Test for exception*/

    }


    @Test
    public void durationTest(){
        LowcarbDiet low = new LowcarbDiet();
        low.dietDuration("Vegan Diet", new Date(2019,2,24),new Date(2020, 8, 29));

        HypercaloricDiet hyper = new HypercaloricDiet();
        hyper.dietDuration("Hypercaloric Diet", new Date(2020, 4, 10), new Date(2020, 10, 27));

        VeganDiet vegan = new VeganDiet();
        vegan.dietDuration("Vegen Diet", new Date(2012, 12, 10), new Date(2013, 6, 28));

        FlexitarianDiet flex = new FlexitarianDiet();
        flex.dietDuration("Flexitarian Diet", new Date(2021, 4, 14), new Date(2021, 9, 11));

        String resLow = low.writeDuraton();
        String resHyper = hyper.writeDuraton();
        String resVegan = vegan.writeDuraton();
        String resFlex = flex.writeDuraton();

        assertEquals("Vegan Diet lasts for 1 years, 6 months and 5 days.", resLow);
        assertEquals("Hypercaloric Diet lasts for 0 years, 6 months and 17 days.", resHyper);
        //assertEquals("Vegan Diet lasts for 0 years, 6 months and 18 days.",resVegan);
        //assertEquals("Flexitarian Diet lasts for 0 years, 4 months and 28 days", resFlex);
    }



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



