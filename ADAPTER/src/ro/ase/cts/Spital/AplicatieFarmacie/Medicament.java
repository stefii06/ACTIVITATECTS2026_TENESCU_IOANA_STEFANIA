package ro.ase.cts.Spital.AplicatieFarmacie;

public class Medicament {
    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void cumparaMedicament()
    {
        System.out.println("Medicamentul " + nume + " a fost achizitionat la pretul " +pret );
    }





}
