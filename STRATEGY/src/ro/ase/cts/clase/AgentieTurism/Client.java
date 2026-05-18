package ro.ase.cts.clase;

public class Client {
    private String nume;
    private ModDePlata strategie;

    public Client(String nume, ModDePlata strategie) {
        this.nume = nume;
        this.strategie = strategie;
    }



    public void realizeazaPlata(double suma) {
        strategie.plateste(suma);

    }

}
