package ro.acs.cts.main;

import ro.acs.cts.Avion.avion1.AbstractBilet;
import ro.acs.cts.Avion.avion1.Bilet;
import ro.acs.cts.Avion.avion1.BuilderBilet;
import ro.acs.cts.Avion.avion2.AbstractBilet2;
import ro.acs.cts.Avion.avion2.Bilet2;
import ro.acs.cts.Avion.avion2.BuilderBilet2;

public class MainAvion {

    public static void main(String[] args) {


        AbstractBilet builder = new BuilderBilet("Catalin", "Madeira");
        Bilet bilet1 = builder.set_LocGeam(true).set_bagajCala(true).build();
        Bilet bilet2 = builder.set_LocGeam(true).set_bagajCala(false).set_prioritateImbarcare(true).build();

        System.out.println(bilet1.toString());
        System.out.println(bilet2.toString());




        AbstractBilet2 builder2 = new BuilderBilet2();
        builder2.set_bagajCala(true);
        builder2.set_LocGeam(true);
        Bilet2 bilet3 = builder2.build("Maria", "Paris");
        Bilet2 bilet4 = builder2.build("Stefania", "Paris");
        System.out.println(bilet3.toString());
        System.out.println(bilet4.toString());

        bilet3.setBagajCala(false);
        System.out.println(bilet3.toString());
        System.out.println(bilet4.toString());

    }



}
