package ro.ase.cts.Restaurant;

public class SoftBucatarie {

    private int nrComanda;
    private double pret;
    private String numeOspatar;


    public SoftBucatarie(int nrComanda, double pret, String numeOspatar) {
        this.nrComanda = nrComanda;
        this.pret = pret;
        this.numeOspatar = numeOspatar;
    }


    public void scoateFactura(){
        System.out.println(" A fost realizata factura pentru comanda:  " + this.nrComanda+ " servita de " +this.numeOspatar+ " in valoare de " + this.pret );


    }



}
