package ro.ase.cts.Spital;

public class SpitalAsigurareDeViata implements SpitalAbstract{
    private SpitalAbstract spital;

    public SpitalAsigurareDeViata(SpitalAbstract spital) {
        this.spital = spital;
    }

    @Override
    public void interneaza(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            spital.interneaza(pacient);
        } else {
            System.out.println("Pacientul " +pacient.getNume()+ " nu are asigurare de sanatate!\n Internare refuzata");
        }

    }
}
