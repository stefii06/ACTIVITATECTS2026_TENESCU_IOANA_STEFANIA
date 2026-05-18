package ro.ase.cts.clase.Spital;


//clasa executant
public class Medic implements PersonalSpital{
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }



    //doar in executant afisam!!!!!!!!
    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Medicul " +this.nume+ " interneaza pacientul " +pacient.getNume());

    }
}
