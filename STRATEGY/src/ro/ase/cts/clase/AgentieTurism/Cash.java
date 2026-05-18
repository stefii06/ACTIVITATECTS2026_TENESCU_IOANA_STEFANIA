package ro.ase.cts.clase;

public class Cash implements ModDePlata {



    @Override
    public void plateste(double suma) {
        System.out.println("Suma de "  +suma+  " lei a fost platita cu succes cu cardul!");
    }
}
