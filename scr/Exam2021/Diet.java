package Exam2021;

import javax.print.DocFlavor;

import java.util.ArrayList;

import static Exam2021.Date.dayDiff;

abstract class Diet {


    int daysDuration;
    String purpose;
    Food[] allowedFood;
    boolean isVegan;

    String name;
    Date startDate;
    Date endDate;





//3.a.Write the duration of a diet in terms of years, months and days, e.g., “This VeganDiet lasts for 2 years, 3 months and 5 days”.
    public String writeDuraton(){
        String Result = getName() + " lasts for " + getEndDate().yearSince(getStartDate())+ " years, " + getEndDate().monthSince(getStartDate())+ " months and "
                + dayDiff(getStartDate(), getEndDate()) +" days.";
        return Result;
    }

    public String writeAllowedFood(){

        String tempFood = "";

        for (int i = 0; i < this.allowedFood.length; i++) {
            tempFood += " " + this.allowedFood[i].name + ",";
        }

        String Result = "The following food is allowed in the " + getName() + ":" + tempFood;
        return Result;
    }


    public void isVegan() {

        for (Food food : allowedFood) {
            if (!food.isVegan) {
                throw new IllegalArgumentException("There is food inn this diet that is not vegan.");
            }

        }
    }


    public void isVeganIsNotVegan(){

        int number = 0;
        int count = 0;
        for (Food food : allowedFood) {
            if (!food.isVegan) {
                count++;
            } else {
                number++;
            }
        }
        if(count > 0 && isVegan){
            throw new IllegalArgumentException("This diet can not be considered vegan.");
        }else if(number == allowedFood.length && !isVegan){
            throw new IllegalArgumentException("This is a vegan Diet!");
        }
    }


    public void noMoreThenTwoCarb(){

        int count = 0;
        for (Food food : allowedFood) {
            if (food.type == FoodType.Carb) {
                count++;
            }
        }
        if (count > 2){
            throw new IllegalArgumentException("There cant be more then 2 Carb types in LowCarbDiet.");
        }
    }


    public void dietName(String name) {
        this.name = name;
    }

    public void dietDuration(String name, Date startDate, Date endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        writeDuraton();

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Food[] getAllowedFood() {
        return allowedFood;
    }









}
