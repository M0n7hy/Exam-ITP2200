package Exam2021;

import Exam2021.Diet;

public class VeganDiet extends Diet {

    Float minWeightKg;

    public void minweightkg(float minWeightKg){
            this.minWeightKg = minWeightKg;
            if (minWeightKg > 50){
               ViganDiett();
            } else {
                throw new IllegalArgumentException("This person can not go on this diet");
            }
    }

    public void ViganDiett(){
        daysDuration = 1;
        purpose = "Vegan";
        isVegan = true;

    }


}
