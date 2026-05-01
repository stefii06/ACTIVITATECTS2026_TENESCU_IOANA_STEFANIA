package ro.ase.cts.main;

import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.Sectie;
import ro.ase.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {

        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie("Secretariat", 10);
        Structura sectieManagement = new Sectie("Management", 20);


        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura();

        ((Departament) depSpital).stergeStructura(sectieSecretariat);
        ((Departament) depAdministrativ).adaugaStructura(sectieManagement);




    }
}
