package ro.ase.cts.Spital.AplicatieSpital;

public class Medicament {
    private String nume;
    private float pret;


    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament(){



        if(prezintaReteta()){
            System.out.println("Medicamentul " +nume+ " a fost achizitionat la pretul " + pret);
        } else {
            System.out.println("Nu a prezentat reteta !!!!");
        }

    }

    public boolean prezintaReteta() {
        return this.nume.length() > 10;

    }

    public String getNume() {
        return nume;
    }


}
