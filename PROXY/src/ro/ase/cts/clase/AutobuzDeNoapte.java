package ro.ase.cts.clase;

public class AutobuzDeNoapte implements MijlocDeTransport {
    private MijlocDeTransport mijlocDeTransport;


    public AutobuzDeNoapte(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(this.mijlocDeTransport.getNrPasageri()>0 || statie.getNrPersoane()>0) {
            this.mijlocDeTransport.opresteInStatie(statie);
        } else {
            System.out.println("Mijlocul de transport nu opreste in statia "  +statie.getNume());
        }

    }

    @Override
    public int getNrPasageri() {
       return this.mijlocDeTransport.getNrPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.mijlocDeTransport.getTipCursa();
    }
}
