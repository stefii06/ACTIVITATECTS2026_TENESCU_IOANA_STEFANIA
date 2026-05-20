package ro.ase.cts.Spital.decorator;

import ro.ase.cts.Spital.clase.Rezultate;
import ro.ase.cts.Spital.clase.RezultateAbstract;

public abstract class RezultateDecorator implements RezultateAbstract {
    private RezultateAbstract rezultate;


    public RezultateDecorator(RezultateAbstract rezultate) {
        this.rezultate = rezultate;
    }

    @Override
    public void obtinereRezultate(String numePacient) {
        rezultate.obtinereRezultate(numePacient);

    }

    public abstract void obtinereDiferitaRezultate(String numePacient);

}
