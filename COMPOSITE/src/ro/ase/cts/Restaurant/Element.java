package ro.ase.cts.Restaurant;

public class Element implements Optiune{
    private String nume;

    public Element(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza() {
        System.out.println("Optiune: " +this.nume);

    }
}
