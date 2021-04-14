package Exam2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DietTest {


    @Test
    public void LowcarbTest(){
        LowcarbDiet lowCarb = new LowcarbDiet();
        lowCarb.LowcarbDiet(55);

    }


    @Test
    public void DietTest(){
        LowcarbDiet low = new LowcarbDiet();
        low.dietDuration("Vegan Diet", new Date(2019,2,24),new Date(2020, 8, 29));

        String res = low.writeDuraton();
        assertEquals("Vegan Diet lasts for 1 years, 6 months and 5 days.", res);
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



