package ro.ase.cts.decorator;

import ro.ase.cts.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecoractor implements NotaDePlataAbstract {
    private NotaDePlataAbstract notaDePlata;


    public NotaDePlataDecoractor(NotaDePlataAbstract notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeaza() {
        notaDePlata.printeaza();

    }


    public abstract void printeazaFelicitare();
}
