package ro.ase.cts.animale;

public class Maimuta extends Animal{
    public Maimuta(String name, int age, FoodType foodType) {
        super(name, age, foodType);
    }

    @Override
    public void eat(String ZooKeeperName) {
        System.out.println(ZooKeeperName+" hraneste cu" + super.foodType+"pe" +super.name);

    }
}
