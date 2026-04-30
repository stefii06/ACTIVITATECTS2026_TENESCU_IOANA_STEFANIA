package ro.ase.cts.clase;

public class Hotel {
    private String numeHotel;
    private int nrCamere;
    private int nrCamereOcupate;
    private static Hotel instance=null; //daca e null stiu direct ce initializare este(lazy sau thread)



    private Hotel(String numeHotel, int nrCamere, int nrCamereOcupate) {
        this.numeHotel = numeHotel;
        this.nrCamere = nrCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }



    public static synchronized Hotel getInstance(String numeHotel, int nrCamere, int nrCamereOcupate) {
        if (instance == null) {
            instance = new Hotel(numeHotel, nrCamere, nrCamereOcupate);
        }
        return instance;  // lazy initialisation
    }  // e recomandat sa blocam cat mai putin




    public void rezervaCamera(){
        if(this.nrCamereOcupate<this.nrCamere){
            nrCamereOcupate++;
            System.out.println(" Rezervarea a fost realizata");
        } else {
            System.out.println(" Rezervare respinsa, capacitatea maxima a fost atinsa");
        }
    }

    public void afiseazaDetaliiHotel(){
        StringBuilder builder = new StringBuilder();
        builder.append("Nume hotel: ").append(this.numeHotel);
        builder.append("\nNumar camere: ").append(this.nrCamere);
        builder.append("\nNumar camere ocupate: ").append(this.nrCamereOcupate);



//        System.out.println("Nume hotel: " + this.numeHotel);
//        System.out.println("Nr camera: " + this.nrCamere);
//        System.out.println("Nr camere ocupate: " + this.nrCamereOcupate);
    }



}
