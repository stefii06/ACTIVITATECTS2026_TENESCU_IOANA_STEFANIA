package ro.ase.cts.Spital;

import ro.ase.cts.Spital.clase.Rezultate;
import ro.ase.cts.Spital.clase.RezultateAbstract;
import ro.ase.cts.Spital.decorator.RezultateDecorator;
import ro.ase.cts.Spital.decorator.RezultateEmail;
import ro.ase.cts.Spital.decorator.RezultateOnline;

public class Main {
    public static void main(String[] args) {

        // FARA decorator - doar printare
        RezultateAbstract rezultat = new Rezultate();
        rezultat.obtinereRezultate("Ion Popescu");

        System.out.println("---");

        // CU decorator - printare + online
        RezultateOnline rezultatOnline = new RezultateOnline(rezultat);
        rezultatOnline.obtinereRezultate("Maria");
        rezultatOnline.obtinereDiferitaRezultate("Maria");


        System.out.println("---");

        // daca se revine la forma initiala - stergi decoratorul, codul vechi e intact
        RezultateAbstract rezultatInitial = new Rezultate();
        rezultatInitial.obtinereRezultate("Andrei Popa");

//decizie optiune rezultate la runtime
        int decizie=0;
        RezultateDecorator rezultateDecorator = null;
        if(decizie==1){
            rezultateDecorator = new RezultateOnline(rezultat);
        } else{
            rezultateDecorator = new RezultateEmail(rezultat);
        }

        System.out.println("---------------------");
        rezultateDecorator.obtinereRezultate("Katrina");
        rezultateDecorator.obtinereDiferitaRezultate("Katrina");


    }



}