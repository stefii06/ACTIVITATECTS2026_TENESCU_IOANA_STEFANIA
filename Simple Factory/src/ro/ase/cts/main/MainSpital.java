package ro.ase.cts.main;

import ro.ase.cts.clase.Spital.PersonalSpital;
import ro.ase.cts.factory.SPITAL.FactorySpital;
import ro.ase.cts.factory.SPITAL.SingletonFactorySpital;
import ro.ase.cts.factory.SPITAL.TipPersonal;

public class MainSpital {
    public static void main(String[] args) throws Exception {


        FactorySpital spital = new FactorySpital();
        SingletonFactorySpital singletonFactorySpital = SingletonFactorySpital.getInstance();

        PersonalSpital asistentCentral = singletonFactorySpital.createSinglePersonalSpital(TipPersonal.ASISTENT, "Sergiu", 55);
        PersonalSpital asistentCentral2 = singletonFactorySpital.createSinglePersonalSpital(TipPersonal.ASISTENT, "Marin", 60);

        asistentCentral.afisareDescriere();
        asistentCentral2.afisareDescriere();



        PersonalSpital asistent = null;
        PersonalSpital medic = null;
        PersonalSpital brancardier = null;
        PersonalSpital brancardier2 = null;

            asistent = spital.createPersonalSpital(TipPersonal.ASISTENT, "Gica", 39);
            medic = spital.createPersonalSpital(TipPersonal.MEDIC, "Maricica", 27);
            brancardier = spital.createPersonalSpital(TipPersonal.BRANCARDIER, "Eugen", 38);




        asistent.afisareDescriere();
        medic.afisareDescriere();
        brancardier.afisareDescriere();


    }
}
