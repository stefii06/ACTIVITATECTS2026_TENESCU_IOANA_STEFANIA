package ro.ase.cts.Agentie;

public class Rezervare {
    private Hotel hotel;
    private PachetTuristic pachetTuristic;
    private Zbor zbor;

    public Rezervare(Zbor zbor, PachetTuristic pachetTuristic, Hotel hotel) {
        this.zbor = zbor;
        this.pachetTuristic = pachetTuristic;
        this.hotel = hotel;
    }

    public void creareRezervare(String numeClient, String destinatie, TipPachetTuristic tipo){
        hotel.rezervaCamera(numeClient);
        pachetTuristic.rezervaPachetTuristic( tipo);
        zbor.rezervaZbor(destinatie);
    }




}
