package ro.ase.cts.main;

import ro.ase.cts.clase.STB.Autobuz;
import ro.ase.cts.clase.STB.ICommand;
import ro.ase.cts.clase.STB.Operator;
import ro.ase.cts.clase.STB.Plecare;

public class MainSTB {
    public static void main(String[] args) {


        Operator operator = new Operator();
        ICommand comanda1 = new Plecare(new Autobuz("Mercedes"), 205);
        ICommand comanda2 = new Plecare(new Autobuz("Audi"), 86);



        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(new Plecare(new Autobuz("Dacia"), 100) );

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();



    }
}
