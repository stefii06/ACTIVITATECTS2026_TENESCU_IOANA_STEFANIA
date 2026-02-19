package ro.ase.cts.main;

import ro.ase.cts.animale.FoodType;
import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Maimuta;
import ro.ase.cts.animale.Zebra;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.Zookeeper;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Zoo Baneasa", new Zookeeper("Ionel") );
        Lion lion= new Lion("Norocel", 20, FoodType.MEAT, 80);
        Zebra zebra = new Zebra("Steluta", 10, FoodType.GRASS, 60);

        zoo.addAnimal(lion);
        zoo.addAnimal(zebra);
        zoo.addAnimal(new Maimuta("Marcel", 6, FoodType.BANANE));

        zoo.feedAllANimals();

    }
}
