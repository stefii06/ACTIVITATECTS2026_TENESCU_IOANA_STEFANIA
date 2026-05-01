package ro.ase.cts.clase;

public class NotaDePlata implements NotaDePlataAbstract{
    private float suma;
    private String data;


    public NotaDePlata(float suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {
        System.out.println(" Nota de plata in valoare de " + suma+ " a fost platita la data de " + data);

    }
}
