package ro.ase.cts.Spital.decorator;

import ro.ase.cts.Spital.clase.RezultateAbstract;

public class RezultateOnline extends RezultateDecorator {


    public RezultateOnline(RezultateAbstract rezultate) {
        super(rezultate);
    }

    @Override
    public void obtinereDiferitaRezultate(String numePacient) {
        System.out.println(" Rezultatele pentru pacientul " + numePacient+ " pot fi obtinute si online!");

    }
}
