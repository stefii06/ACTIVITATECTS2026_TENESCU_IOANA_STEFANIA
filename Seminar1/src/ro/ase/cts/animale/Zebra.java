package ro.ase.cts.animale;

public class Zebra extends Animal{
    private float weight;

    public Zebra(String name, int age, FoodType foodType, float weight) {
        super(name, age, foodType);
        this.weight = weight;
    }

    @Override
    public void eat(String ZooKeeperName) {
        System.out.println("Zookeeperul " + ZooKeeperName+ " hraneste zebra " +super.name+ " cu " + super.foodType );
    }
}


