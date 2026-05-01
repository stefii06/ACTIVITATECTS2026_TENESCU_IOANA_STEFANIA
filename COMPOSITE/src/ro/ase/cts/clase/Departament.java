package ro.ase.cts.clase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String numeDep;
    private List<Structura> subStructuri ;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.subStructuri = new ArrayList<Structura>(); // doar aloci spatiu listei => lista goala
    }

    public void adaugaStructura(Structura structura) {
        subStructuri.add(structura);
    }

    public void stergeStructura(Structura structura) {
        subStructuri.remove(structura);
    }

    public Structura getStructura(int pozitie){
        return subStructuri.get(pozitie);
    }




    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Nume dep: " + this.numeDep);
        for ( Structura structura : subStructuri){
            structura.afiseazaDetaliiStructura();
        }


    }
}
