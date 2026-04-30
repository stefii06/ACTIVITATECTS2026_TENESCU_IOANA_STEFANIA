import clase.Medic;
import clase.Pacient;
import clase.ReceptieSpital;
import clase.Salon;

public static void main(String[] args) {
    Pacient pacient1 = new Pacient("Gigel", 5);
    Medic medic1 = new Medic();
    Salon salon = new Salon();

    if(medic1.areTrimetere(pacient1)){
        int patLiber= salon.getPatLiber();
        if(patLiber != -1){
            System.out.println("Pacientul " +pacient1.getNume()+ " va fi internat in patul " + patLiber);
            salon.ocupaPat(patLiber);
        }


        Pacient pacient2 = new Pacient("Mihai", 3);
        Pacient pacient3 = new Pacient("George", 2);
        Pacient pacient4 = new Pacient("Dan", 5);

        ReceptieSpital receptieSpital1 = new ReceptieSpital(medic1, salon);
        receptieSpital1.interneazaPacient(pacient2);
        receptieSpital1.interneazaPacient(pacient3);
        receptieSpital1.interneazaPacient(pacient4);


    }



}
