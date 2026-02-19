package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private Zookeeper zookeeper;
    private List<Animal> animals = new ArrayList<>();

    public Zoo() {}
    public Zoo(String name, Zookeeper zookeeper) {
        this.name = name;
        this.zookeeper = zookeeper;
        this.animals = new ArrayList<>();


    }

public void addAnimal(Animal animal){
        this.animals.add(animal);
}
public void feedAllANimals(){
        for(Animal animal : animals){
            this.zookeeper.feedAnimal(animal);

        }
}


}
