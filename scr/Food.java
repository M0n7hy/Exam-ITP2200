public class Food {
    String name;
    float caloriePer100g;
    Boolean isVegan;
    FoodType type;

    /********** Constructors **********/

    public Food() {
    }

    public Food(String name, float caloriePer100g, Boolean isVegan, FoodType type) {
        this.name = name;
        this.caloriePer100g = caloriePer100g;
        this.isVegan = isVegan;
        this.type = type;
    }

    /********** Getters & Setters **********/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCaloriePer100g() {
        return caloriePer100g;
    }

    public void setCaloriePer100g(float caloriePer100g) {
        this.caloriePer100g = caloriePer100g;
    }

    public Boolean getVegan() {
        return isVegan;
    }

    public void setVegan(Boolean vegan) {
        isVegan = vegan;
    }

    public FoodType getType() {
        return type;
    }

    public void setType(FoodType type) {
        this.type = type;
    }

}