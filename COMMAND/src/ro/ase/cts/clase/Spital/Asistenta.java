package ro.ase.cts.clase.Spital;

// clasa executant
public class Asistenta implements PersonalSpital{
    private String nume;

    public Asistenta(String nume) {
        this.nume = nume;
    }



    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistenta " +this.nume+ " va trata imediat pacientul " +pacient.getNume());

    }
}
