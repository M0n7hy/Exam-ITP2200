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



    //abstract void Diet();



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

        for (int i = 0; i < allowedFood.length; i++) {
            if ( !allowedFood[i].isVegan){
                throw new IllegalArgumentException("This food is not vegan.");
            }

        }
    }


    public void isVeganIsNotVegan(){

        int number = 0;
        int count = 0;
        for (int i = 0; i < allowedFood.length; i++ ){
            if(allowedFood[i].isVegan != true){
              count++;
            }else if(allowedFood[i].isVegan == true){
                number++;
            }
        } if(count > 0 && isVegan == true){
            throw new IllegalArgumentException("This is not a vegan diet.");
        }else if(number == allowedFood.length && isVegan == false){
            throw new IllegalArgumentException("This is a vegan Diet!");
        }
    }

    public boolean allergicMethod(Person person, Diet diet){
        int count = 0;

        for (Food f: person.allergies) {
            for (Food food: diet.allowedFood) {
                if (f.name == food.name){
                    count++;
                }
            }

        }
        int dividedAllFoodLen = diet.allowedFood.length/2;
        if (count >= dividedAllFoodLen){
            return false;
        }else {
            return true;
        }
    }
    public void noMoreThenTwoCarb(){
        ArrayList<String> carbArray = new ArrayList<>();
        carbArray.add("Rice");
        carbArray.add("Bread");
        carbArray.add("Pasta");
        carbArray.add("Suger");
        carbArray.add("Potato");


        int count = 0;
        for (Food f: allowedFood){
            for (String s: carbArray){
                if (f.name.equals(s)){
                    count++;
                }
            }
        }
        if(count > 2){
            throw new IllegalArgumentException("There can only be 2 carb types inn the LowCarbDiet.");
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
