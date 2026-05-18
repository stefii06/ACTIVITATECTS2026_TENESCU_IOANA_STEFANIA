package ro.ase.cts.clase.Spital;

public class Internare implements ICommand{

    private PersonalSpital medic;
    private Pacient pacient;


    public Internare(PersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.preluarePacient(pacient);

    }
}
