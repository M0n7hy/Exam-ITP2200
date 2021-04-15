package Exam2021;

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

    public String writeAllowedFood(){

        String tempFood = "";

        for (int i = 0; i < this.allowedFood.length; i++) {
            tempFood += " " + this.allowedFood[i].name + ",";
        }

        String Result = "The following food is allowed in the " + getName() + ":" + tempFood;
        return Result;
    }


    public String writeAlowedFood2(){

        String res ="";

        for (int i = 0; i < allowedFood.length; i++) {
            res += getAllowedFood()[i].name + ", ";

        }

        String Result = "The following food is allowed in this " + getName() + ": " + res;
        return Result;
    }

    /*
    public void isVegan(Diet d) {

        for (int i = 0; i < d.allowedFood.length; i++) {
            if (!d.allowedFood[i].isVegan) {
                throw new IllegalArgumentException("This diet can not be Vegan.");
            }else{
                System.out.println("This diet can be Vegan");
            }

        }
    }
    */

    //1a.If a diet contains any non-vegan food, it is considered not vegan (i.e., isVegan = false).
    //1b.If a diet contains only vegan food, it is considered vegan, even if it is not a VeganDiet (e.g., it could be a LowCarbDiet).
    //1c.A VeganDiet cannot contain non-vegan food.
    public void isVegan() {

        for (int i = 0; i < allowedFood.length; i++) {
            if ( !allowedFood[i].isVegan){
                throw new IllegalArgumentException("This food is not vegan.");
            }

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

    public void setAllowedFood(Food[] allowedFood) {
        this.allowedFood = allowedFood;
    }







}
