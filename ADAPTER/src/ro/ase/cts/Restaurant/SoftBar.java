package ro.ase.cts.Restaurant;

public class SoftBar {
    private int nrComanda;
    private double pret;
    private String numeOspatar;

    public SoftBar(int nrComanda, double pret, String numeOspatar) {
        this.nrComanda = nrComanda;
        this.pret = pret;
        this.numeOspatar = numeOspatar;
    }

    public void printeazaFactura(){
        System.out.println(" Factura pentru comanda:  " + this.nrComanda+ " servita de " +this.numeOspatar+ " in valoare de " + this.pret );


    }




}
