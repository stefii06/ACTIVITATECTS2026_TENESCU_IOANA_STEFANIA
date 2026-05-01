package ro.ase.cts.clase;

import java.io.Serializable;

public class Sectie implements Structura {

    private String numeSectie;
    private int nrAngajati;

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Nume sectie : " + this.numeSectie+ "\n Nr angajati : " + this.nrAngajati);

    }
}
