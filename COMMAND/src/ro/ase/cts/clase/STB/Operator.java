package ro.ase.cts.clase.STB;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<ICommand> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda( ICommand comanda ) {
        comenzi.add(comanda);
    }

    public void executaComanda(  ) {
        if(comenzi.size() > 0) {

            comenzi.get(0).pleacaInCursa();
            comenzi.remove(0);
        }
    }


}
