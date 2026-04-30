package ro.ase.cts.clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport {
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(this.mijlocDeTransport.getTipCursa()==TipCursa.NORMALA){
            this.mijlocDeTransport.opresteInStatie(statie);
        } else{
            System.out.println("Mijlocul de transport e intr-o cursa speciala, nu opreste in statiile STB!!!!!!!");
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
