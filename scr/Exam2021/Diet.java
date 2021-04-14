package Exam2021;

import java.util.ArrayList;
import java.util.Arrays;

import static Exam2021.Date.dayDiff;

abstract class Diet {


    int daysDuration;
    String purpose;
    Food[] allowedFood;
    boolean isVegan;

    String name;
    Date startDate;
    Date endDate;


    abstract void Diet();


    public String writeDuraton(){
        String Result = getName() + " lasts for " + getEndDate().yearSince(getStartDate())+ " years, " + getEndDate().monthSince(getStartDate())+ " months and "
                + dayDiff(getStartDate(), getEndDate()) +" days.";
        return Result;
    }

    public String writeAlowedFood(){

        String res ="";

        for (int i = 0; i < allowedFood.length; i++) {
            res += getAllowedFood()[i].name + ", ";

        }

        String Result = "The following food is allowed in this " + getName() + ": " + res;
        return Result;
    }
    public void dietDuration(String name, Date startDate, Date endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        writeDuraton();

    }


    public void isVegan(Diet d) {

        for (int i = 0; i < d.allowedFood.length; i++) {
            if (d.allowedFood[i].isVegan == false) {
                throw new IllegalArgumentException("This diet can not be Vegan.");
            }else{
                System.out.println("This diet can be Vegan");
            }

        }
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

    public void setAllowedFood(Food[] allowedFood) {
        this.allowedFood = allowedFood;
    }
}
