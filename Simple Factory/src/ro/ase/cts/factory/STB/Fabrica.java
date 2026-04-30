package ro.ase.cts.factory.STB;

import ro.ase.cts.clase.STB.Autobuz;
import ro.ase.cts.clase.STB.MijlocTransport;
import ro.ase.cts.clase.STB.Tramvai;
import ro.ase.cts.clase.STB.Troleibuz;

public class Fabrica {


    public MijlocTransport getMijlocTransport(TipTransport tipo, int numarRoti, String numarInmatriculare) {
        if(tipo == TipTransport.AUTOBUZ){
            return new Autobuz(numarRoti, numarInmatriculare);
        }
        if(tipo == TipTransport.TRAMVAI){
            return new Tramvai(numarRoti, numarInmatriculare);
        }
        if(tipo== TipTransport.TROLEIBUZ){
            return new Troleibuz(numarRoti, numarInmatriculare);
        }
        return null; // sau putem arunca o exceptie ca tipul nu e definit
    }
}
