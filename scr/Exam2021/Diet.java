package Exam2021;

import static Exam2021.Date.dayDiff;

abstract class Diet {

    int daysDuration;
    String purpose;
    Food[] allowedFood;
    boolean isVegan;

    private String name;
    private Date startDate;
    private Date endDate;


    /*This will write the duration of a diet (returns String).  Criteria 3.A*/
    public String writeDuration(){
        String Result = getName() + " lasts for " + getEndDate().yearSince(getStartDate())+ " years, " + getEndDate().monthSince(getStartDate())+ " months and "
                + dayDiff(getStartDate(), getEndDate()) +" days.";
        return Result;
    }

    /*This writes the allowed food within the diet (returns String).  Criteria 3.B*/
    public String writeAllowedFood(){
        String tempFood = "";
            for (int i = 0; i < this.allowedFood.length; i++) {
                tempFood += " " + this.allowedFood[i].name + ",";
            }
            String Result = "The following food is allowed in the " + getName() + ":" + tempFood;
                return Result;
    }

    /*This makes sure theres no non-vegan food in the diet. Criteria 1.C, 1.A*/
    public boolean isVegan() {
        for (Food food : allowedFood) {
            if (!food.isVegan && isVegan) {
                return false;
            }
        }
        return true;
    }

    /*This Method corresponds with criteria 1.A and 1.B. This method calls upon isVegan() to make sure a vegan diet doesn't contain non-vegan food,
    and the diet is marked ass vegan if it contains only vegan food.  */
    public boolean isVeganIsNotVegan(){
        int count = 0;
        for (Food food : allowedFood) {
            if (food.isVegan) {
                count++;
            }
        }
        if(!isVegan()){
            throw new IllegalArgumentException("This diet can not be considered vegan.");
        }else if(count == allowedFood.length && !isVegan){
            throw new IllegalArgumentException("This is considered a vegan Diet!");
        }
        return true;
    }

    /*This method makes sure there is no more then 2 carbs in the lowCarbDiet. Criteria 1.E*/
    public boolean noMoreThenTwoCarb(){
        int count = 0;
        for (Food food : allowedFood) {
            if (food.type == FoodType.Carb) {
                count++;
            }
        }
        if (count > 2){
            throw new IllegalArgumentException("There can't be more then 2 Carb types in LowCarbDiet.");
        }
        return true;
    }

    /*This corresponds to the writeDuration method. Criteria 3.A */
    public void dietDuration(String name, Date startDate, Date endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        writeDuration();
    }

    public void dietName(String name) {
        this.name = name;
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
