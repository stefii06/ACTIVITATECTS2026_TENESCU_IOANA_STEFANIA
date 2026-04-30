package ro.ase.cts.factory.SPITAL;

import ro.ase.cts.clase.Spital.Asistent;
import ro.ase.cts.clase.Spital.Brancardier;
import ro.ase.cts.clase.Spital.Medic;
import ro.ase.cts.clase.Spital.PersonalSpital;

public class SingletonFactorySpital {
    private static SingletonFactorySpital instance = null; //doar fabrica e obiect unic

    private SingletonFactorySpital() {}

    public static synchronized SingletonFactorySpital getInstance() {
         if (instance == null) {
             instance = new SingletonFactorySpital();
         }
         return instance;
    }

public PersonalSpital createSinglePersonalSpital( TipPersonal tipo, String nume, int varsta)  throws Exception{
        switch (tipo) {
            case TipPersonal.ASISTENT : return new Asistent( nume, varsta);
            case TipPersonal.MEDIC: return new Medic( nume, varsta);
            case TipPersonal.BRANCARDIER: return new Brancardier(nume, varsta);
            default: throw new Exception("Tip introdus invalid");
        }

}


}
