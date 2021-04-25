package Exam2021;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExtraTest {


    /*Extra feature that returns a string value, Unit test */
  @Test
  public void recommendedDiet() {

      Person p1 = new Person(new Food("Strawberry", 90, true, FoodType.Carb), new Food[]{
              new Food("Seafood", 250, false, FoodType.Protein),
              new Food("Wheat", 100, true, FoodType.Carb)}, 90.0f);
      DietManager d1 = new DietManager();

      String res = d1.recommendedDiet(p1);
      assertEquals("I recommend you start on a vegan diet.", res);

  }




}
