package ro.ase.cts.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Sectiuni implements Optiune{
    private String nume;
    private List<Optiune> listaOptiuni;

    public Sectiuni(String nume) {
        this.nume = nume;
        this.listaOptiuni = new ArrayList<Optiune>(); //lista goala
    }

   public void adaugaOptiune( Optiune optiune ) {
        this.listaOptiuni.add(optiune);
   }

   public void stergeOptiune( Optiune optiune ) {
         listaOptiuni.add(optiune);
   }

   public Optiune getOptiune(int pozitie) {
        return this.listaOptiuni.get(pozitie);
   }

    @Override
    public void afiseaza() {
        System.out.println(" Nume sectiune: " + this.nume);
        for(Optiune optiune : this.listaOptiuni){
            optiune.afiseaza();
        }

    }
}
