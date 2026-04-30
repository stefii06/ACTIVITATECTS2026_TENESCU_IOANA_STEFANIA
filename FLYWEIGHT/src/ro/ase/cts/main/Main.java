package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.ManagerLinie;

public class Main {
    public static void main(String[] args) {

        Autobuz autobuz100 = new Autobuz("Mercedes", 1999, 50);
        Autobuz autobuz101 = new Autobuz("Lada", 1989, 60);
        Autobuz autobuz122 = new Autobuz("Dacia", 2002, 100);

        ManagerLinie managerLinie = new ManagerLinie();
        managerLinie.getLinie(101, "Romana", "Universitate").afiseazaNrMaximPasageriPeLinie(autobuz122);
        managerLinie.getLinie(101, "Otopeni", "Altceva").descriereLinie(autobuz101);





    }
}
