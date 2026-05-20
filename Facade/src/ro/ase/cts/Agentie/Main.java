package ro.ase.cts.Agentie;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        PachetTuristic pachetTuristic = new PachetTuristic();
        Zbor zbor = new Zbor();

        Rezervare rezervare = new Rezervare(zbor,pachetTuristic,hotel);
        rezervare.creareRezervare("Mihail", "Paris", TipPachetTuristic.Activitati);
        System.out.println("==================================");
        rezervare.creareRezervare("Anastasia", "Madrid", TipPachetTuristic.Mancare);


    }
}
