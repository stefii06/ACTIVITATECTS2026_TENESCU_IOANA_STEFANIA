package ro.ase.cts.Spital;

import ro.ase.cts.Spital.AplicatieSpital.Medicament;

public class AdapterSpital extends ro.ase.cts.Spital.AplicatieFarmacie.Medicament {
    private Medicament medicament;




    public AdapterSpital( float pret, Medicament medicament) {
        super(medicament.getNume(), pret);
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
       medicament.achizitioneazaMedicament();
    }


}
