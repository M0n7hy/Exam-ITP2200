package Exam2021;

public class Person {
    Food favoriteFood;
    Food[] allergies;
    Diet diet;
    Float weight;



    public Person() {
        favoriteFood = new Food("Salmon", 190, true, FoodType.Protein);
        allergies = new Food[]{new Food("Almond", 90, true, FoodType.Fat),
                new Food("Milk", 80, false, FoodType.Fat),
                new Food("Oat milk", 44, true, FoodType.Fat),
                new Food("Seaweed",20 ,true,FoodType.Protein),
                new Food("peanut", 140, true, FoodType.Fat)};
        weight = 55.9f;
        diet = new FlexitarianDiet();
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


    public Food getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(Food favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Food[] getAllergies() {
        return allergies;
    }

    public void setAllergies(Food[] allergies) {
        this.allergies = allergies;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }


}
