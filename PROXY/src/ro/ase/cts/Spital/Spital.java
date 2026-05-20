package ro.ase.cts.Spital;

import java.io.Serializable;

public class Spital implements SpitalAbstract {


    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume()+ " s-a internat cu succes!");

    }
}
