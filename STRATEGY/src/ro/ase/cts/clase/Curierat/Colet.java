package ro.ase.cts.clase.Curierat;

public class Colet {
    private int nrComanda;
    private String numeClient;
    private String dataPlasare;
    private ModLivrare modLivrare;

    public Colet(int nrComanda, String numeClient, String dataPlasare) {
        this.nrComanda = nrComanda;
        this.numeClient = numeClient;
        this.dataPlasare = dataPlasare;

    }


    public void setModLivrare(ModLivrare modLivrare) {
        this.modLivrare = modLivrare;
    }

    public void realizeazaLivrare(){

        System.out.println(" Clientul " +this.numeClient+ " a plasat comanda " +this.nrComanda+ " la data " + this.dataPlasare+ " si aceasta va fi livrata cu  " );
        modLivrare.livreaza();
    }



}
