package ro.ase.cts.factory.SPITAL;

import ro.ase.cts.clase.Spital.Asistent;
import ro.ase.cts.clase.Spital.Brancardier;
import ro.ase.cts.clase.Spital.Medic;
import ro.ase.cts.clase.Spital.PersonalSpital;

public class FactorySpital {


    public PersonalSpital createPersonalSpital(TipPersonal tipo, String nume, int varsta) throws Exception{
        if ( tipo == TipPersonal.ASISTENT){
            return new Asistent( nume,  varsta);
        }
        if (tipo == TipPersonal.MEDIC){
            return new Medic( nume,  varsta);

        } if (tipo == TipPersonal.BRANCARDIER){
            return new Brancardier(nume,varsta);
        }
             return null;
//
//switch (tipo) {
//    case MEDIC: return new Medic(nume,varsta);
//    case ASISTENT: return new Asistent(nume,varsta);
//    case BRANCARDIER:return new Brancardier(nume, varsta);
//    default: throw new Exception("Unexpected value: " + tipo);
//}


    }


}
