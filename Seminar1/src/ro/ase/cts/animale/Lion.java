package ro.ase.cts.animale;

public class Lion extends Animal {
    private float weight;

    public Lion(String name, int age, FoodType foodType, float weight) {
        super(name, age, foodType);
        this.weight = weight;
    }

    @Override
    public void eat(String ZooKeeperName) {
        System.out.println("Zookeeperul " + ZooKeeperName+ " hraneste leul " +super.name+ " cu " + super.foodType );
    }
}
