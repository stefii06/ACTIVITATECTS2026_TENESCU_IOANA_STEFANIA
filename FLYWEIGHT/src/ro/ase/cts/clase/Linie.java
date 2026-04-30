package ro.ase.cts.clase;

public class Linie implements LinieAbstracta{
    private String primaStatie;
    private String ultimaStatie;
    private int nrLinie;

    protected Linie(String primaStatie, String ultimaStatie, int nrLinie) { //pt ca am pus protected , este un Singleton Registry
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.nrLinie = nrLinie;

    }



    @Override
    public void descriereLinie(Autobuz autobuz) {
        final StringBuilder sb = new StringBuilder("Linie{");
        sb.append("primaStatie='").append(primaStatie).append('\'');
        sb.append(", ultimaStatie='").append(ultimaStatie).append('\'');
        sb.append(", nrLinie=").append(nrLinie);
        sb.append('}');
        System.out.println(sb.toString()+  autobuz.toString());

    }

    @Override
    public void afiseazaNrMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.println(" Nr maxim de pasageri intre " +this.primaStatie+ " si "+ this.ultimaStatie+ " este " +autobuz.getNrLocuri());

    }
}
