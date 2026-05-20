package ro.ase.cts.Spital.clase;

public class Rezultate implements RezultateAbstract{
    @Override
    public void obtinereRezultate(String numePacient) {
        System.out.println(" Rezultatele pacientului " + numePacient+ " au fost printate!");
    }
}
