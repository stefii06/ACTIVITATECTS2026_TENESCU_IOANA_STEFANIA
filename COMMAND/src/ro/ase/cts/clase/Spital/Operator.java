package ro.ase.cts.clase.Spital;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<ICommand> listaComenzi = new ArrayList<ICommand>();

    public void inregistreazaComenzi( ICommand comanda ){
        listaComenzi.add(comanda); //invocarea

    }

    public void executaComanda ( ){
      if(listaComenzi.size() > 0){
          listaComenzi.get(0).executa();
          listaComenzi.remove(0);

      }

    }



}
