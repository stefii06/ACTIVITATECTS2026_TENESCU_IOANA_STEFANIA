package ro.acs.cts.main;

import ro.acs.cts.Restaurant.resto02.AbstractRezervare;
import ro.acs.cts.Restaurant.resto02.BuilderRezervare02;
import ro.acs.cts.Restaurant.resto02.Rezervare;

public class MainRestaurant {
    public static void main(String[] args) {


        AbstractRezervare builderResto02 = new BuilderRezervare02();
        builderResto02.setAsezareGeam(true);
        builderResto02.setMuzicaAmbientala(true);

        Rezervare rezervare01= builderResto02.build("Maxime");
        Rezervare rezervare02= builderResto02.build("Anabelle");

        AbstractRezervare builderResto02_02 = new BuilderRezervare02();
        builderResto02_02.setAsezareGeam(true);
        builderResto02_02.setMuzicaAmbientala(true);

        Rezervare rezervare03 = builderResto02_02.build("Emanuel");
        Rezervare rezervare04 = builderResto02_02.build("Victor");

        System.out.println(rezervare01.toString());
        System.out.println(rezervare02.toString());
        System.out.println(rezervare03.toString());
        System.out.println(rezervare04.toString());

        rezervare04.setScaune_ergonomice(true);
        System.out.println(rezervare04.toString());
    }
}
