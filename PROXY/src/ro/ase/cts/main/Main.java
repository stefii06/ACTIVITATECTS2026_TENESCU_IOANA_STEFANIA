package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {

        MijlocDeTransport  autobuz1 = new Autobuz(20, 168);
        MijlocDeTransport  autobuz2 = new Autobuz(0, 100);

        Statie statie1 = new Statie("Piata romana", 10);
        Statie statie2 = new Statie("Universitate", 0);

        autobuz1.opresteInStatie(statie1);
        autobuz2.opresteInStatie(statie2);

        System.out.println("");
        MijlocDeTransport autobuzDeNoapte1= new AutobuzDeNoapte(autobuz1);
        autobuzDeNoapte1.opresteInStatie(statie1);
        autobuzDeNoapte1.opresteInStatie(statie2);

        System.out.println("");

        MijlocDeTransport autobuzDeNoapte2= new AutobuzDeNoapte(autobuz2);
        autobuzDeNoapte2.opresteInStatie(statie1);
        autobuzDeNoapte2.opresteInStatie(statie2);


        System.out.println("");

        MijlocDeTransport autobuz110 = new Autobuz(50, 110, TipCursa.SPECIALA);
        MijlocDeTransport autobuzCursaSpeciala = new AutobuzCursaSpeciala(autobuz110);
        MijlocDeTransport autobuzCursaSpeciala168 = new AutobuzCursaSpeciala(autobuz1);
        autobuzCursaSpeciala.opresteInStatie(statie1);
        autobuzCursaSpeciala168.opresteInStatie(statie1);




    }
}
