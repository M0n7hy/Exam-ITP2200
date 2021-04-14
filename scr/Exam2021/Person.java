package Exam2021;

public class Person {

    Food favoriteFood;
    Food[] allergies;
    Diet diet;
    Float weight;


    public Person() {
        favoriteFood = new Food("Tofu");
        allergies = new Food[]{new Food("Nuts")};
        weight = 55.9f;
        diet = new VeganDiet();
    }

    public Person(Food favoriteFood, Food[] allergies, Diet diet, Float weight ){
        this.favoriteFood = favoriteFood;
        this.allergies = allergies;
        this.diet = diet;
        this.weight = weight;
    }

    public Person(Food favoriteFood, Food[] allergies, Float weight ){
        this.favoriteFood = favoriteFood;
        this.allergies = allergies;
        this.weight = weight;
    }

}
