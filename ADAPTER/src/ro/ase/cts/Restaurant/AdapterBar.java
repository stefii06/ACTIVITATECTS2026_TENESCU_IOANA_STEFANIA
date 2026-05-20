package ro.ase.cts.Restaurant;

public class AdapterBar extends SoftBar{
    private SoftBar softBar;


    public AdapterBar(int nrComanda, double pret, String numeOspatar, SoftBar softBar ) {
        super(nrComanda, pret, numeOspatar);
        this.softBar=softBar;
    }



}
