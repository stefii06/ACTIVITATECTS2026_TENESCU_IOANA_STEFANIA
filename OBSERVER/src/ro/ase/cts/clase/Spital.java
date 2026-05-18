package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{

    private String nume;
    private List<Pacient> pacientList = new ArrayList<Pacient>();

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Pacient pacient : pacientList) {
            pacient.receptioneazaNotificare(mesaj + " de la spitalul " +this.nume);
        }

    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        pacientList.add(pacient);

    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        pacientList.remove(pacient);

    }

    public void notificaVirus(){
        trimiteMesaj(" Exista un virus nou in oras!");
    }

    public void notificaEpidemie(){
        trimiteMesaj(" Exista o epidemie nou in oras!");
    }

}
