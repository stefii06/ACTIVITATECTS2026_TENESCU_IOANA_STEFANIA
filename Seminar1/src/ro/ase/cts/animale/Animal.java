package ro.ase.cts.animale;

public abstract class Animal {
    protected String name;
    public int age;
    protected    FoodType foodType;

    public Animal(String name, int age, FoodType foodType) {
        this.name = name;
        this.age = age;
        this.foodType = foodType;
    }

     public abstract void eat(String ZooKeeperName);
}
