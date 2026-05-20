package ro.ase.cts.Spital.decorator;

import ro.ase.cts.Spital.clase.RezultateAbstract;

public class RezultateEmail extends RezultateDecorator{
    public RezultateEmail(RezultateAbstract rezultate) {
        super(rezultate);
    }

    @Override
    public void obtinereDiferitaRezultate(String numePacient) {
        System.out.println(" Rezultatele pentru pacientul " +numePacient+ " pot fi trimise si pe mail!");


    }
}
