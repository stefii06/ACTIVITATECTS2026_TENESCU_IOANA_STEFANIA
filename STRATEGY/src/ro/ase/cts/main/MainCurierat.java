package ro.ase.cts.main;

import ro.ase.cts.clase.Curierat.Client;
import ro.ase.cts.clase.Curierat.Colet;
import ro.ase.cts.clase.Curierat.Express;

public class MainCurierat {
    public static void main(String[] args) {

        Colet colet = new Colet(1017, " Vasile Popescu", "12.05.2026");
        colet.setModLivrare(new Express());
        colet.realizeazaLivrare();


    }
}
