package ro.ase.cts.main;

import ro.ase.cts.clase.Spital.*;

public class Main {
    public static void main(String[] args) {


        PersonalSpital medic = new Medic("Vasile Ionescu" );
        PersonalSpital asistenta = new Asistenta( " Maria Popescu");


        Pacient pacient1 = new Pacient(" Matei ");
        Pacient pacient2 = new Pacient(" Ana ");

        ICommand comanda1 = new Internare(medic, pacient1); // aici stabilim cine si ce face, impachetam in command
        ICommand comanda2 = new Internare(asistenta, pacient2);

        //comanda1.executa();
        //comanda2.executa();

        Operator operator = new Operator();

        operator.inregistreazaComenzi(comanda1);
        operator.inregistreazaComenzi(comanda2);


        operator.executaComanda();

        operator.inregistreazaComenzi(new Tratare (asistenta, new Pacient("Cosmin")));
        operator.executaComanda();
        operator.executaComanda();



    }
}
