package ro.ase.cts.Agentie;

public class Client {

    private String nume;
    private int varsta;

    public Client(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }


    public String getNume() {
        return this.nume;
    }

    public int getVarsta() {
        return this.varsta;
    }
}
