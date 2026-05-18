package ro.ase.cts.clase.Spital;

public class Tratare implements ICommand{

    private PersonalSpital asistenta;
    private Pacient pacient;


    public Tratare(PersonalSpital asistenta, Pacient pacient) {
        this.asistenta = asistenta;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        asistenta.preluarePacient(pacient);

    }
}
