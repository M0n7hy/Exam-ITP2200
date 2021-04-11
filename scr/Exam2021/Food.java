package Exam2021;

import java.util.ArrayList;

public class Food {
    String name;
    float caloriePer100g;
    Boolean isVegan;
    FoodType type;

    public Food(String name){
        this.name = name;
    }

    public Food(String name, float caloriePer100g, Boolean isVegan, FoodType type){
        this.name = name;
        this.caloriePer100g = caloriePer100g;
        this.isVegan = isVegan;
        this.type = type;
    }




}