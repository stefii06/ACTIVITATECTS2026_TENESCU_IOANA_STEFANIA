package ro.ase.cts.Spital;

public class Pacient {
    private String nume;
    private boolean areAsigurare;


    public Pacient(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return this.nume;
    }

    public boolean isAreAsigurare() {
        return this.areAsigurare;
    }
}
