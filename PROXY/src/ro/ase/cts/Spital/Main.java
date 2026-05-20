package ro.ase.cts.Spital;

public class Main {
    public static void main(String[] args) {

        SpitalAbstract spital = new Spital();
        SpitalAbstract spitalAsigurare = new SpitalAsigurareDeViata(spital);


        Pacient pacient1 = new Pacient("Maria", true);
        Pacient pacient2 = new Pacient("Matei", false);

        spital.interneaza(pacient1);
        spital.interneaza(pacient2);
        System.out.println("----------------------");
        spitalAsigurare.interneaza(pacient1);
        spitalAsigurare.interneaza(pacient2);


    }
}
