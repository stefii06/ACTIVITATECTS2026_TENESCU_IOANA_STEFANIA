package ro.ase.cts.Spital;

import ro.ase.cts.Spital.AplicatieSpital.Medicament;

public class Main {

    public  static void procurareMedicament(ro.ase.cts.Spital.AplicatieFarmacie.Medicament medFarmacie){
        medFarmacie.cumparaMedicament();

    }

    public static void main(String[] args) {



        Medicament medicamentSpital = new Medicament("Paracetamol", 18);
        ro.ase.cts.Spital.AplicatieFarmacie.Medicament medicamentFarmacie =  new ro.ase.cts.Spital.AplicatieFarmacie.Medicament("Nurofen", 25);

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();

        Medicament medicamentSpital2 = new Medicament("Nospa", 25);
        AdapterSpital adapterMedicament = new AdapterSpital(30, medicamentSpital2);

        procurareMedicament(adapterMedicament);


    }
}
