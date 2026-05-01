package ro.ase.cts.main;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.NotaDePlataDecoractor;
import ro.ase.cts.decorator.NotaDePlataPrintatNouAn;

public class Main {
    public static void main(String[] args) {

        NotaDePlataAbstract notaDePlata = new NotaDePlata(150, "12.03.2026");

        int a=2; //aici e decizia pentru runtime, modifici a-ul ca sa decizi ce vrei
        NotaDePlataDecoractor notaDePlataDecoractor = null;

        if(a==1){
            notaDePlataDecoractor = new NotaDePlataPrintatNouAn(notaDePlata);

        }
        else {
            notaDePlataDecoractor = new NotaDePlata1Mai(notaDePlata);
        }


        notaDePlataDecoractor.printeaza();
        notaDePlataDecoractor.printeazaFelicitare();
    }
}
